/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.service;

import java.util.List;

import com.ge.ren.assetmanagement.dto.AssetComponentDto;
import com.ge.ren.assetmanagement.dto.AssetDto;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;
import com.ge.ren.assetmanagement.dto.CommonCodeDto;
import com.ge.ren.assetmanagement.dto.GroupSettingDto;
import com.ge.ren.assetmanagement.dto.SiteGroupDto;
import com.ge.ren.assetmanagement.dto.TimezoneDetailDto;

/**
 *
 * @author Yessesvy
 */
public interface IAssetManagementService {

    List<AssetLocationDto> retrieveLocationDetails(Long assetTypeId);

    List<AssetSectionDto> retrieveSectionDetails(Long locationId);

    List<AssetComponentDto> retrieveComponentDetails(Long sectionId);

    List<AssetTypeDto> retrieveAssetTypeDetails(Long assetTypeId);
    
    List<AssetDto> retrieveAssetDetails(Long siteGroupId);
    
    List<CommonCodeDto> findAllCodes(String dropdownType, String LanguageCode);
    
    CommonCodeDto findCode(String dropdownType, String dropdownCode, String LanguageCode);
    
    TimezoneDetailDto getTimezoneByTimezoneName(String timezoneName);
    
    List<TimezoneDetailDto> getTimezoneDetail();

    SiteGroupDto updateSiteSettings(SiteGroupDto siteGroupDto);
    
    SiteGroupDto getSiteGroup(Long siteGroupId);
    
    GroupSettingDto getGroupSetting(Long groupSettingId);
    
}
