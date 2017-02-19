/**
 * 
 */
package com.ge.ren.assetmanagement.validators;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ge.ren.assetmanagement.constant.AssetManagementErrorCodes;
import com.ge.ren.assetmanagement.dto.ErrorDetail;
import com.ge.ren.assetmanagement.dto.GroupSettingDto;
import com.ge.ren.assetmanagement.dto.SiteGroupDto;
import com.ge.ren.assetmanagement.util.AssetManagementUtil;


/**
 * @author 502687773
 *
 */
@Service("AssetManagementValidators")
public class AssetManagementValidators {

	public SiteGroupDto validateSiteSettings(SiteGroupDto siteGroupDto) {
		
		List<GroupSettingDto> groupSettingList = siteGroupDto.getGroupSettingDto();
		for(GroupSettingDto groupSettingDto : groupSettingList){
			if(AssetManagementUtil.isNull(groupSettingDto.getGroupStartTime())){
				siteGroupDto.addErrorDetails(
						new ErrorDetail[] { new ErrorDetail(AssetManagementErrorCodes.SITE_GROUP_START_TIME_ERROR,
								"Site Group Start Time should not be null or empty") });
			}
			if(AssetManagementUtil.isNull(groupSettingDto.getGroupEndTime())){
				siteGroupDto.addErrorDetails(
						new ErrorDetail[] { new ErrorDetail(AssetManagementErrorCodes.SITE_GROUP_END_TIME_ERROR,
								"Site Group End Time should not be null or empty") });
			}
			if(AssetManagementUtil.isNull(groupSettingDto.getGroupMaxOvertime())){
				siteGroupDto.addErrorDetails(
						new ErrorDetail[] { new ErrorDetail(AssetManagementErrorCodes.SITE_GROUP_MAX_OVER_TIME_ERROR,
								"Maximum Over Time for site group should not be null or empty") });
			}
			if(groupSettingDto.getGroupMaxOvertime() > 8){
				siteGroupDto.addErrorDetails(
						new ErrorDetail[] { new ErrorDetail(AssetManagementErrorCodes.SITE_GROUP_MAX_OVER_TIME_ERROR,
								"Maximum Over Time for site group should not be set to a value greater than 8 hours.") });
			}
		}
		
		return siteGroupDto;
	}
	
}
