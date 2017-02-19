/**
 * 
 */
package com.ge.ren.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.ren.assetmanagement.domain.GroupContractDetail;

/**
 * @author 502687773
 *
 */
public interface GroupContractDetailRepository extends JpaRepository<GroupContractDetail, Long> {

	List<GroupContractDetail> findAll();
}
