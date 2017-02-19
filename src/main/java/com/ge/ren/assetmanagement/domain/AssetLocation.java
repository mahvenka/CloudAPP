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
*
* @author Yessesvy
*/
@Entity
@Table(name = "locations_on_asset")
public class AssetLocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="location_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="asset_type_id")
    private AssetType assetType;

    @OneToMany(mappedBy="assetLocation", fetch = FetchType.LAZY)
    private  List<AssetSection> assetSection;
    
    @Column
    private String locationNameDefault;
    
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

    public AssetLocation() {
	// Default Constructor
    }

    public AssetLocation(Long id, AssetType assetType, List<AssetSection> assetSection, String locationNameDefault,
	    Boolean isActive, String createdBy, LocalDateTime createdOn, String lastUpdatedBy,
	    LocalDateTime lastUpdatedOn) {
	this.id = id;
	this.assetType = assetType;
	this.assetSection = assetSection;
	this.locationNameDefault = locationNameDefault;
	this.isActive = isActive;
	this.createdBy = createdBy;
	this.createdOn = createdOn;
	this.lastUpdatedBy = lastUpdatedBy;
	this.lastUpdatedOn = lastUpdatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public List<AssetSection> getAssetSection() {
        return assetSection;
    }

    public void setAssetSection(List<AssetSection> assetSection) {
        this.assetSection = assetSection;
    }

    public String getLocationNameDefault() {
        return locationNameDefault;
    }

    public void setLocationNameDefault(String locationNameDefault) {
        this.locationNameDefault = locationNameDefault;
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
	result = prime * result + ((assetSection == null) ? 0 : assetSection.hashCode());
	result = prime * result + ((assetType == null) ? 0 : assetType.hashCode());
	result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
	result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
	result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
	result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
	result = prime * result + ((locationNameDefault == null) ? 0 : locationNameDefault.hashCode());
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
	AssetLocation other = (AssetLocation) obj;
	if (assetSection == null) {
	    if (other.assetSection != null)
		return false;
	} else if (!assetSection.equals(other.assetSection))
	    return false;
	if (assetType == null) {
	    if (other.assetType != null)
		return false;
	} else if (!assetType.equals(other.assetType))
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
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
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
	if (locationNameDefault == null) {
	    if (other.locationNameDefault != null)
		return false;
	} else if (!locationNameDefault.equals(other.locationNameDefault))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "AssetLocation [id=" + id + ", assetType=" + assetType + ", assetSection=" + assetSection
		+ ", locationNameDefault=" + locationNameDefault + ", isActive=" + isActive + ", createdBy=" + createdBy
		+ ", createdOn=" + createdOn + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn
		+ "]";
    }
    
}
