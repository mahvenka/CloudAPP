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

import com.ge.ren.assetmanagement.domain.AssetLocation;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;

/**
*
* @author Yessesvy
*/
@Service("LocationEntityDtoConverter")
public class LocationEntityDtoConverter implements IEntityDtoConverter<AssetLocation, AssetLocationDto> {

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public AssetLocationDto convertDomainEntityToDto(AssetLocation assetLocation) {
	AssetLocationDto assetLocationDto = modelMapper.map(assetLocation, AssetLocationDto.class);
	return assetLocationDto;
    }

    @Override
    public AssetLocation convertDtoToDomainEntity(AssetLocationDto assetLocationDto) {
	AssetLocation assetLocation = modelMapper.map(assetLocationDto, AssetLocation.class);
	return assetLocation;
    }

}
