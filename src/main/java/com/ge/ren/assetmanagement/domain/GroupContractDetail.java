/**
 * 
 */
package com.ge.ren.assetmanagement.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;

/**
 * @author 502687773
 *
 */
@Entity
@Table(name = "group_contract_details")
public class GroupContractDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2436050326274704526L;

	/**
	 * 
	 */
	public GroupContractDetail() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="group_contract_id")
	private Long groupContractId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_group_id")
	private SiteGroup siteGroupContract;

	@Column(name="group_contract_type")
	private String groupContractType;
	
	@Column(name="contract_start_date")
	private LocalDate contractStartDate;
	
	@Column(name="contract_end_date")
	private LocalDate contractEndDate;
	
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
	 * @return the siteGroupContract
	 */
	public SiteGroup getSiteGroupContract() {
		return siteGroupContract;
	}

	/**
	 * @param siteGroupContract the siteGroupContract to set
	 */
	public void setSiteGroupContract(SiteGroup siteGroupContract) {
		this.siteGroupContract = siteGroupContract;
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
		return "GroupContractDetail [groupContractId=" + groupContractId + ", siteGroup=" + siteGroupContract
				+ ", groupContractType=" + groupContractType + ", contractStartDate=" + contractStartDate
				+ ", contractEndDate=" + contractEndDate + ", isActive=" + isActive + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn
				+ "]";
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
		result = prime * result + ((siteGroupContract == null) ? 0 : siteGroupContract.hashCode());
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
		GroupContractDetail other = (GroupContractDetail) obj;
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
		if (siteGroupContract == null) {
			if (other.siteGroupContract != null)
				return false;
		} else if (!siteGroupContract.equals(other.siteGroupContract))
			return false;
		return true;
	}
	
}
