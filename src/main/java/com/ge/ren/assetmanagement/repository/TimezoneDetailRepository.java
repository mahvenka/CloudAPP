/**
 * 
 */
package com.ge.ren.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.ren.assetmanagement.domain.TimezoneDetail;

/**
 * @author 502687773
 *
 */
public interface TimezoneDetailRepository extends JpaRepository<TimezoneDetail, Long> {

	List<TimezoneDetail> findAll();
	
	TimezoneDetail findByTimezoneName(String timezoneName);
}
