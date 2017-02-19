/**
 * 
 */
package com.ge.ren.assetmanagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import com.ge.ren.assetmanagement.domain.Asset;
import com.ge.ren.assetmanagement.domain.AssetComponent;
import com.ge.ren.assetmanagement.domain.AssetLocation;
import com.ge.ren.assetmanagement.domain.AssetSection;
import com.ge.ren.assetmanagement.domain.AssetType;
import com.ge.ren.assetmanagement.domain.CommonCode;
import com.ge.ren.assetmanagement.dto.AssetComponentDto;
import com.ge.ren.assetmanagement.dto.AssetDto;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;
import com.ge.ren.assetmanagement.dto.CommonCodeDto;
import com.ge.ren.assetmanagement.dto.converters.AssetEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.AssetTypeEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.CommonCodeEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.ComponentEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.LocationEntityDtoConverter;
import com.ge.ren.assetmanagement.dto.converters.SectionEntityDtoConverter;
import com.ge.ren.assetmanagement.repository.IAssetRepository;
import com.ge.ren.assetmanagement.repository.IAssetTypeRepository;
import com.ge.ren.assetmanagement.repository.ICommonCodeRepository;
import com.ge.ren.assetmanagement.repository.IComponentsRepository;
import com.ge.ren.assetmanagement.repository.ILocationsRepository;
import com.ge.ren.assetmanagement.repository.ISectionsRepository;
import com.ge.ren.assetmanagement.service.impl.AssetManagementService;

/**
 * @author 502585286
 *
 */
public class AssetManagementServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@InjectMocks
	private AssetManagementService service;

	private Asset asset;

	private AssetDto assetDto;

	private AssetComponent assetComponent;

	private AssetComponentDto assetComponentDto;

	private AssetSection assetSection;

	private AssetSectionDto assetSectionDto;

	private AssetLocation assetLocation;

	private AssetLocationDto assetLocationDto;

	private AssetType assetType;

	private AssetTypeDto assetTypeDto;

	private CommonCodeDto commonCodeDto;

	private CommonCode commonCode;

	@Mock
	private IAssetTypeRepository assetTypeRepo;

	@Mock
	private AssetTypeEntityDtoConverter assetTypeEntityDtoConverter;

	@Mock
	private IComponentsRepository componentsRepo;

	@Mock
	private ComponentEntityDtoConverter componentEntityDtoConverter;

	@Mock
	private IAssetRepository assetRepo;

	@Mock
	private AssetEntityDtoConverter assetConverter;

	@Mock
	private ISectionsRepository sectionsRepo;

	@Mock
	private SectionEntityDtoConverter sectionEntityDtoConverter;

	@Mock
	private ILocationsRepository locationsRepo;

	@Mock
	private LocationEntityDtoConverter locationEntityDtoConverter;

	@Mock
	private ICommonCodeRepository commonCodeRepo;

	@Mock
	private CommonCodeEntityDtoConverter commonCodeConverter;

	@Mock
	private ModelMapper modelMapper;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		prepareAsset();
		perpareAssetComponent();
		prepareAssetSection();
		prepareAssetLocation();
		prepareAssetType();
		prepareCommonCode();
	}

	private void prepareCommonCode() {

		commonCode = new CommonCode();
		commonCode.setdropdownType("TASK_PRIORITY");
		commonCode.setdropdownCode("1");
		commonCode.setdropdownValue("HIGH-FR");
		commonCode.setlanguageCode("FR");
		commonCodeDto = new CommonCodeDto();
		commonCodeDto.setdropdownType("TASK_PRIORITY");
		commonCodeDto.setdropdownCode("1");
		commonCodeDto.setdropdownValue("HIGH-FR");
		commonCodeDto.setlanguageCode("FR");
	}

	/**
	 * 
	 */
	private void prepareAsset() {
		asset = new Asset();
		asset.setAssetId(new Long(1001));
		asset.setAssetDisplayName("PAD Number A1");
		asset.setAssetName("A1");
		asset.setAssetSerialNumber("GIB1001");
		asset.setAssetTypeId(new Long(1));
		assetDto = new AssetDto();
		assetDto.setAssetId(new Long(1001));
		assetDto.setAssetDisplayName("PAD Number A1");
		assetDto.setAssetName("A1");
		assetDto.setAssetSerialNumber("GIB1001");
		assetDto.setAssetTypeId(new Long(1));

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}



	@Test
	public void testRetrieveAssetDetailsForValidInput() {

		List<Asset> assetList = new ArrayList<Asset>();
		assetList.add(asset);
		List<AssetDto> assetDtoList;
		Mockito.when(assetRepo.findBySiteDetail_SiteGroup_SiteGroupId(new Long(1))).thenReturn(assetList);
		Mockito.when(assetConverter.convertDomainEntityToDto(asset)).thenReturn(assetDto);
		assetDtoList = service.retrieveAssetDetails(new Long(1));
		assertNotNull("Errror: Returned Object is empty", assetDtoList);
		assertEquals("PAD Number A1", assetDtoList.get(0).getAssetDisplayName());
		assertEquals("A1", assetDtoList.get(0).getAssetName());
		assertEquals("GIB1001", assetDtoList.get(0).getAssetSerialNumber());
		assertEquals(new Long (1), assetDtoList.get(0).getAssetTypeId());
		assertEquals(new Long (1001), assetDtoList.get(0).getAssetId());
	}

	private void perpareAssetComponent() {
		assetComponent = new AssetComponent();
		assetComponent.setId(new Long(1001));
		assetComponent.setIsActive(new Boolean("True"));
		assetComponent.setAssetTypeNameDefault("MCE");
		assetComponentDto = new AssetComponentDto();
		assetComponentDto.setId(new Long(1001));
		assetComponentDto.setIsActive(new Boolean("True"));
		assetComponentDto.setAssetTypeNameDefault("MCE");

	}

	@Test
	public void testRetrieveComponentDetailsForValidInput() {

		List<AssetComponent> assetComponentList = new ArrayList<AssetComponent>();
		assetComponentList.add(assetComponent);
		List<AssetComponentDto> assetComponentDtoList;
		Mockito.when(componentsRepo.findByAssetSection_Id(new Long(1))).thenReturn(assetComponentList);
		Mockito.when(componentEntityDtoConverter.convertDomainEntityToDto(assetComponent)).thenReturn(assetComponentDto);
		assetComponentDtoList = service.retrieveComponentDetails(new Long(1));
		assertNotNull("Errror: Returned Object is empty", assetComponentDtoList);
		assertEquals(new Long(1001), assetComponentList.get(0).getId());
		assertEquals(new Boolean("True"), assetComponentList.get(0).getIsActive());
		assertEquals("MCE", assetComponentList.get(0).getAssetTypeNameDefault());
	}

	private void prepareAssetSection() {
		assetSection = new AssetSection();
		assetSection.setId(new Long(1002));
		assetSection.setIsActive(new Boolean("True"));
		assetSection.setSectionNameDefault("Houston");
		assetSection.setCreatedBy("SYSTEM");
		assetSectionDto = new AssetSectionDto();
		assetSectionDto.setId(new Long(1002));
		assetSectionDto.setIsActive(new Boolean("True"));
		assetSectionDto.setCreatedBy("SYSTEM");
		assetSectionDto.setSectionNameDefault("Houston");
	}

	@Test
	public void testRetrieveSectionDetailsForValidInput() {

		List<AssetSection> assetSectionList = new ArrayList<AssetSection>();
		assetSectionList.add(assetSection);
		List<AssetSectionDto> assetSectionDtoList;
		Mockito.when(sectionsRepo.findByAssetLocation_Id(new Long(1))).thenReturn(assetSectionList);
		Mockito.when(sectionEntityDtoConverter.convertDomainEntityToDto(assetSection)).thenReturn(assetSectionDto);
		assetSectionDtoList = service.retrieveSectionDetails(new Long(1));
		assertNotNull("Errror: Returned Object is empty", assetSectionDtoList);
		assertEquals(new Long(1002), assetSectionDtoList.get(0).getId());
		assertEquals(new Boolean("True"), assetSectionDtoList.get(0).getIsActive());
		assertEquals("Houston", assetSectionDtoList.get(0).getSectionNameDefault());
		assertEquals("SYSTEM", assetSectionDtoList.get(0).getCreatedBy());

	}

	private void prepareAssetLocation() {
		assetLocation = new AssetLocation();
		assetLocation.setId(new Long(12));
		assetLocation.setIsActive(new Boolean("True"));
		assetLocation.setCreatedBy("SYSTEM");
		assetLocation.setLocationNameDefault("New York");
		assetLocationDto = new AssetLocationDto();
		assetLocationDto.setId(new Long(12));
		assetLocationDto.setIsActive(new Boolean("True"));
		assetLocationDto.setCreatedBy("SYSTEM");
		assetLocationDto.setLocationNameDefault("New York");

	}

	@Test
	public void testRetrieveLocationDetailsForValidInput() {
		List<AssetLocation> assetLocationList = new ArrayList<AssetLocation>();
		assetLocationList.add(assetLocation);
		List<AssetLocationDto> assetLocationDtoList;
		Mockito.when(locationsRepo.findByAssetType_AssetTypeId(new Long(1))).thenReturn(assetLocationList);
		Mockito.when(locationEntityDtoConverter.convertDomainEntityToDto(assetLocation)).thenReturn(assetLocationDto);
		assetLocationDtoList = service.retrieveLocationDetails(new Long(1));
		assertNotNull("Errror: Returned Object is empty", assetLocationDtoList);
		assertEquals(new Long(12), assetLocationDtoList.get(0).getId());
		assertEquals("SYSTEM", assetLocationDtoList.get(0).getCreatedBy());
		assertEquals(new Boolean("True"), assetLocationDtoList.get(0).getIsActive());
		assertEquals("New York", assetLocationDtoList.get(0).getLocationNameDefault());

	}

	private void prepareAssetType() {
		assetType = new AssetType();
		assetType.setAssetTypeId(new Long(13));
		assetType.setCreatedBy("SYSTEM");
		assetType.setAssetTypeNameDefault("Energy");
		assetType.setIsActive(new Boolean("True"));
		assetTypeDto = new AssetTypeDto();
		assetTypeDto.setAssetTypeId(new Long(13));
		assetTypeDto.setIsActive(new Boolean("True"));
		assetTypeDto.setCreatedBy("SYSTEM");
		assetTypeDto.setAssetTypeNameDefault("Energy");

	}

	@Test
	public void testRetrieveAssetTypeDetailsForValidInput() {
		List<AssetType> assetTypeList = new ArrayList<AssetType>();
		assetTypeList.add(assetType);
		List<AssetTypeDto> assetTypeDtoList;
		Mockito.when(assetTypeRepo.findAll()).thenReturn(assetTypeList);
		Mockito.when(assetTypeEntityDtoConverter.convertDomainEntityToDto(assetType)).thenReturn(assetTypeDto);
		assetTypeDtoList = service.retrieveAssetTypeDetails(new Long(1));
		assertNotNull("Errror: Returned Object is empty", assetTypeDtoList);
		assertEquals(new Long(13), assetTypeDtoList.get(0).getAssetTypeId());
		assertEquals(new Boolean("True"), assetTypeDtoList.get(0).getIsActive());
		assertEquals("SYSTEM", assetTypeDtoList.get(0).getCreatedBy());
		assertEquals("Energy", assetTypeDtoList.get(0).getAssetTypeNameDefault());
	}

	@Test
	public void testFindAllCodes() {

		List<CommonCode> commonCodeList = new ArrayList<CommonCode>();
		commonCodeList.add(commonCode);
		List<CommonCodeDto> commonCodeDtoList;
		Mockito.when(commonCodeRepo.findByDropdownTypeAndLanguageCode("TASK_PRIORITY", "FR")).thenReturn(commonCodeList);
		Mockito.when(commonCodeConverter.convertDomainEntityToDto(commonCode)).thenReturn(commonCodeDto);
		commonCodeDtoList = service.findAllCodes("TASK_PRIORITY", "FR");
		assertNotNull("Errror: Returned Object is empty", commonCodeDtoList);
		assertEquals("HIGH-FR", commonCodeDtoList.get(0).getdropdownValue());
		assertEquals("1", commonCodeDtoList.get(0).getdropdownCode());

	}


	@Test
	public void testFindCode() {

		CommonCodeDto dto;
		Mockito.when(commonCodeRepo.findByDropdownTypeAndDropdownCodeAndLanguageCode("TASK_PRIORITY","1","FR")).thenReturn(commonCode);
		Mockito.when(commonCodeConverter.convertDomainEntityToDto(commonCode)).thenReturn(commonCodeDto);
		dto = service.findCode("TASK_PRIORITY","1","FR");
		assertNotNull("Errror: Returned Object is empty", dto);
		assertEquals("HIGH-FR", dto.getdropdownValue());
		assertEquals("1", dto.getdropdownCode());
		assertEquals("TASK_PRIORITY", dto.getdropdownType());

	}

}
