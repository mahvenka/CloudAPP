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

import com.ge.ren.assetmanagement.domain.AssetType;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;

/**
*
* @author Yessesvy
*/
@Service("AssetTypeEntityDtoConverter")
public class AssetTypeEntityDtoConverter implements IEntityDtoConverter<AssetType, AssetTypeDto> {

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public AssetTypeDto convertDomainEntityToDto(AssetType assetType) {
	AssetTypeDto assetTypeDto = modelMapper.map(assetType, AssetTypeDto.class);
	return assetTypeDto;
    }

    @Override
    public AssetType convertDtoToDomainEntity(AssetTypeDto assetTypeDto) {
	AssetType assetType = modelMapper.map(assetTypeDto, AssetType.class);
	return assetType;
    }

}
