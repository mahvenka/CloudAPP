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

import com.ge.ren.assetmanagement.domain.AssetSection;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;

/**
*
* @author Yessesvy
*/
@Service("SectionEntityDtoConverter")
public class SectionEntityDtoConverter implements IEntityDtoConverter<AssetSection, AssetSectionDto> {

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public AssetSectionDto convertDomainEntityToDto(AssetSection assetSection) {
	AssetSectionDto assetSectionDto = modelMapper.map(assetSection, AssetSectionDto.class);
	return assetSectionDto;
    }

    @Override
    public AssetSection convertDtoToDomainEntity(AssetSectionDto assetSectionDto) {
	AssetSection assetSection = modelMapper.map(assetSectionDto, AssetSection.class);
	return assetSection;
    }

}
