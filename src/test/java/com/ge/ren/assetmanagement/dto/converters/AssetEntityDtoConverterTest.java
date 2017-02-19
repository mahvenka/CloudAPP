/**
 * 
 */
package com.ge.ren.assetmanagement.dto.converters;

import static org.junit.Assert.assertNotNull;

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
import com.ge.ren.assetmanagement.dto.AssetComponentDto;
import com.ge.ren.assetmanagement.dto.AssetDto;
import com.ge.ren.assetmanagement.dto.AssetLocationDto;
import com.ge.ren.assetmanagement.dto.AssetSectionDto;
import com.ge.ren.assetmanagement.dto.AssetTypeDto;
import com.ge.ren.assetmanagement.dto.converters.AssetEntityDtoConverter;

/**
 * @author 502585286
 *
 */
public class AssetEntityDtoConverterTest {

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

	@InjectMocks
	private AssetEntityDtoConverter assetConverter;
	
	@InjectMocks
	private ComponentEntityDtoConverter componentEntityDtoConverter;

	@InjectMocks
	private SectionEntityDtoConverter sectionEntityDtoConverter;
	
	@InjectMocks
	private AssetTypeEntityDtoConverter assetTypeEntityDtoConverter;
	
	@InjectMocks
	private LocationEntityDtoConverter locationEntityDtoConverter;

	@Mock
	private ModelMapper modelMapper;


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


	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		prepareAsset();
		perpareAssetComponent();
		prepareAssetSection();
		prepareAssetLocation();
		prepareAssetType();
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

	@Test
	public void testAssetConvertDomainEntityToDto() {

		Mockito.when(modelMapper.map(asset, AssetDto.class)).thenReturn(assetDto);
		AssetDto dto = assetConverter.convertDomainEntityToDto(asset);
		assertNotNull("Errror:Returned Object is empty", dto);

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
	public void testAssetComponentConvertDomainEntityToDto() {
	  Mockito.when(modelMapper.map(assetComponent, AssetComponentDto.class)).thenReturn(assetComponentDto);
	  AssetComponentDto assetComDto = componentEntityDtoConverter.convertDomainEntityToDto(assetComponent);
	  assertNotNull("Errror:Returned Object is empty", assetComDto);
	  
	}
	
	private void prepareAssetSection() {
		assetSection = new AssetSection();
		assetSection.setId(new Long(1001));
		assetSection.setCreatedBy("SYSTEM");
		assetSection.setIsActive(new Boolean("True"));
		assetSection.setSectionNameDefault("Texas");
		assetSection.setLastUpdatedBy("system");
		assetSectionDto = new AssetSectionDto();
		assetSectionDto.setId(new Long(1001));
		assetSectionDto.setCreatedBy("SYSTEM");
		assetSectionDto.setIsActive(new Boolean("True"));
		assetSectionDto.setSectionNameDefault("Texas");
		assetSectionDto.setLastUpdatedBy("system");
	}
	
	@Test
	public void testAssetSectionConvertDomainEntityToDto() {
		Mockito.when(modelMapper.map(assetSection, AssetSectionDto.class)).thenReturn(assetSectionDto);
		AssetSectionDto assetSectionDto = sectionEntityDtoConverter.convertDomainEntityToDto(assetSection);
		assertNotNull("Errror:Returned Object is empty", assetSectionDto);
	}
	     
	private void prepareAssetLocation() {
		assetLocation = new AssetLocation();
		assetLocation.setId(new Long(102));
		assetLocation.setIsActive(new Boolean("True"));
		assetLocation.setCreatedBy("system");
		assetLocation.setLocationNameDefault("java");
		assetLocationDto = new AssetLocationDto();
		assetLocationDto.setId(new Long(102));
		assetLocationDto.setCreatedBy("system");
		assetLocationDto.setIsActive(new Boolean("True"));
		assetLocationDto.setLocationNameDefault("java");
	}
	
	@Test
	public void testAssetLocationConvertDomainEntityToDto() {
		Mockito.when(modelMapper.map(assetLocation, AssetLocationDto.class)).thenReturn(assetLocationDto);
		AssetLocationDto assetLocationDto = locationEntityDtoConverter.convertDomainEntityToDto(assetLocation);
		assertNotNull("Errror:Returned Object is empty", assetLocationDto);
	}
	
	private void prepareAssetType() {
		assetType = new AssetType();
		assetType.setAssetTypeId(new Long(122));
		assetType.setCreatedBy("system");
		assetType.setIsActive(new Boolean("True"));
		assetType.setAssetTypeNameDefault("MEES");
		assetTypeDto = new AssetTypeDto();
		assetTypeDto.setAssetTypeId(new Long(122));
		assetTypeDto.setCreatedBy("system");
		assetTypeDto.setIsActive(new Boolean("True"));
		assetTypeDto.setAssetTypeNameDefault("MEES");
	}
	
	@Test
	public void testAssetTypeConvertDomainEntityToDto() {
		Mockito.when(modelMapper.map(assetType, AssetTypeDto.class)).thenReturn(assetTypeDto);
		AssetTypeDto assetTypeDto = assetTypeEntityDtoConverter.convertDomainEntityToDto(assetType);
		assertNotNull("Errror:Returned Object is empty", assetTypeDto);
	}
}
