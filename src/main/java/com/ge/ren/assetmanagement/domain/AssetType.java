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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
*
* @author Yessesvy
*/
@Entity
@Table(name = "asset_type")
public class AssetType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="asset_type_id")
    private Long assetTypeId;
    
    @OneToMany(mappedBy="assetType", fetch = FetchType.LAZY)
    private List<AssetLocation> locations;
    
    private String assetTypeNameDefault;

    @Column
    private Boolean isActive;
    
    @Column
    private String createdBy;
    
    @Column
    private LocalDateTime createdOn;
    
    @Column
    private String lastUpdatedBy;
    
    @Column
    private LocalDateTime lastUpdatedOn;

    public AssetType() {
	// Default Constructor
    }

    public AssetType(Long assetTypeId, List<AssetLocation> locations, String assetTypeNameDefault, Boolean isActive,
	    String createdBy, LocalDateTime createdOn, String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
	this.assetTypeId = assetTypeId;
	this.locations = locations;
	this.assetTypeNameDefault = assetTypeNameDefault;
	this.isActive = isActive;
	this.createdBy = createdBy;
	this.createdOn = createdOn;
	this.lastUpdatedBy = lastUpdatedBy;
	this.lastUpdatedOn = lastUpdatedOn;
    }

    public Long getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(Long assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public List<AssetLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<AssetLocation> locations) {
        this.locations = locations;
    }

    public String getAssetTypeNameDefault() {
        return assetTypeNameDefault;
    }

    public void setAssetTypeNameDefault(String assetTypeNameDefault) {
        this.assetTypeNameDefault = assetTypeNameDefault;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public LocalDateTime getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((assetTypeId == null) ? 0 : assetTypeId.hashCode());
	result = prime * result + ((assetTypeNameDefault == null) ? 0 : assetTypeNameDefault.hashCode());
	result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
	result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
	result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
	result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
	result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
	result = prime * result + ((locations == null) ? 0 : locations.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	AssetType other = (AssetType) obj;
	if (assetTypeId == null) {
	    if (other.assetTypeId != null)
		return false;
	} else if (!assetTypeId.equals(other.assetTypeId))
	    return false;
	if (assetTypeNameDefault == null) {
	    if (other.assetTypeNameDefault != null)
		return false;
	} else if (!assetTypeNameDefault.equals(other.assetTypeNameDefault))
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
	if (locations == null) {
	    if (other.locations != null)
		return false;
	} else if (!locations.equals(other.locations))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "AssetType [assetTypeId=" + assetTypeId + ", locations=" + locations + ", assetTypeNameDefault="
		+ assetTypeNameDefault + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn="
		+ createdOn + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
    }
    
}
