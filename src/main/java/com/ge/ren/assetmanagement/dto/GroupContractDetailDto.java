/**
 * 
 */
package com.ge.ren.assetmanagement.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 502687773
 *
 */
public class GroupContractDetailDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long groupContractId;

	private String groupContractType;
	
	private LocalDate contractStartDate;
	
	private LocalDate contractEndDate;
	
	private Boolean isActive;
	
	private String createdBy;

	private LocalDateTime createdOn;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedOn;
	
	/**
	 * 
	 */
	public GroupContractDetailDto() {
		
	}
	
	public GroupContractDetailDto(Long groupContractId, String groupContractType, LocalDate contractStartDate,
			LocalDate contractEndDate, Boolean isActive, String createdBy, LocalDateTime createdOn,
			String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
		this.groupContractId = groupContractId;
		this.groupContractType = groupContractType;
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	/**
	 * @return the groupContractId
	 */
	public Long getGroupContractId() {
		return groupContractId;
	}

	/**
	 * @param groupContractId the groupContractId to set
	 */
	public void setGroupContractId(Long groupContractId) {
		this.groupContractId = groupContractId;
	}

	/**
	 * @return the groupContractType
	 */
	public String getGroupContractType() {
		return groupContractType;
	}

	/**
	 * @param groupContractType the groupContractType to set
	 */
	public void setGroupContractType(String groupContractType) {
		this.groupContractType = groupContractType;
	}

	/**
	 * @return the contractStartDate
	 */
	public LocalDate getContractStartDate() {
		return contractStartDate;
	}

	/**
	 * @param contractStartDate the contractStartDate to set
	 */
	public void setContractStartDate(LocalDate contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	/**
	 * @return the contractEndDate
	 */
	public LocalDate getContractEndDate() {
		return contractEndDate;
	}

	/**
	 * @param contractEndDate the contractEndDate to set
	 */
	public void setContractEndDate(LocalDate contractEndDate) {
		this.contractEndDate = contractEndDate;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GroupContractDetailDto [groupContractId=" + groupContractId + ", groupContractType=" + groupContractType
				+ ", contractStartDate=" + contractStartDate + ", contractEndDate=" + contractEndDate + ", isActive="
				+ isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractEndDate == null) ? 0 : contractEndDate.hashCode());
		result = prime * result + ((contractStartDate == null) ? 0 : contractStartDate.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((groupContractId == null) ? 0 : groupContractId.hashCode());
		result = prime * result + ((groupContractType == null) ? 0 : groupContractType.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
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
		GroupContractDetailDto other = (GroupContractDetailDto) obj;
		if (contractEndDate == null) {
			if (other.contractEndDate != null)
				return false;
		} else if (!contractEndDate.equals(other.contractEndDate))
			return false;
		if (contractStartDate == null) {
			if (other.contractStartDate != null)
				return false;
		} else if (!contractStartDate.equals(other.contractStartDate))
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
		if (groupContractId == null) {
			if (other.groupContractId != null)
				return false;
		} else if (!groupContractId.equals(other.groupContractId))
			return false;
		if (groupContractType == null) {
			if (other.groupContractType != null)
				return false;
		} else if (!groupContractType.equals(other.groupContractType))
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
	
}
