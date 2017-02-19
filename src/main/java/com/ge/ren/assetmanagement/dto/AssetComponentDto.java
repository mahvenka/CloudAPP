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

/**
*
* @author Yessesvy
*/
public class AssetComponentDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3987331618977045845L;

	private Long id;

    private String assetTypeNameDefault;

    private Boolean isActive;

    private String createdBy;

    private LocalDateTime createdOn;

    private String lastUpdatedBy;

    private LocalDateTime lastUpdatedOn;

    public AssetComponentDto() {
	// Default Constructor
    }

    public AssetComponentDto(Long id, String assetTypeNameDefault, Boolean isActive, String createdBy,
	    LocalDateTime createdOn, String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
	this.id = id;
	this.assetTypeNameDefault = assetTypeNameDefault;
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
	result = prime * result + ((assetTypeNameDefault == null) ? 0 : assetTypeNameDefault.hashCode());
	result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
	result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
	result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
	result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
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
	AssetComponentDto other = (AssetComponentDto) obj;
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
	return true;
    }

    @Override
    public String toString() {
	return "AssetComponentDto [id=" + id + ", assetTypeNameDefault=" + assetTypeNameDefault + ", isActive="
		+ isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", lastUpdatedBy="
		+ lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
    }

}
