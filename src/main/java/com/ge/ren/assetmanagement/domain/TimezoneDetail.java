/**
 * 
 */
package com.ge.ren.assetmanagement.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;

/**
 * @author 502687773
 *
 */
@Entity
@Table(name = "timezone_details")
public class TimezoneDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -501637220525185572L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="timezone_id")
	private Long timezoneId;

	@Column(name="timezone_name")
	private String timezoneName;
	
	@Column(name="utc_offset")
	private Integer utcOffset;
	
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
	 * 
	 */
	public TimezoneDetail() {
		
	}
	
	public TimezoneDetail(Long timezoneId, String timezoneName, Integer utcOffset, Boolean isActive, String createdBy,
			LocalDateTime createdOn, String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
		this.timezoneId = timezoneId;
		this.timezoneName = timezoneName;
		this.utcOffset = utcOffset;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	/**
	 * @return the timezoneId
	 */
	public Long getTimezoneId() {
		return timezoneId;
	}


	/**
	 * @param timezoneId the timezoneId to set
	 */
	public void setTimezoneId(Long timezoneId) {
		this.timezoneId = timezoneId;
	}


	/**
	 * @return the timezoneName
	 */
	public String getTimezoneName() {
		return timezoneName;
	}


	/**
	 * @param timezoneName the timezoneName to set
	 */
	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}


	/**
	 * @return the utcOffset
	 */
	public Integer getUtcOffset() {
		return utcOffset;
	}


	/**
	 * @param utcOffset the utcOffset to set
	 */
	public void setUtcOffset(Integer utcOffset) {
		this.utcOffset = utcOffset;
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
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((timezoneId == null) ? 0 : timezoneId.hashCode());
		result = prime * result + ((timezoneName == null) ? 0 : timezoneName.hashCode());
		result = prime * result + ((utcOffset == null) ? 0 : utcOffset.hashCode());
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
		TimezoneDetail other = (TimezoneDetail) obj;
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
		if (timezoneId == null) {
			if (other.timezoneId != null)
				return false;
		} else if (!timezoneId.equals(other.timezoneId))
			return false;
		if (timezoneName == null) {
			if (other.timezoneName != null)
				return false;
		} else if (!timezoneName.equals(other.timezoneName))
			return false;
		if (utcOffset == null) {
			if (other.utcOffset != null)
				return false;
		} else if (!utcOffset.equals(other.utcOffset))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TimezoneDetail [timezoneId=" + timezoneId + ", timezoneName=" + timezoneName + ", utcOffset="
				+ utcOffset + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
	
}
