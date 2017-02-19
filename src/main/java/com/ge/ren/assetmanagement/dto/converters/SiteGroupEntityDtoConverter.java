/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.ren.assetmanagement.domain.SiteGroup;
import com.ge.ren.assetmanagement.dto.SiteGroupDto;

/**
 *
 * @author 502585286
 */
@Service("SiteGroupEntityDtoConverter")
public class SiteGroupEntityDtoConverter implements IEntityDtoConverter<SiteGroup, SiteGroupDto> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SiteGroupDto convertDomainEntityToDto(SiteGroup siteGroup) {
		SiteGroupDto siteGroupDto = modelMapper.map(siteGroup, SiteGroupDto.class);
		return siteGroupDto;
	}

	@Override
	public SiteGroup convertDtoToDomainEntity(SiteGroupDto siteGroupDto) {
		SiteGroup siteGroup = modelMapper.map(siteGroupDto, SiteGroup.class);
		return siteGroup;
	}

}
