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
public class SiteDetailDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9180114207154653187L;

	private List<AssetDto> assetList;

	private Long siteUniqueId;

	private Long siteId;

	private Long tenantId;

	private Long timeZoneId;

	private String ipsNumber;

	private String siteName;

	private Double siteLatitude;

	private Double siteLongitude;

	private Integer displayOrder;

	private Boolean isActive;

	private String createdBy;

	private LocalDateTime createdOn;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedOn;

	/**
	 * Default Constructor
	 */
	public SiteDetailDto() {
	}

	/**
	 * @param assetList
	 * @param siteUniqueId
	 * @param siteId
	 * @param tenantId
	 * @param timeZoneId
	 * @param ipsNumber
	 * @param siteName
	 * @param siteLatitude
	 * @param siteLongitude
	 * @param displayOrder
	 * @param isActive
	 * @param createdBy
	 * @param createdOn
	 * @param lastUpdatedBy
	 * @param lastUpdatedOn
	 */
	public SiteDetailDto(List<AssetDto> assetList, Long siteUniqueId, Long siteId, Long tenantId, Long timeZoneId,
			String ipsNumber, String siteName, Double siteLatitude, Double siteLongitude, Integer displayOrder,
			Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
			LocalDateTime lastUpdatedOn) {
		this.assetList = assetList;
		this.siteUniqueId = siteUniqueId;
		this.siteId = siteId;
		this.tenantId = tenantId;
		this.timeZoneId = timeZoneId;
		this.ipsNumber = ipsNumber;
		this.siteName = siteName;
		this.siteLatitude = siteLatitude;
		this.siteLongitude = siteLongitude;
		this.displayOrder = displayOrder;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	/**
	 * @return the assetList
	 */
	public List<AssetDto> getAssetList() {
		return assetList;
	}

	/**
	 * @param assetList the assetList to set
	 */
	public void setAssetList(List<AssetDto> assetList) {
		this.assetList = assetList;
	}

	/**
	 * @return the siteUniqueId
	 */
	public Long getSiteUniqueId() {
		return siteUniqueId;
	}

	/**
	 * @param siteUniqueId the siteUniqueId to set
	 */
	public void setSiteUniqueId(Long siteUniqueId) {
		this.siteUniqueId = siteUniqueId;
	}

	/**
	 * @return the siteId
	 */
	public Long getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the tenantId
	 */
	public Long getTenantId() {
		return tenantId;
	}

	/**
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * @return the timeZoneId
	 */
	public Long getTimeZoneId() {
		return timeZoneId;
	}

	/**
	 * @param timeZoneId the timeZoneId to set
	 */
	public void setTimeZoneId(Long timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	/**
	 * @return the ipsNumber
	 */
	public String getIpsNumber() {
		return ipsNumber;
	}

	/**
	 * @param ipsNumber the ipsNumber to set
	 */
	public void setIpsNumber(String ipsNumber) {
		this.ipsNumber = ipsNumber;
	}

	/**
	 * @return the siteName
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * @param siteName the siteName to set
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * @return the siteLatitude
	 */
	public Double getSiteLatitude() {
		return siteLatitude;
	}

	/**
	 * @param siteLatitude the siteLatitude to set
	 */
	public void setSiteLatitude(Double siteLatitude) {
		this.siteLatitude = siteLatitude;
	}

	/**
	 * @return the siteLongitude
	 */
	public Double getSiteLongitude() {
		return siteLongitude;
	}

	/**
	 * @param siteLongitude the siteLongitude to set
	 */
	public void setSiteLongitude(Double siteLongitude) {
		this.siteLongitude = siteLongitude;
	}

	/**
	 * @return the displayOrder
	 */
	public Integer getDisplayOrder() {
		return displayOrder;
	}

	/**
	 * @param displayOrder the displayOrder to set
	 */
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
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
		result = prime * result + ((assetList == null) ? 0 : assetList.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((displayOrder == null) ? 0 : displayOrder.hashCode());
		result = prime * result + ((ipsNumber == null) ? 0 : ipsNumber.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteId == null) ? 0 : siteId.hashCode());
		result = prime * result + ((siteLatitude == null) ? 0 : siteLatitude.hashCode());
		result = prime * result + ((siteLongitude == null) ? 0 : siteLongitude.hashCode());
		result = prime * result + ((siteName == null) ? 0 : siteName.hashCode());
		result = prime * result + ((siteUniqueId == null) ? 0 : siteUniqueId.hashCode());
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
		result = prime * result + ((timeZoneId == null) ? 0 : timeZoneId.hashCode());
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
		SiteDetailDto other = (SiteDetailDto) obj;
		if (assetList == null) {
			if (other.assetList != null)
				return false;
		} else if (!assetList.equals(other.assetList))
			return false;
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
		if (displayOrder == null) {
			if (other.displayOrder != null)
				return false;
		} else if (!displayOrder.equals(other.displayOrder))
			return false;
		if (ipsNumber == null) {
			if (other.ipsNumber != null)
				return false;
		} else if (!ipsNumber.equals(other.ipsNumber))
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
		if (siteId == null) {
			if (other.siteId != null)
				return false;
		} else if (!siteId.equals(other.siteId))
			return false;
		if (siteLatitude == null) {
			if (other.siteLatitude != null)
				return false;
		} else if (!siteLatitude.equals(other.siteLatitude))
			return false;
		if (siteLongitude == null) {
			if (other.siteLongitude != null)
				return false;
		} else if (!siteLongitude.equals(other.siteLongitude))
			return false;
		if (siteName == null) {
			if (other.siteName != null)
				return false;
		} else if (!siteName.equals(other.siteName))
			return false;
		if (siteUniqueId == null) {
			if (other.siteUniqueId != null)
				return false;
		} else if (!siteUniqueId.equals(other.siteUniqueId))
			return false;
		if (tenantId == null) {
			if (other.tenantId != null)
				return false;
		} else if (!tenantId.equals(other.tenantId))
			return false;
		if (timeZoneId == null) {
			if (other.timeZoneId != null)
				return false;
		} else if (!timeZoneId.equals(other.timeZoneId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteDetailDto [assetList=" + assetList + ", siteUniqueId=" + siteUniqueId + ", siteId=" + siteId
				+ ", tenantId=" + tenantId + ", timeZoneId=" + timeZoneId + ", ipsNumber=" + ipsNumber + ", siteName="
				+ siteName + ", siteLatitude=" + siteLatitude + ", siteLongitude=" + siteLongitude + ", displayOrder="
				+ displayOrder + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}



}
