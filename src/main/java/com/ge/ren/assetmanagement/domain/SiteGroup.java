/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;

/**
 * @author 502585286
 *
 */
@Entity
@Table(name = "site_groups")
public class SiteGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2728164693149311807L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="site_group_id")
	private Long siteGroupId;

	@OneToMany(mappedBy = "siteGroup", fetch= FetchType.LAZY)
	private List<SiteDetail> siteDetails;

	@OneToMany(mappedBy = "siteGroupSetting", fetch= FetchType.LAZY)
	private List<GroupSetting> groupSetting;
	
	@OneToMany(mappedBy = "siteGroupContract", fetch= FetchType.LAZY)
	private List<GroupContractDetail> groupContractDetail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timezone_id")
	private TimezoneDetail timeZoneDetail;

	@Column(name="group_name")
	private String groupName;

	@Column(name="group_display_name")
	private String groupDisplayName;

	@Column(name="group_latitude")
	private Double groupLatitude;

	@Column(name="group_longitude")
	private Double groupLongitude;

	@Column(name="group_display_order")
	private Integer groupDisplayOrder;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime createdOn;

	@Column(name="last_updated_by")
	private String lastUpdatedBy;

	@Column(name="last_updated_on")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime lastUpdatedOn;

	public SiteGroup() {
		// Default Constructor
	}

	/**
	 * @param siteGroupId
	 * @param siteDetails
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
	public SiteGroup(Long siteGroupId, List<SiteDetail> siteDetails, List<GroupSetting> groupSetting,
			List<GroupContractDetail> groupContractDetail, TimezoneDetail timeZoneDetail, String groupName,
			String groupDisplayName, Double groupLatitude, Double groupLongitude, Integer groupDisplayOrder,
			Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
			LocalDateTime lastUpdatedOn) {
		this.siteGroupId = siteGroupId;
		this.siteDetails = siteDetails;
		this.groupSetting = groupSetting;
		this.groupContractDetail = groupContractDetail;
		this.timeZoneDetail = timeZoneDetail;
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
	 * @return the groupSetting
	 */
	public List<GroupSetting> getGroupSetting() {
		return groupSetting;
	}

	/**
	 * @param groupSetting the groupSetting to set
	 */
	public void setGroupSetting(List<GroupSetting> groupSetting) {
		this.groupSetting = groupSetting;
	}

	/**
	 * @return the groupContractDetail
	 */
	public List<GroupContractDetail> getGroupContractDetail() {
		return groupContractDetail;
	}

	/**
	 * @param groupContractDetail the groupContractDetail to set
	 */
	public void setGroupContractDetail(List<GroupContractDetail> groupContractDetail) {
		this.groupContractDetail = groupContractDetail;
	}
	
	/**
	 * @return the timeZoneDetail
	 */
	public TimezoneDetail getTimeZoneDetail() {
		return timeZoneDetail;
	}

	/**
	 * @param timeZoneDetail the timeZoneDetail to set
	 */
	public void setTimeZoneDetail(TimezoneDetail timeZoneDetail) {
		this.timeZoneDetail = timeZoneDetail;
	}

	/**
	 * @return the siteDetails
	 */
	public List<SiteDetail> getSiteDetails() {
		return siteDetails;
	}

	/**
	 * @param siteDetails the siteDetails to set
	 */
	public void setSiteDetails(List<SiteDetail> siteDetails) {
		this.siteDetails = siteDetails;
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
		result = prime * result + ((groupContractDetail == null) ? 0 : groupContractDetail.hashCode());
		result = prime * result + ((groupDisplayName == null) ? 0 : groupDisplayName.hashCode());
		result = prime * result + ((groupDisplayOrder == null) ? 0 : groupDisplayOrder.hashCode());
		result = prime * result + ((groupLatitude == null) ? 0 : groupLatitude.hashCode());
		result = prime * result + ((groupLongitude == null) ? 0 : groupLongitude.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((groupSetting == null) ? 0 : groupSetting.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteDetails == null) ? 0 : siteDetails.hashCode());
		result = prime * result + ((siteGroupId == null) ? 0 : siteGroupId.hashCode());
		result = prime * result + ((timeZoneDetail == null) ? 0 : timeZoneDetail.hashCode());
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
		SiteGroup other = (SiteGroup) obj;
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
		if (groupContractDetail == null) {
			if (other.groupContractDetail != null)
				return false;
		} else if (!groupContractDetail.equals(other.groupContractDetail))
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
		if (groupSetting == null) {
			if (other.groupSetting != null)
				return false;
		} else if (!groupSetting.equals(other.groupSetting))
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
		if (timeZoneDetail == null) {
			if (other.timeZoneDetail != null)
				return false;
		} else if (!timeZoneDetail.equals(other.timeZoneDetail))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteGroup [siteGroupId=" + siteGroupId + ", siteDetails=" + siteDetails + ", groupSetting="
				+ groupSetting + ", groupContractDetail=" + groupContractDetail + ", timeZoneDetail=" + timeZoneDetail
				+ ", groupName=" + groupName + ", groupDisplayName=" + groupDisplayName + ", groupLatitude="
				+ groupLatitude + ", groupLongitude=" + groupLongitude + ", groupDisplayOrder=" + groupDisplayOrder
				+ ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

}
