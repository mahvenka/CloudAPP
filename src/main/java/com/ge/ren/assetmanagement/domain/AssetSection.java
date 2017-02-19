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
@Table(name = "sections_at_location")
public class AssetSection implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4423682625112587869L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="section_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="location_id")
    private AssetLocation assetLocation;

    @OneToMany(mappedBy="assetSection", fetch = FetchType.LAZY)
    private  List<AssetComponent> assetComponent;

    @Column
    private String sectionNameDefault;

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

    public AssetSection() {
	// Default Constructor
    }

    public AssetSection(Long id, AssetLocation assetLocation, List<AssetComponent> assetComponent,
	    String sectionNameDefault, Boolean isActive, String createdBy, LocalDateTime createdOn,
	    String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
	this.id = id;
	this.assetLocation = assetLocation;
	this.assetComponent = assetComponent;
	this.sectionNameDefault = sectionNameDefault;
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

    public AssetLocation getAssetLocation() {
        return assetLocation;
    }

    public void setAssetLocation(AssetLocation assetLocation) {
        this.assetLocation = assetLocation;
    }

    public List<AssetComponent> getAssetComponent() {
        return assetComponent;
    }

    public void setAssetComponent(List<AssetComponent> assetComponent) {
        this.assetComponent = assetComponent;
    }

    public String getSectionNameDefault() {
        return sectionNameDefault;
    }

    public void setSectionNameDefault(String sectionNameDefault) {
        this.sectionNameDefault = sectionNameDefault;
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
	result = prime * result + ((assetComponent == null) ? 0 : assetComponent.hashCode());
	result = prime * result + ((assetLocation == null) ? 0 : assetLocation.hashCode());
	result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
	result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
	result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
	result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
	result = prime * result + ((sectionNameDefault == null) ? 0 : sectionNameDefault.hashCode());
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
	AssetSection other = (AssetSection) obj;
	if (assetComponent == null) {
	    if (other.assetComponent != null)
		return false;
	} else if (!assetComponent.equals(other.assetComponent))
	    return false;
	if (assetLocation == null) {
	    if (other.assetLocation != null)
		return false;
	} else if (!assetLocation.equals(other.assetLocation))
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
	if (sectionNameDefault == null) {
	    if (other.sectionNameDefault != null)
		return false;
	} else if (!sectionNameDefault.equals(other.sectionNameDefault))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "AssetSection [id=" + id + ", assetLocation=" + assetLocation + ", assetComponent=" + assetComponent
		+ ", sectionNameDefault=" + sectionNameDefault + ", isActive=" + isActive + ", createdBy=" + createdBy
		+ ", createdOn=" + createdOn + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn
		+ "]";
    }
    
}
