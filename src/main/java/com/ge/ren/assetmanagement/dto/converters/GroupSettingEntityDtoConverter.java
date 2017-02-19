package com.ge.ren.assetmanagement.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.ren.assetmanagement.domain.GroupSetting;
import com.ge.ren.assetmanagement.dto.GroupSettingDto;


/**
 * @author 502687773
 *
 */
@Service("GroupSettingEntityDtoConverter")
public class GroupSettingEntityDtoConverter implements IEntityDtoConverter<GroupSetting, GroupSettingDto> {

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public GroupSettingDto convertDomainEntityToDto(GroupSetting groupSetting) {
		GroupSettingDto groupSettingDto = modelMapper.map(groupSetting, GroupSettingDto.class);
		return groupSettingDto;
	}
	
	@Override
	public GroupSetting convertDtoToDomainEntity(GroupSettingDto groupSettingDto) {
		GroupSetting groupSetting = modelMapper.map(groupSettingDto, GroupSetting.class);
		return groupSetting;
	}
	
}
