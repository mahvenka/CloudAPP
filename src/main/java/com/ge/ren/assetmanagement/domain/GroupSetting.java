/**
 * 
 */
package com.ge.ren.assetmanagement.domain;

import java.io.Serializable;
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
@Table(name = "group_settings")
public class GroupSetting implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6051297685740205938L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="group_setting_id")
	private Long groupSettingId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_group_id")
	private SiteGroup siteGroupSetting;

	@Column(name="group_start_time")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime groupStartTime;
	
	@Column(name="group_end_time")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime groupEndTime;
	
	@Column(name="group_max_overtime")
	private Integer groupMaxOvertime;
	
	@Column(name="group_max_shift_variation")
	private Integer groupMaxShiftVariation;
	
	@Column(name="group_plan_run_priority")
	private Integer groupPlanRunPriority;
	
	@Column(name="group_plan_run_time")
	private Integer groupPlanRunTime;
	
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
	
	public GroupSetting(){
		
	}
	
	public GroupSetting(Long groupSettingId, SiteGroup siteGroupSetting, LocalDateTime groupStartTime,
			LocalDateTime groupEndTime, Integer groupMaxOvertime, Integer groupMaxShiftVariation,
			Integer groupPlanRunPriority, Integer groupPlanRunTime, String createdBy, LocalDateTime createdOn,
			String lastUpdatedBy, LocalDateTime lastUpdatedOn) {
		this.groupSettingId = groupSettingId;
		this.siteGroupSetting = siteGroupSetting;
		this.groupStartTime = groupStartTime;
		this.groupEndTime = groupEndTime;
		this.groupMaxOvertime = groupMaxOvertime;
		this.groupMaxShiftVariation = groupMaxShiftVariation;
		this.groupPlanRunPriority = groupPlanRunPriority;
		this.groupPlanRunTime = groupPlanRunTime;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	/**
	 * @return the groupSettingId
	 */
	public Long getGroupSettingId() {
		return groupSettingId;
	}

	/**
	 * @param groupSettingId the groupSettingId to set
	 */
	public void setGroupSettingId(Long groupSettingId) {
		this.groupSettingId = groupSettingId;
	}
	
	/**
	 * @return the siteGroupSetting
	 */
	public SiteGroup getSiteGroupSetting() {
		return siteGroupSetting;
	}

	/**
	 * @param siteGroupSetting the siteGroupSetting to set
	 */
	public void setSiteGroupSetting(SiteGroup siteGroupSetting) {
		this.siteGroupSetting = siteGroupSetting;
	}

	/**
	 * @return the groupStartTime
	 */
	public LocalDateTime getGroupStartTime() {
		return groupStartTime;
	}

	/**
	 * @param groupStartTime the groupStartTime to set
	 */
	public void setGroupStartTime(LocalDateTime groupStartTime) {
		this.groupStartTime = groupStartTime;
	}

	/**
	 * @return the groupEndTime
	 */
	public LocalDateTime getGroupEndTime() {
		return groupEndTime;
	}

	/**
	 * @param groupEndTime the groupEndTime to set
	 */
	public void setGroupEndTime(LocalDateTime groupEndTime) {
		this.groupEndTime = groupEndTime;
	}

	/**
	 * @return the groupMaxOvertime
	 */
	public Integer getGroupMaxOvertime() {
		return groupMaxOvertime;
	}

	/**
	 * @param groupMaxOvertime the groupMaxOvertime to set
	 */
	public void setGroupMaxOvertime(Integer groupMaxOvertime) {
		this.groupMaxOvertime = groupMaxOvertime;
	}

	/**
	 * @return the groupMaxShiftVariation
	 */
	public Integer getGroupMaxShiftVariation() {
		return groupMaxShiftVariation;
	}

	/**
	 * @param groupMaxShiftVariation the groupMaxShiftVariation to set
	 */
	public void setGroupMaxShiftVariation(Integer groupMaxShiftVariation) {
		this.groupMaxShiftVariation = groupMaxShiftVariation;
	}

	/**
	 * @return the groupPlanRunPriority
	 */
	public Integer getGroupPlanRunPriority() {
		return groupPlanRunPriority;
	}

	/**
	 * @param groupPlanRunPriority the groupPlanRunPriority to set
	 */
	public void setGroupPlanRunPriority(Integer groupPlanRunPriority) {
		this.groupPlanRunPriority = groupPlanRunPriority;
	}

	/**
	 * @return the groupPlanRunTime
	 */
	public Integer getGroupPlanRunTime() {
		return groupPlanRunTime;
	}

	/**
	 * @param groupPlanRunTime the groupPlanRunTime to set
	 */
	public void setGroupPlanRunTime(Integer groupPlanRunTime) {
		this.groupPlanRunTime = groupPlanRunTime;
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
		return "GroupSetting [groupSettingId=" + groupSettingId + ", siteGroupSetting=" + siteGroupSetting
				+ ", groupStartTime=" + groupStartTime + ", groupEndTime=" + groupEndTime + ", groupMaxOvertime="
				+ groupMaxOvertime + ", groupMaxShiftVariation=" + groupMaxShiftVariation + ", groupPlanRunPriority="
				+ groupPlanRunPriority + ", groupPlanRunTime=" + groupPlanRunTime + ", createdBy=" + createdBy
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
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((groupEndTime == null) ? 0 : groupEndTime.hashCode());
		result = prime * result + ((groupMaxOvertime == null) ? 0 : groupMaxOvertime.hashCode());
		result = prime * result + ((groupMaxShiftVariation == null) ? 0 : groupMaxShiftVariation.hashCode());
		result = prime * result + ((groupPlanRunPriority == null) ? 0 : groupPlanRunPriority.hashCode());
		result = prime * result + ((groupPlanRunTime == null) ? 0 : groupPlanRunTime.hashCode());
		result = prime * result + ((groupSettingId == null) ? 0 : groupSettingId.hashCode());
		result = prime * result + ((groupStartTime == null) ? 0 : groupStartTime.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedOn == null) ? 0 : lastUpdatedOn.hashCode());
		result = prime * result + ((siteGroupSetting == null) ? 0 : siteGroupSetting.hashCode());
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
		GroupSetting other = (GroupSetting) obj;
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
		if (groupEndTime == null) {
			if (other.groupEndTime != null)
				return false;
		} else if (!groupEndTime.equals(other.groupEndTime))
			return false;
		if (groupMaxOvertime == null) {
			if (other.groupMaxOvertime != null)
				return false;
		} else if (!groupMaxOvertime.equals(other.groupMaxOvertime))
			return false;
		if (groupMaxShiftVariation == null) {
			if (other.groupMaxShiftVariation != null)
				return false;
		} else if (!groupMaxShiftVariation.equals(other.groupMaxShiftVariation))
			return false;
		if (groupPlanRunPriority == null) {
			if (other.groupPlanRunPriority != null)
				return false;
		} else if (!groupPlanRunPriority.equals(other.groupPlanRunPriority))
			return false;
		if (groupPlanRunTime == null) {
			if (other.groupPlanRunTime != null)
				return false;
		} else if (!groupPlanRunTime.equals(other.groupPlanRunTime))
			return false;
		if (groupSettingId == null) {
			if (other.groupSettingId != null)
				return false;
		} else if (!groupSettingId.equals(other.groupSettingId))
			return false;
		if (groupStartTime == null) {
			if (other.groupStartTime != null)
				return false;
		} else if (!groupStartTime.equals(other.groupStartTime))
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
		if (siteGroupSetting == null) {
			if (other.siteGroupSetting != null)
				return false;
		} else if (!siteGroupSetting.equals(other.siteGroupSetting))
			return false;
		return true;
	}
	
}
