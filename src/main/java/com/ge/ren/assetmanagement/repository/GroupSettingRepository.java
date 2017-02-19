/**
 * 
 */
package com.ge.ren.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.ren.assetmanagement.domain.GroupSetting;

/**
 * @author 502687773
 *
 */
public interface GroupSettingRepository extends JpaRepository<GroupSetting, Long> {

	List<GroupSetting> findAll();
	
	GroupSetting findByGroupSettingId(Long groupSettingId);
}
