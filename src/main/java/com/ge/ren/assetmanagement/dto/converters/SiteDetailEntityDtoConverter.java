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

import com.ge.ren.assetmanagement.domain.SiteDetail;
import com.ge.ren.assetmanagement.dto.SiteDetailDto;

/**
 *
 * @author 502585286
 */
@Service("SiteDetailEntityDtoConverter")
public class SiteDetailEntityDtoConverter implements IEntityDtoConverter<SiteDetail, SiteDetailDto> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SiteDetailDto convertDomainEntityToDto(SiteDetail siteDetail) {
		SiteDetailDto siteDetailDto = modelMapper.map(siteDetail, SiteDetailDto.class);
		return siteDetailDto;
	}

	@Override
	public SiteDetail convertDtoToDomainEntity(SiteDetailDto siteDetailDto) {
		SiteDetail siteDetail = modelMapper.map(siteDetailDto, SiteDetail.class);
		return siteDetail;
	}

}
