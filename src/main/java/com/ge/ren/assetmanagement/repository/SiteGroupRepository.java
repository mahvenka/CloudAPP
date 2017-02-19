/**
 * 
 */
package com.ge.ren.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.ren.assetmanagement.domain.SiteGroup;

/**
 * @author 502687773
 *
 */
public interface SiteGroupRepository extends JpaRepository<SiteGroup, Long> {

	List<SiteGroup> findAll();
	
	SiteGroup findBySiteGroupId(Long siteGroupId);
	
}
