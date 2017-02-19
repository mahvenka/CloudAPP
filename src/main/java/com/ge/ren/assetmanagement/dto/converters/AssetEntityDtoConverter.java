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

import com.ge.ren.assetmanagement.domain.Asset;
import com.ge.ren.assetmanagement.dto.AssetDto;

/**
 *
 * @author 502585286
 */
@Service("AssetEntityDtoConverter")
public class AssetEntityDtoConverter implements IEntityDtoConverter<Asset, AssetDto> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AssetDto convertDomainEntityToDto(Asset asset) {
		AssetDto assetDto = modelMapper.map(asset, AssetDto.class);
		return assetDto;
	}

	@Override
	public Asset convertDtoToDomainEntity(AssetDto assetDto) {
		Asset asset = modelMapper.map(assetDto, Asset.class);
		return asset;
	}

}
