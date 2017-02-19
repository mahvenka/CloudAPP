/**
 * 
 */
package com.ge.ren.assetmanagement.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.ren.assetmanagement.domain.TimezoneDetail;
import com.ge.ren.assetmanagement.dto.TimezoneDetailDto;

/**
 * @author 502687773
 *
 */
@Service("TimezoneDetailEntityDtoConverter")
public class TimezoneDetailEntityDtoConverter implements IEntityDtoConverter<TimezoneDetail, TimezoneDetailDto> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public TimezoneDetailDto convertDomainEntityToDto(TimezoneDetail timezoneDetail) {
		TimezoneDetailDto timezoneDetailDto = modelMapper.map(timezoneDetail, TimezoneDetailDto.class);
		return timezoneDetailDto;
	}
	
	@Override
	public TimezoneDetail convertDtoToDomainEntity(TimezoneDetailDto timezoneDetailDto) {
		TimezoneDetail timezoneDetail = modelMapper.map(timezoneDetailDto, TimezoneDetail.class);
		return timezoneDetail;
	}
	
}
