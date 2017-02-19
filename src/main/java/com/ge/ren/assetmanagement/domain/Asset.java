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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 502585286
 */
@Entity
@Table(name = "asset_details")
public class Asset implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2542185753399403448L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="asset_id")
	private Long assetId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="site_unique_id")
	private SiteDetail siteDetail;

	@Column(name="asset_type_id")
	private Long assetTypeId;

	@Column(name="asset_serial_number")
	private String assetSerialNumber;

	@Column(name="asset_name")
	private String assetName;

	@Column(name="asset_display_name")
	private String assetDisplayName;

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

	public Asset() {
		// Default Constructor
	}

	/**
	 * @param assetId
	 * @param siteDetail
	 * @param assetTypeId
	 * @param assetSerialNumber
	 * @param assetName
	 * @param assetDisplayName
	 * @param isActive
	 * @param createdBy
	 * @param createdOn
	 * @param lastUpdatedBy
	 * @param lastUpdatedOn
	 */
	public Asset(Long assetId, SiteDetail siteDetail, Long assetTypeId, String assetSerialNumber, String assetName,
			String assetDisplayName, Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
			LocalDateTime lastUpdatedOn) {
		this.assetId = assetId;
		this.siteDetail = siteDetail;
		this.assetTypeId = assetTypeId;
		this.assetSerialNumber = assetSerialNumber;
		this.assetName = assetName;
		this.assetDisplayName = assetDisplayName;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	/**
	 * @return the assetId
	 */
	public Long getAssetId() {
		return assetId;
	}

	/**
	 * @param assetId the assetId to set
	 */
	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	/**
	 * @return the siteDetail
	 */
	public SiteDetail getSiteDetail() {
		return siteDetail;
	}

	/**
	 * @param siteDetail the siteDetail to set
	 */
	public void setSiteDetail(SiteDetail siteDetail) {
		this.siteDetail = siteDetail;
	}

	/**
	 * @return the assetTypeId
	 */
	public Long getAssetTypeId() {
		return assetTypeId;
	}

	/**
	 * @param assetTypeId the assetTypeId to set
	 */
	public void setAssetTypeId(Long assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	/**
	 * @return the assetSerialNumber
	 */
	public String getAssetSerialNumber() {
		return assetSerialNumber;
	}

	/**
	 * @param assetSerialNumber the assetSerialNumber to set
	 */
	public void setAssetSerialNumber(String assetSerialNumber) {
		this.assetSerialNumber = assetSerialNumber;
	}

	/**
	 * @return the assetName
	 */
	public String getAssetName() {
		return assetName;
	}

	/**
	 * @param assetName the assetName to set
	 */
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	/**
	 * @return the assetDisplayName
	 */
	public String getAssetDisplayName() {
		return assetDisplayName;
	}

	/**
	 * @param assetDisplayName the assetDisplayName to set
	 */
	public void setAssetDisplayName(String assetDisplayName) {
		this.assetDisplayName = assetDisplayName;
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
		result = prime * result + ((assetDisplayName == null) ? 0 : assetDisplayName.hashCode());
		result = prime * result + ((assetId == null) ? 0 : assetId.hashCode());
		result = prime * result + ((assetName == null) ? 0 : assetName.hashCode());
		result = prime * result + ((assetSerialNumber == null) ? 0 : assetSerialNumber.hashCode());
		result = prime * result + ((assetTypeId == null) ? 0 : assetTypeId.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteDetail == null) ? 0 : siteDetail.hashCode());
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
		Asset other = (Asset) obj;
		if (assetDisplayName == null) {
			if (other.assetDisplayName != null)
				return false;
		} else if (!assetDisplayName.equals(other.assetDisplayName))
			return false;
		if (assetId == null) {
			if (other.assetId != null)
				return false;
		} else if (!assetId.equals(other.assetId))
			return false;
		if (assetName == null) {
			if (other.assetName != null)
				return false;
		} else if (!assetName.equals(other.assetName))
			return false;
		if (assetSerialNumber == null) {
			if (other.assetSerialNumber != null)
				return false;
		} else if (!assetSerialNumber.equals(other.assetSerialNumber))
			return false;
		if (assetTypeId == null) {
			if (other.assetTypeId != null)
				return false;
		} else if (!assetTypeId.equals(other.assetTypeId))
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
		if (siteDetail == null) {
			if (other.siteDetail != null)
				return false;
		} else if (!siteDetail.equals(other.siteDetail))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", siteDetail=" + siteDetail + ", assetTypeId=" + assetTypeId
				+ ", assetSerialNumber=" + assetSerialNumber + ", assetName=" + assetName + ", assetDisplayName="
				+ assetDisplayName + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

}
