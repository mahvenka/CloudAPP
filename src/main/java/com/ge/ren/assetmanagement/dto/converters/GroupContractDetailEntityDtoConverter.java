/**
 * 
 */
package com.ge.ren.assetmanagement.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.ren.assetmanagement.domain.GroupContractDetail;
import com.ge.ren.assetmanagement.dto.GroupContractDetailDto;

/**
 * @author 502687773
 *
 */
@Service("GroupContractDetailEntityDtoConverter")
public class GroupContractDetailEntityDtoConverter implements IEntityDtoConverter<GroupContractDetail, GroupContractDetailDto> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public GroupContractDetailDto convertDomainEntityToDto(GroupContractDetail groupContractDetail) {
		GroupContractDetailDto groupContractDetailDto = modelMapper.map(groupContractDetail, GroupContractDetailDto.class);
		return groupContractDetailDto;
	}
	
	@Override
	public GroupContractDetail convertDtoToDomainEntity(GroupContractDetailDto groupContractDetailDto) {
		GroupContractDetail groupContractDetail = modelMapper.map(groupContractDetailDto, GroupContractDetail.class);
		return groupContractDetail;
	}
	
}
