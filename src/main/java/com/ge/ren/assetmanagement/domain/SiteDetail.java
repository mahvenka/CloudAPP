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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author 502585286
 *
 */
@Entity
@Table(name = "site_details")
public class SiteDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5436354133685039556L;

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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="site_unique_id")
	private Long siteUniqueId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_group_id")
	private SiteGroup siteGroup;

	@OneToMany(mappedBy="siteDetail", fetch=FetchType.LAZY)
	private List<Asset> asset;

	@Column(name="tenant_id")
	private Long tenantId;

	@Column(name="site_id")
	private Long siteId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timezone_id")
	private TimezoneDetail timeZoneDetail;
	
	/*@Column(name="timezone_id ")
	private Long timeZoneId;*/

	@Column(name="ips_number")
	private String ipsNumber;

	@Column(name="site_name")
	private String siteName;

	@Column(name="site_latitude")
	private Double siteLatitude;

	@Column(name="site_longitude")
	private Double siteLongitude;

	@Column(name="group_display_order")
	private Integer displayOrder;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	private LocalDateTime createdOn;

	@Column(name="last_updated_by")
	private String lastUpdatedBy;

	@Column(name="last_updated_on")
	private LocalDateTime lastUpdatedOn;

	/**
	 * 
	 */
	public SiteDetail() {
		// Default Constructor
	}

	/**
	 * @param siteUniqueId
	 * @param siteGroup
	 * @param asset
	 * @param tenantId
	 * @param siteId
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
	public SiteDetail(Long siteUniqueId, SiteGroup siteGroup, List<Asset> asset, Long tenantId, Long siteId,
			TimezoneDetail timeZoneDetail, String ipsNumber, String siteName, Double siteLatitude, Double siteLongitude,
			Integer displayOrder, Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
			LocalDateTime lastUpdatedOn) {
		this.siteUniqueId = siteUniqueId;
		this.siteGroup = siteGroup;
		this.asset = asset;
		this.tenantId = tenantId;
		this.siteId = siteId;
		this.timeZoneDetail = timeZoneDetail;
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
	 * @return the siteGroup
	 */
	public SiteGroup getSiteGroup() {
		return siteGroup;
	}

	/**
	 * @param siteGroup the siteGroup to set
	 */
	public void setSiteGroup(SiteGroup siteGroup) {
		this.siteGroup = siteGroup;
	}

	/**
	 * @return the asset
	 */
	public List<Asset> getAsset() {
		return asset;
	}

	/**
	 * @param asset the asset to set
	 */
	public void setAsset(List<Asset> asset) {
		this.asset = asset;
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
		result = prime * result + ((asset == null) ? 0 : asset.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((displayOrder == null) ? 0 : displayOrder.hashCode());
		result = prime * result + ((ipsNumber == null) ? 0 : ipsNumber.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteGroup == null) ? 0 : siteGroup.hashCode());
		result = prime * result + ((siteId == null) ? 0 : siteId.hashCode());
		result = prime * result + ((siteLatitude == null) ? 0 : siteLatitude.hashCode());
		result = prime * result + ((siteLongitude == null) ? 0 : siteLongitude.hashCode());
		result = prime * result + ((siteName == null) ? 0 : siteName.hashCode());
		result = prime * result + ((siteUniqueId == null) ? 0 : siteUniqueId.hashCode());
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
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
		SiteDetail other = (SiteDetail) obj;
		if (asset == null) {
			if (other.asset != null)
				return false;
		} else if (!asset.equals(other.asset))
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
		if (siteGroup == null) {
			if (other.siteGroup != null)
				return false;
		} else if (!siteGroup.equals(other.siteGroup))
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
		return "SiteDetail [siteUniqueId=" + siteUniqueId + ", siteGroup=" + siteGroup + ", asset=" + asset
				+ ", tenantId=" + tenantId + ", siteId=" + siteId + ", timeZoneDetail=" + timeZoneDetail
				+ ", ipsNumber=" + ipsNumber + ", siteName=" + siteName + ", siteLatitude=" + siteLatitude
				+ ", siteLongitude=" + siteLongitude + ", displayOrder=" + displayOrder + ", isActive=" + isActive
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

}
