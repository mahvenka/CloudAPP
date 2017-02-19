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

import com.ge.ren.assetmanagement.domain.AssetComponent;
import com.ge.ren.assetmanagement.dto.AssetComponentDto;

/**
*
* @author Yessesvy
*/
@Service("ComponentEntityDtoConverter")
public class ComponentEntityDtoConverter implements IEntityDtoConverter<AssetComponent, AssetComponentDto> {

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public AssetComponentDto convertDomainEntityToDto(AssetComponent assetComponent) {
	AssetComponentDto assetComponentDto = modelMapper.map(assetComponent, AssetComponentDto.class);
	return assetComponentDto;
    }

    @Override
    public AssetComponent convertDtoToDomainEntity(AssetComponentDto assetComponentDto) {
	AssetComponent assetComponent = modelMapper.map(assetComponentDto, AssetComponent.class);
	return assetComponent;
    }

}
