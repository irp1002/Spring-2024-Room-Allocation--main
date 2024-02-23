
package edu.sru.group7.roomallocation.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.sru.group7.roomallocation.domain.*;

import edu.sru.group7.roomallocation.repositories.*;

@Controller
public class DropdownOptionController {
	
	@Autowired
    private SpaceUseCodeRepository spaceUseCodeRepository;
	
	@Autowired
    private SpaceConditionRepository spaceConditionRepository;
	
	@Autowired
	private FurnitureRepository furnitureRepository;
	
	@Autowired
	private StructuralFeaturesRepository structuralFeaturesRepository;
	
	@Autowired
	private ZoomRepository zoomRepository;
	
	@Autowired
	private PodiumStationTypeRepository podiumStationTypeRepository;
	
	@Autowired
	private ConsoleCompModelRepository consoleCompModelRepository;
	
    @Autowired
    private ProjDisplayTypeRepository projDisplayTypeRepository;
    
    @Autowired
    private ProjMakeModelNumberRepository projMakeModelNumberRepository;
    
    @Autowired
    private CrestonModelRepository crestonModelRepository;
    
    @Autowired
    private AudioDescRepository audioDescRepository;
    
	@Autowired
	private InterWhiteBoardRepository interWhiteBoardRepository;
	
	@Autowired
	private BuildingsRepository buildingsRepository;

    
	public DropdownOptionController() {
	}

    public DropdownOptionController(SpaceUseCodeRepository spaceUseCodeRepository,
                                    SpaceConditionRepository spaceConditionRepository,
                                    FurnitureRepository furnitureRepository,
                                    StructuralFeaturesRepository structuralFeaturesRepository,
                                    ZoomRepository zoomRepository,
                                    PodiumStationTypeRepository podiumStationTypeRepository,
                                    ConsoleCompModelRepository consoleCompModelRepository,
                                    ProjDisplayTypeRepository projDisplayTypeRepository,
                                    ProjMakeModelNumberRepository projMakeModelNumberRepository,
                                    CrestonModelRepository crestonModelRepository,
                                    AudioDescRepository audioDescRepository,
                                    InterWhiteBoardRepository interWhiteBoardRepository,
                                    BuildingsRepository buildingsRepository
                                    ) {
        
        this.spaceUseCodeRepository = spaceUseCodeRepository;
        this.spaceConditionRepository = spaceConditionRepository;
        this.furnitureRepository = furnitureRepository;
        this.structuralFeaturesRepository = structuralFeaturesRepository;
        this.zoomRepository = zoomRepository;
        this.podiumStationTypeRepository = podiumStationTypeRepository;
        this.consoleCompModelRepository = consoleCompModelRepository;
        this.projDisplayTypeRepository = projDisplayTypeRepository;
        this.projMakeModelNumberRepository = projMakeModelNumberRepository;
        this.crestonModelRepository = crestonModelRepository;
        this.audioDescRepository = audioDescRepository;
        this.interWhiteBoardRepository = interWhiteBoardRepository;
        this.buildingsRepository = buildingsRepository;
        
    }
    
    
    //Mapping for the /admin URL when initiated through Tomcat
    //lists all the dropdown options for admin to manage
    @RequestMapping({ "/list" })
    public String showDropdownList (Model model) {
        model.addAttribute("spaceUseCodeOptions", spaceUseCodeRepository.findAll());
        model.addAttribute("spaceConditionOptions", spaceConditionRepository.findAll());
		model.addAttribute("furnitureOptions", furnitureRepository.findAll()); 
		model.addAttribute("structuralFeaturesOptions", structuralFeaturesRepository.findAll());
		model.addAttribute("zoomOptions", zoomRepository.findAll());
		model.addAttribute("podiumStationTypeOptions", podiumStationTypeRepository.findAll());
		model.addAttribute("consoleCompModelOptions", consoleCompModelRepository.findAll());	
		model.addAttribute("projDisplayTypeOptions", projDisplayTypeRepository.findAll());
		model.addAttribute("projMakeModelNumberOptions", projMakeModelNumberRepository.findAll());
		model.addAttribute("crestonModelOptions", crestonModelRepository.findAll());
		model.addAttribute("audioDescOptions", audioDescRepository.findAll());
		model.addAttribute("interWhiteBoardOptions", interWhiteBoardRepository.findAll());
		model.addAttribute("buildingsOptions", buildingsRepository.findAll());
	
        
		
		  model.addAttribute("addEndpointSpaceUseCode", "/spaceUseCode/add");
		  model.addAttribute("newDropdownOptionSpaceUseCode", new SpaceUseCode());
		 
        
        model.addAttribute("addEndpointSpaceCondition", "/spaceCondition/add");
        model.addAttribute("newDropdownOptionSpaceCondition", new SpaceCondition());
        
        model.addAttribute("addEndpointFurniture", "/furniture/add");
        model.addAttribute("newDropdownOptionFurniture", new Furniture());
        
        model.addAttribute("addEndpointStructuralFeatures", "/structuralFeatures/add");
        model.addAttribute("newDropdownOptionStructuralFeatures", new StructuralFeatures());
        
        model.addAttribute("addEndpointZoom", "/zoom/add");
        model.addAttribute("newDropdownOptionZoom", new Zoom());
        
        model.addAttribute("addEndpointPodiumStationType", "/podiumStationType/add");
        model.addAttribute("newDropdownOptionPodiumStationType", new PodiumStationType());
        
        model.addAttribute("addEndpointConsoleCompModel", "/consoleCompModel/add");
        model.addAttribute("newDropdownOptionConsoleCompModel", new ConsoleCompModel());
        
        model.addAttribute("addEndpointProjDisplayType", "/projDisplayType/add");
        model.addAttribute("newDropdownOptionProjDisplayType", new ProjDisplayType());
        
        model.addAttribute("addEndpointProjMakeModelNumber", "/projMakeModelNumber/add");
        model.addAttribute("newDropdownOptionProjMakeModelNumber", new ProjMakeModelNumber());
        
        model.addAttribute("addEndpointCrestonModel", "/crestonModel/add");
        model.addAttribute("newDropdownOptionCrestonModel", new CrestonModel());
        
        model.addAttribute("addEndpointAudioDesc", "/audioDesc/add");
        model.addAttribute("newDropdownOptionAudioDesc", new AudioDesc());
        
        model.addAttribute("addEndpointInterWhiteBoard", "/interWhiteBoard/add");
        model.addAttribute("newDropdownOptionInterWhiteBoard", new InterWhiteBoard());
        
        model.addAttribute("addEndpointBuildings", "/buildings/add");
		model.addAttribute("newDropdownOptionBuildings", new Buildings());
        
    	return "list";
    }
    
  //Crud operations for SpaceUseCode
    @GetMapping("/spaceUseCode/add")
    public String addSpaceUseCodeForm(Model model) {
		/*
		 * model.addAttribute("addEndpointSpaceUseCode", "/spaceUseCode/add");
		 * model.addAttribute("newDropdownOptionSpaceUseCode", new SpaceUseCode());
		 */
        return "list"; //"add-option"; 
    }

    @PostMapping("/spaceUseCode/add")
    public String addSpaceUseCode(@ModelAttribute("spaceUseCode") SpaceUseCode spaceUseCode) {
        spaceUseCodeRepository.save(spaceUseCode);
        return "redirect:/list";
    }

    @GetMapping("/spaceUseCode/delete/{id}")
    public String deleteSpaceUseCode(@PathVariable Integer id) {
        spaceUseCodeRepository.deleteById(id);
        return "redirect:/list";
    }
    
    //Crud operations for SpaceCondition
    @GetMapping("/spaceCondition/add")
    public String addSpaceConditionForm(Model model) {
		/*
		 * model.addAttribute("addEndpointSpaceCondition", "/spaceCondition/add");
		 * model.addAttribute("newDropdownOptionSpaceCondition", new SpaceCondition());
		 */
        return "list";//"add-option";
    }

    @PostMapping("/spaceCondition/add")
    public String addSpaceCondition(@ModelAttribute("spaceCondition") SpaceCondition spaceCondition) {
        spaceConditionRepository.save(spaceCondition);
        return "redirect:/list";
    }

    @GetMapping("/spaceCondition/delete/{id}")
    public String deleteSpaceCondition(@PathVariable Integer id) {
        spaceConditionRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
    //Crud operations for Furniture
    @GetMapping("/furniture/add")
    public String addFurnitureForm(Model model) {
		/*
		 * model.addAttribute("addEndpointFurniture", "/furniture/add");
		 * model.addAttribute("newDropdownOptionFurniture", new Furniture());
		 */
        return "list"; //"add-option"; 
    }

    @PostMapping("/furniture/add")
    public String addFurniture(@ModelAttribute("furniture") Furniture furniture) {
        furnitureRepository.save(furniture);
        return "redirect:/list";
    }

    @GetMapping("/furniture/delete/{id}")
    public String deleteFurniture(@PathVariable Integer id) {
        furnitureRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
    //Crud operations for StructuralFeatures
    @GetMapping("/structuralFeatures/add")
    public String addStructuralFeaturesForm(Model model) {
		/*
		 * model.addAttribute("addEndpointStructuralFeatures",
		 * "/structuralFeatures/add");
		 * model.addAttribute("newDropdownOptionStructuralFeatures", new
		 * StructuralFeatures());
		 */
        return "list"; //"add-option"; 
    }

    @PostMapping("/structuralFeatures/add")
    public String addStructuralFeatures(@ModelAttribute("structuralFeatures") StructuralFeatures structuralFeatures) {
    	structuralFeaturesRepository.save(structuralFeatures);
        return "redirect:/list";
    }

    @GetMapping("/structuralFeatures/delete/{id}")
    public String deleteStructuralFeatures(@PathVariable Integer id) {
    	structuralFeaturesRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
    //Crud operations for Furniture
    @GetMapping("/zoom/add")
    public String addZoomForm(Model model) {

        return "list"; //"add-option"; 
    }

    @PostMapping("/zoom/add")
    public String addZoom(@ModelAttribute("zoom") Zoom zoom) {
        zoomRepository.save(zoom);
        return "redirect:/list";
    }

    @GetMapping("/zoom/delete/{id}")
    public String deleteZoom(@PathVariable Integer id) {
        zoomRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
    //Crud operations for PodiumStationType
    @GetMapping("/podiumStationType/add")
    public String addPodiumStationTypeForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/podiumStationType/add")
    public String addPodiumStationType(@ModelAttribute("podiumStationType") PodiumStationType podiumStationType) {
    	podiumStationTypeRepository.save(podiumStationType);
        return "redirect:/list";
    }

    @GetMapping("/podiumStationType/delete/{id}")
    public String deletePodiumStationType(@PathVariable Integer id) {
    	podiumStationTypeRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
    //Crud operations for ConsoleCompModel
    @GetMapping("/consoleCompModel/add")
    public String addConsoleCompModelForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/consoleCompModel/add")
    public String addConsoleCompModel(@ModelAttribute("consoleCompModel") ConsoleCompModel consoleCompModel) {
    	consoleCompModelRepository.save(consoleCompModel);
        return "redirect:/list";
    }

    @GetMapping("/consoleCompModel/delete/{id}")
    public String deleteConsoleCompModel(@PathVariable Integer id) {
    	consoleCompModelRepository.deleteById(id);
        return "redirect:/list";
    }
    
  
    //Crud operations for ProjDisplayType
    @GetMapping("/projDisplayType/add")
    public String addProjDisplayTypeForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/projDisplayType/add")
    public String addProjDisplayType(@ModelAttribute("projDisplayType") ProjDisplayType projDisplayType) {
    	projDisplayTypeRepository.save(projDisplayType);
        return "redirect:/list";
    }

    @GetMapping("/projDisplayType/delete/{id}")
    public String deleteProjDisplayType(@PathVariable Integer id) {
    	projDisplayTypeRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
  //Crud operations for ProjMakeModelNumber
    @GetMapping("/projMakeModelNumber/add")
    public String addProjMakeModelNumberForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/projMakeModelNumber/add")
    public String addProjMakeModelNumber(@ModelAttribute("projMakeModelNumber") ProjMakeModelNumber projMakeModelNumber) {
    	projMakeModelNumberRepository.save(projMakeModelNumber);
        return "redirect:/list";
    }

    @GetMapping("/projMakeModelNumber/delete/{id}")
    public String deleteProjMakeModelNumber(@PathVariable Integer id) {
    	projMakeModelNumberRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
  //Crud operations for CrestonModel
    @GetMapping("/crestonModel/add")
    public String addCrestonModelForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/crestonModel/add")
    public String addCrestonModel(@ModelAttribute("crestonModel") CrestonModel crestonModel) {
    	crestonModelRepository.save(crestonModel);
        return "redirect:/list";
    }

    @GetMapping("/crestonModel/delete/{id}")
    public String deleteCrestonModel(@PathVariable Integer id) {
    	crestonModelRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
  //Crud operations for AudioDesc
    @GetMapping("/audioDesc/add")
    public String addAudioDescForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/audioDesc/add")
    public String addAudioDesc(@ModelAttribute("audioDesc") AudioDesc audioDesc) {
    	audioDescRepository.save(audioDesc);
        return "redirect:/list";
    }

    @GetMapping("/audioDesc/delete/{id}")
    public String deleteAudioDesc(@PathVariable Integer id) {
    	audioDescRepository.deleteById(id);
        return "redirect:/list";
    }
    
    
  //Crud operations for InterWhiteBoard
    @GetMapping("/interWhiteBoard/add")
    public String addInterWhiteBoardForm(Model model) {
        return "list"; //"add-option"; 
    }

    @PostMapping("/interWhiteBoard/add")
    public String addInterWhiteBoard(@ModelAttribute("interWhiteBoard") InterWhiteBoard interWhiteBoard) {
    	interWhiteBoardRepository.save(interWhiteBoard);
        return "redirect:/list";
    }

    @GetMapping("/interWhiteBoard/delete/{id}")
    public String deleteInterWhiteBoard(@PathVariable Integer id) {
    	interWhiteBoardRepository.deleteById(id);
        return "redirect:/list";
    }

  //Crud operations for Buildings
    @GetMapping("/buildings/add")
    public String addBuildingsForm(Model model) {
    	/*
    	 * model.addAttribute("addEndpointBuildings", "/buildings/add");
    	 * model.addAttribute("newDropdownOptionBuildings", new Buildings());
    	 */
        return "list"; //"add-option"; 
    }

    @PostMapping("/buildings/add")
    public String addBuildings(@ModelAttribute("buildings") Buildings buildings) {
        buildingsRepository.save(buildings);
        return "redirect:/list";
    }

    @GetMapping("/buildings/delete/{id}")
    public String deleteBuildings(@PathVariable Integer id) {
        buildingsRepository.deleteById(id);
        return "redirect:/list";
    }

    /**
    @GetMapping("/buildings/edit/{id}")
	public String showUpdateFormBuilding(@PathVariable("id") Integer id, Model model) {
		Buildings building = buildingsRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid building Id:" + id));
		
		
		// Makes a list of content in SpaceUseCode class
		List<SpaceUseCode> spaceUseCodes = (List<SpaceUseCode>) spaceUseCodeRepository.findAll();
		model.addAttribute("spaceUseCodes", spaceUseCodes);

		// Makes a list of content in SpaceCondition class
		List<SpaceCondition> spaceConditions = (List<SpaceCondition>) spaceConditionRepository.findAll();
		model.addAttribute("spaceConditions", spaceConditions);

		// Makes a list of content in Furniture class
		List<Furniture> furnitures = (List<Furniture>) furnitureRepository.findAll();
		model.addAttribute("furnitures", furnitures);

		// Makes a list of content in StructuralFeatures class
		List<StructuralFeatures> structuralFeatures = (List<StructuralFeatures>) structuralFeaturesRepository.findAll();
		model.addAttribute("structuralFeatures", structuralFeatures);

		// Makes a list of content in Zoom class
		List<Zoom> zoom = (List<Zoom>) zoomRepository.findAll();
		model.addAttribute("zoom", zoom);

		// Makes a list of content in PodiumStationType class
		List<PodiumStationType> podiumStationTypes = (List<PodiumStationType>) podiumStationTypeRepository.findAll();
		model.addAttribute("podiumStationTypes", podiumStationTypes);

		// Makes a list of content in ConsoleCompModel class
		List<ConsoleCompModel> consoleCompModels = (List<ConsoleCompModel>) consoleCompModelRepository.findAll();
		model.addAttribute("consoleCompModels", consoleCompModels);

		// Makes a list of content in ProjDisplayType class
		List<ProjDisplayType> projDisplayTypes = (List<ProjDisplayType>) projDisplayTypeRepository.findAll();
		model.addAttribute("projDisplayTypes", projDisplayTypes);

		// Makes a list of content in ProjMakeModelNumber class
		List<ProjMakeModelNumber> projMakeModelNumbers = (List<ProjMakeModelNumber>) projMakeModelNumberRepository
				.findAll();
		model.addAttribute("projMakeModelNumbers", projMakeModelNumbers);

		// Makes a list of content in CrestonModel class
		List<CrestonModel> crestonModels = (List<CrestonModel>) crestonModelRepository.findAll();
		model.addAttribute("crestonModels", crestonModels);
		model.addAttribute("building", building);

		// Makes a list of content in AudioDesc class
		List<AudioDesc> audioDescs = (List<AudioDesc>) audioDescRepository.findAll();
		model.addAttribute("audioDescs", audioDescs);

		// Makes a list of content in InterWhiteBoard class
		List<InterWhiteBoard> interWhiteBoards = (List<InterWhiteBoard>) interWhiteBoardRepository.findAll();
		model.addAttribute("interWhiteBoards", interWhiteBoards);

		// Makes a list of content in Buildings class
		List<Buildings> buildings = (List<Buildings>) buildingsRepository.findAll();
		model.addAttribute("buildings", buildings);
		
		
		return "list";
	}
    
    @PostMapping("/buildings/update/{id}")
	public String updateBuilding(@PathVariable("id") Integer id, @Validated Buildings building, BindingResult result, Model model,
			@RequestParam("buildingPics") MultipartFile buildingPics) {
		if (result.hasErrors()) {
			building.setId(id);
			return "redirect:/list";
		}

		try {
			// Load the existing room from the database
			Buildings existingBuilding = buildingsRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("Room data not found"));

			// Check if an image file is provided
			if (!buildingPics.isEmpty()) {
				// Get file extension
				String fileExtension = FilenameUtils.getExtension(buildingPics.getOriginalFilename());

				// Convert the image data to base64
				String base64Image = "data:image/" + fileExtension + ";base64,"
						+ Base64.getEncoder().encodeToString(buildingPics.getBytes());

				// Set the base64-encoded image data in the room entity
				building.setBuildingPics(base64Image);
			} else {
				// If no new image is provided, keep the existing image
				building.setBuildingPics(existingBuilding.getBuildingPics());
			}

			// Save the updated building entity
			buildingsRepository.save(building);

			return "redirect:/list";
		} catch (IOException e) {
			// Handle exceptions related to image storage
			model.addAttribute("error", "Error processing or storing the image.");
			return "redirect:/list";
		}
	}
	**/
}