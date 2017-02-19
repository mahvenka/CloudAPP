/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.ren.assetmanagement.domain.SiteGroup;
import com.ge.ren.assetmanagement.dto.AssetComponentDto;
import com.ge.ren.assetmanagement.dto.AssetDto;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;
import com.ge.ren.assetmanagement.dto.CommonCodeDto;
import com.ge.ren.assetmanagement.dto.GroupSettingDto;
import com.ge.ren.assetmanagement.dto.SiteGroupDto;
import com.ge.ren.assetmanagement.dto.TimezoneDetailDto;
import com.ge.ren.assetmanagement.dto.converters.AssetEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.AssetTypeEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.CommonCodeEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.ComponentEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.GroupSettingEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.LocationEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.SectionEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.SiteGroupEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.TimezoneDetailEntityDtoConverter;
import com.ge.ren.assetmanagement.repository.GroupSettingRepository;
import com.ge.ren.assetmanagement.repository.IAssetRepository;
import com.ge.ren.assetmanagement.repository.IAssetTypeRepository;
import com.ge.ren.assetmanagement.repository.ICommonCodeRepository;
import com.ge.ren.assetmanagement.repository.IComponentsRepository;
import com.ge.ren.assetmanagement.repository.ILocationsRepository;
import com.ge.ren.assetmanagement.repository.ISectionsRepository;
import com.ge.ren.assetmanagement.repository.SiteGroupRepository;
import com.ge.ren.assetmanagement.repository.TimezoneDetailRepository;
import com.ge.ren.assetmanagement.service.IAssetManagementService;
import com.ge.ren.assetmanagement.util.AssetManagementUtil;
import com.ge.ren.assetmanagement.validators.AssetManagementValidators;

/**
 *
 * @author Yessesvy
 */
@Component
public class AssetManagementService implements IAssetManagementService {

    @Autowired
    private IAssetTypeRepository assetTypeRepo;

    @Autowired
    private IAssetRepository assetRepo;

    @Autowired
    private AssetTypeEntityDtoConverter assetTypeEntityDtoConverter;

    @Autowired
    private AssetEntityDtoConverter assetConverter;

    @Autowired
    private ILocationsRepository locationsRepo;
    
    @Autowired
    private AssetManagementValidators assetManagementValidators;

    @Autowired
    private ISectionsRepository sectionsRepo;

    @Autowired
    private IComponentsRepository componentsRepo;
    
    @Autowired
    private TimezoneDetailRepository timezoneDetailRepo;
    
    @Autowired
    private SiteGroupRepository siteGroupRepository;
    
    @Autowired
    private GroupSettingRepository groupSettingRepository;
    
    @Autowired
    private TimezoneDetailEntityDtoConverter timezoneDetailEntityDtoConverter;
    
    @Autowired
    private SiteGroupEntityDtoConverter siteGroupEntityDtoConverter;
    
    @Autowired
    private GroupSettingEntityDtoConverter groupSettingEntityDtoConverter;

    @Autowired
    private LocationEntityDtoConverter locationEntityDtoConverter;

    @Autowired
    private SectionEntityDtoConverter sectionEntityDtoConverter;

    @Autowired
    private ComponentEntityDtoConverter componentEntityDtoConverter;
    
    @Autowired
    private ICommonCodeRepository commonCodeRepo;
    
    @Autowired
    private CommonCodeEntityDtoConverter commonCodeConverter;

    @Override
    public List<AssetTypeDto> retrieveAssetTypeDetails(Long assetTypeId) {
	return assetTypeRepo.findAll().stream().map(assetTypeEntityDtoConverter::convertDomainEntityToDto)
		.collect(Collectors.toList());
    }

    @Override
    public List<AssetLocationDto> retrieveLocationDetails(Long assetTypeId) {
	return locationsRepo.findByAssetType_AssetTypeId(assetTypeId).stream().map(locationEntityDtoConverter::convertDomainEntityToDto)
		.collect(Collectors.toList());
    }

    @Override
    public List<AssetSectionDto> retrieveSectionDetails(Long locationId) {
	return sectionsRepo.findByAssetLocation_Id(locationId).stream().map(sectionEntityDtoConverter::convertDomainEntityToDto)
		.collect(Collectors.toList());
    }

    @Override
    public List<AssetComponentDto> retrieveComponentDetails(Long sectionId) {
	return componentsRepo.findByAssetSection_Id(sectionId).stream().map(componentEntityDtoConverter::convertDomainEntityToDto)
		.collect(Collectors.toList());
    }

    @Override
    public List<AssetDto> retrieveAssetDetails(Long siteGroupId) {
	return assetRepo.findBySiteDetail_SiteGroup_SiteGroupId(siteGroupId).stream()
		.map(assetConverter::convertDomainEntityToDto).collect(Collectors.toList());
    }

	@Override
	public List<CommonCodeDto> findAllCodes(String dropdownType, String languageCode) {
		return commonCodeRepo.findByDropdownTypeAndLanguageCode(dropdownType, languageCode).stream()
		.map(commonCodeConverter::convertDomainEntityToDto).collect(Collectors.toList());
	}

	@Override
	public CommonCodeDto findCode(String dropdownType, String dropdownCode, String languageCode) {
		return commonCodeConverter.convertDomainEntityToDto(commonCodeRepo.findByDropdownTypeAndDropdownCodeAndLanguageCode(dropdownType, dropdownCode, languageCode));
	}

	@Override
	public TimezoneDetailDto getTimezoneByTimezoneName(String timezoneName) {
		return timezoneDetailEntityDtoConverter.convertDomainEntityToDto(timezoneDetailRepo.findByTimezoneName(timezoneName));
	}
	
	@Override
	public List<TimezoneDetailDto> getTimezoneDetail() {
	    return 	timezoneDetailRepo.findAll().stream().map(timezoneDetailEntityDtoConverter::convertDomainEntityToDto).collect(Collectors.toList());
	}
	
	@Override
	public SiteGroupDto updateSiteSettings(SiteGroupDto siteGroupDto) {
		
		if(AssetManagementUtil.isNull(siteGroupDto)) {
			return null;
		}
				
		// Validate the input siteGroupDto
  		if (AssetManagementUtil.isNotNull(assetManagementValidators.validateSiteSettings(siteGroupDto).getErrorDetails())) {
  			return siteGroupDto;
  		}
		
		SiteGroup siteGroup = siteGroupRepository.save(siteGroupEntityDtoConverter.convertDtoToDomainEntity(siteGroupDto));
		if(AssetManagementUtil.isNotNull(siteGroup)) {
		   siteGroupDto.setSiteGroupId(siteGroup.getSiteGroupId());
		}
		return siteGroupDto;
	}
	
	@Override
	public SiteGroupDto getSiteGroup(Long siteGroupId) {
		return siteGroupEntityDtoConverter.convertDomainEntityToDto(siteGroupRepository.findBySiteGroupId(siteGroupId));
	}
	
	@Override
	public GroupSettingDto getGroupSetting(Long groupSettingId) {
		return groupSettingEntityDtoConverter.convertDomainEntityToDto(groupSettingRepository.findByGroupSettingId(groupSettingId));
	}
	
}
