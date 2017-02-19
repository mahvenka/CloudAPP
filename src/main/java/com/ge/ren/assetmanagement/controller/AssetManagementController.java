/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ge.ren.assetmanagement.dto.AssetComponentDto;
import com.ge.ren.assetmanagement.dto.AssetDto;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;
import com.ge.ren.assetmanagement.dto.CommonCodeDto;
import com.ge.ren.assetmanagement.dto.GroupSettingDto;
import com.ge.ren.assetmanagement.dto.SiteGroupDto;
import com.ge.ren.assetmanagement.dto.TimezoneDetailDto;
import com.ge.ren.assetmanagement.service.IAssetManagementService;

import io.swagger.annotations.ApiOperation;

/**
 *
 * @author Yessesvy
 */
@Controller
@RequestMapping("/assetmanagement")
public class AssetManagementController {

	@Autowired
	private IAssetManagementService iAsstMgmtSrv;

	@ApiOperation(value = "Retreive the asset details", response = ResponseEntity.class)
	@RequestMapping(value = "/assetType", method = RequestMethod.GET)
	public ResponseEntity<List<AssetTypeDto>> retrieveAssetTypeDetails(
			@RequestParam(value = "assetTypeId", required = true) Long assetTypeId) {
		return new ResponseEntity<>(iAsstMgmtSrv.retrieveAssetTypeDetails(assetTypeId), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreive the asset location details", response = ResponseEntity.class)
	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public ResponseEntity<List<AssetLocationDto>> retrieveLocationDropdownDetails(
			@RequestParam(value = "assetTypeId", required = true) Long assetTypeId) {
		return new ResponseEntity<>(iAsstMgmtSrv.retrieveLocationDetails(assetTypeId), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreive the asset section details", response = ResponseEntity.class)
	@RequestMapping(value = "/section", method = RequestMethod.GET)
	public ResponseEntity<List<AssetSectionDto>> retrieveSectionDropdownDetails(
			@RequestParam(value = "locationId", required = true) Long locationId) {
		return new ResponseEntity<>(iAsstMgmtSrv.retrieveSectionDetails(locationId), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreives the asset component details", response = ResponseEntity.class)
	@RequestMapping(value = "/component", method = RequestMethod.GET)
	public ResponseEntity<List<AssetComponentDto>> retrieveComponentDropdownDetails(
			@RequestParam(value = "sectionId", required = true) Long sectionId) {
		return new ResponseEntity<>(iAsstMgmtSrv.retrieveComponentDetails(sectionId),
				HttpStatus.OK);
	}

	@ApiOperation(value = "Retreives the asset details for the Site Group", response = ResponseEntity.class)
	@RequestMapping(value = "/asset", method = RequestMethod.GET)
	public ResponseEntity<List<AssetDto>> retrieveAssetDetails(
			@RequestParam(value = "siteGroupId", required = true) Long siteGroupId) {
		return new ResponseEntity<>(iAsstMgmtSrv.retrieveAssetDetails(siteGroupId), HttpStatus.OK);
	}


	@ApiOperation(value = "Retreives the dropdown details for the dropdown type and language", response = ResponseEntity.class)
	@RequestMapping(value = "/allCodes", method = RequestMethod.GET)
	public ResponseEntity<List<CommonCodeDto>> findAllCodes(
			@RequestParam(value = "dropdownType", required = true) String dropdownType,
			@RequestParam(value = "languageCode", required = true) String languageCode){
		return new ResponseEntity<>(iAsstMgmtSrv.findAllCodes(dropdownType, languageCode), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreives one dropdown value for the dropdown type, code and language", response = ResponseEntity.class)
	@RequestMapping(value = "/code", method = RequestMethod.GET)
	public ResponseEntity<CommonCodeDto> findCode(
			@RequestParam(value = "dropdownType", required = true) String dropdownType,
			@RequestParam(value = "dropdownCode", required = true) String dropdownCode,
			@RequestParam(value = "languageCode", required = true) String languageCode){
		return new ResponseEntity<>(iAsstMgmtSrv.findCode(dropdownType,dropdownCode, languageCode), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retreives the timezone details for the timezone name", response = ResponseEntity.class)
	@RequestMapping(value = "/timezone", method = RequestMethod.GET)
	public ResponseEntity<TimezoneDetailDto> getTimezoneByTimezoneName(
			@RequestParam(value = "timezoneName", required = true) String timezoneName) {		
		return new ResponseEntity<>(iAsstMgmtSrv.getTimezoneByTimezoneName(timezoneName), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreives all timezone details", response = ResponseEntity.class)
	@RequestMapping(value = "/allTimezone", method = RequestMethod.GET)
	public ResponseEntity<List<TimezoneDetailDto>> getTimezoneDetail() {
		return new ResponseEntity<List<TimezoneDetailDto>>(iAsstMgmtSrv.getTimezoneDetail(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Update site group for maintaing site settings", response = ResponseEntity.class)
	@RequestMapping(value = "/siteSettings/update", method = RequestMethod.PUT)
	public ResponseEntity<SiteGroupDto> updateSiteSettings(@RequestBody SiteGroupDto siteGroupDto) {
		return new ResponseEntity<>(iAsstMgmtSrv.updateSiteSettings(siteGroupDto), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retreives all site group for maintaing site settings", response = ResponseEntity.class)
	@RequestMapping(value = "/allSiteGroup", method = RequestMethod.GET)
	public ResponseEntity<SiteGroupDto> getSiteGroup(
			@RequestParam(value = "siteGroupId", required = true) Long siteGroupId) {
		return new ResponseEntity<>(iAsstMgmtSrv.getSiteGroup(siteGroupId), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retreives all site group for maintaing site settings", response = ResponseEntity.class)
	@RequestMapping(value = "/allGroupSetting", method = RequestMethod.GET)
	public ResponseEntity<GroupSettingDto> groupSetting(
			@RequestParam(value = "groupSettingId", required = true) Long groupSettingId) {
		return new ResponseEntity<>(iAsstMgmtSrv.getGroupSetting(groupSettingId), HttpStatus.OK);
	}
	
}
