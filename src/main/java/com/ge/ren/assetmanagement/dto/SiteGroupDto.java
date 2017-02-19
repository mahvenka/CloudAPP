/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 502585286
 *
 */
public class SiteGroupDto extends ServiceDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -44164624109328244L;

	private Long siteGroupId;
	
	private List<SiteDetailDto> siteDetails;

	private List<GroupSettingDto> groupSettingDto;
	
	private List<GroupContractDetailDto> groupContractDetailDto;

	private TimezoneDetailDto timezoneDetailDto;

	private String groupName;

	private String groupDisplayName;

	private Double groupLatitude;

	private Double groupLongitude;

	private Integer groupDisplayOrder;

	private Boolean isActive;

	private String createdBy;

	private LocalDateTime createdOn;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedOn;


	public SiteGroupDto() {
		// Default Constructor
	}


	/**
	 * @param siteDetails
	 * @param siteGroupId
	 * @param timeZoneId
	 * @param groupName
	 * @param groupDisplayName
	 * @param groupLatitude
	 * @param groupLongitude
	 * @param groupDisplayOrder
	 * @param isActive
	 * @param createdBy
	 * @param createdOn
	 * @param lastUpdatedBy
	 * @param lastUpdatedOn
	 */
	public SiteGroupDto(Long siteGroupId, List<SiteDetailDto> siteDetails, List<GroupSettingDto> groupSettingDto,
			List<GroupContractDetailDto> groupContractDetailDto, TimezoneDetailDto timezoneDetailDto, String groupName,
			String groupDisplayName, Double groupLatitude, Double groupLongitude, Integer groupDisplayOrder,
			Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
			LocalDateTime lastUpdatedOn) {
		this.siteGroupId = siteGroupId;
		this.siteDetails = siteDetails;
		this.groupSettingDto = groupSettingDto;
		this.groupContractDetailDto = groupContractDetailDto;
		this.timezoneDetailDto = timezoneDetailDto;
		this.groupName = groupName;
		this.groupDisplayName = groupDisplayName;
		this.groupLatitude = groupLatitude;
		this.groupLongitude = groupLongitude;
		this.groupDisplayOrder = groupDisplayOrder;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	/**
	 * @return the siteDetails
	 */
	public List<SiteDetailDto> getSiteDetails() {
		return siteDetails;
	}


	/**
	 * @param siteDetails the siteDetails to set
	 */
	public void setSiteDetails(List<SiteDetailDto> siteDetails) {
		this.siteDetails = siteDetails;
	}


	
	/**
	 * @return the siteGroupId
	 */
	public Long getSiteGroupId() {
		return siteGroupId;
	}


	/**
	 * @param siteGroupId the siteGroupId to set
	 */
	public void setSiteGroupId(Long siteGroupId) {
		this.siteGroupId = siteGroupId;
	}


    /**
	 * @return the groupSettingDto
	 */
	public List<GroupSettingDto> getGroupSettingDto() {
		return groupSettingDto;
	}


	/**
	 * @param groupSettingDto the groupSettingDto to set
	 */
	public void setGroupSettingDto(List<GroupSettingDto> groupSettingDto) {
		this.groupSettingDto = groupSettingDto;
	}


	/**
	 * @return the groupContractDetailDto
	 */
	public List<GroupContractDetailDto> getGroupContractDetailDto() {
		return groupContractDetailDto;
	}


	/**
	 * @param groupContractDetailDto the groupContractDetailDto to set
	 */
	public void setGroupContractDetailDto(List<GroupContractDetailDto> groupContractDetailDto) {
		this.groupContractDetailDto = groupContractDetailDto;
	}


	/**
	 * @return the timezoneDetailDto
	 */
	public TimezoneDetailDto getTimezoneDetailDto() {
		return timezoneDetailDto;
	}


	/**
	 * @param timezoneDetailDto the timezoneDetailDto to set
	 */
	public void setTimezoneDetailDto(TimezoneDetailDto timezoneDetailDto) {
		this.timezoneDetailDto = timezoneDetailDto;
	}


	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}


	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	/**
	 * @return the groupDisplayName
	 */
	public String getGroupDisplayName() {
		return groupDisplayName;
	}


	/**
	 * @param groupDisplayName the groupDisplayName to set
	 */
	public void setGroupDisplayName(String groupDisplayName) {
		this.groupDisplayName = groupDisplayName;
	}


	/**
	 * @return the groupLatitude
	 */
	public Double getGroupLatitude() {
		return groupLatitude;
	}


	/**
	 * @param groupLatitude the groupLatitude to set
	 */
	public void setGroupLatitude(Double groupLatitude) {
		this.groupLatitude = groupLatitude;
	}


	/**
	 * @return the groupLongitude
	 */
	public Double getGroupLongitude() {
		return groupLongitude;
	}


	/**
	 * @param groupLongitude the groupLongitude to set
	 */
	public void setGroupLongitude(Double groupLongitude) {
		this.groupLongitude = groupLongitude;
	}


	/**
	 * @return the groupDisplayOrder
	 */
	public Integer getGroupDisplayOrder() {
		return groupDisplayOrder;
	}


	/**
	 * @param groupDisplayOrder the groupDisplayOrder to set
	 */
	public void setGroupDisplayOrder(Integer groupDisplayOrder) {
		this.groupDisplayOrder = groupDisplayOrder;
	}


	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}


	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}


	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	/**
	 * @return the createdOn
	 */
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}


	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}


	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}


	/**
	 * @return the lastUpdatedOn
	 */
	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	/**
	 * @param lastUpdatedOn the lastUpdatedOn to set
	 */
	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((groupContractDetailDto == null) ? 0 : groupContractDetailDto.hashCode());
		result = prime * result + ((groupDisplayName == null) ? 0 : groupDisplayName.hashCode());
		result = prime * result + ((groupDisplayOrder == null) ? 0 : groupDisplayOrder.hashCode());
		result = prime * result + ((groupLatitude == null) ? 0 : groupLatitude.hashCode());
		result = prime * result + ((groupLongitude == null) ? 0 : groupLongitude.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((groupSettingDto == null) ? 0 : groupSettingDto.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteDetails == null) ? 0 : siteDetails.hashCode());
		result = prime * result + ((siteGroupId == null) ? 0 : siteGroupId.hashCode());
		result = prime * result + ((timezoneDetailDto == null) ? 0 : timezoneDetailDto.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SiteGroupDto other = (SiteGroupDto) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (groupContractDetailDto == null) {
			if (other.groupContractDetailDto != null)
				return false;
		} else if (!groupContractDetailDto.equals(other.groupContractDetailDto))
			return false;
		if (groupDisplayName == null) {
			if (other.groupDisplayName != null)
				return false;
		} else if (!groupDisplayName.equals(other.groupDisplayName))
			return false;
		if (groupDisplayOrder == null) {
			if (other.groupDisplayOrder != null)
				return false;
		} else if (!groupDisplayOrder.equals(other.groupDisplayOrder))
			return false;
		if (groupLatitude == null) {
			if (other.groupLatitude != null)
				return false;
		} else if (!groupLatitude.equals(other.groupLatitude))
			return false;
		if (groupLongitude == null) {
			if (other.groupLongitude != null)
				return false;
		} else if (!groupLongitude.equals(other.groupLongitude))
			return false;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		if (groupSettingDto == null) {
			if (other.groupSettingDto != null)
				return false;
		} else if (!groupSettingDto.equals(other.groupSettingDto))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdatedOn == null) {
			if (other.lastUpdatedOn != null)
				return false;
		} else if (!lastUpdatedOn.equals(other.lastUpdatedOn))
			return false;
		if (siteDetails == null) {
			if (other.siteDetails != null)
				return false;
		} else if (!siteDetails.equals(other.siteDetails))
			return false;
		if (siteGroupId == null) {
			if (other.siteGroupId != null)
				return false;
		} else if (!siteGroupId.equals(other.siteGroupId))
			return false;
		if (timezoneDetailDto == null) {
			if (other.timezoneDetailDto != null)
				return false;
		} else if (!timezoneDetailDto.equals(other.timezoneDetailDto))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteGroupDto [siteGroupId=" + siteGroupId + ", siteDetails=" + siteDetails + ", groupSettingDto="
				+ groupSettingDto + ", groupContractDetailDto=" + groupContractDetailDto + ", timezoneDetailDto="
				+ timezoneDetailDto + ", groupName=" + groupName + ", groupDisplayName=" + groupDisplayName
				+ ", groupLatitude=" + groupLatitude + ", groupLongitude=" + groupLongitude + ", groupDisplayOrder="
				+ groupDisplayOrder + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

}
