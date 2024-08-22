package com.javaweb.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.javaweb.DTO.BuildingDTO;
import com.javaweb.service.BuildingService;


@RestController
public class BuildingAPI {
	
	@Autowired
	private BuildingService buildingService;
	@GetMapping(value = "/api/building")
	@ResponseBody
	public List<BuildingDTO> findBuilding(@RequestParam Map<String, Object> ob,
			@RequestParam(value="typeCode", required = false) List<String> typeCode) {
		List<BuildingDTO> result = buildingService.findAll(ob, typeCode);
		
		return result;
	}
	
	
	
	@PostMapping(value = "/api/building/post")
	public Object createBuilding(@RequestBody BuildingDTO buildingDTO) {
		validateData(buildingDTO);
		System.out.println("Post Successfully");
		return buildingDTO;
	}
	
	private void validateData(BuildingDTO buildingDTO) {
		// TODO Auto-generated method stub
		
	}

	@DeleteMapping(value = "/api/building/delete/{ids}")
	public void deleteBuilding(@PathVariable Long[] ids) {
		System.out.println("Delete Successfully\n");
	}
	
	@RequestMapping(value = "/api/building/head/{id}", method = RequestMethod.HEAD)
	public void checkBuildingExists(@PathVariable("id") Long id) {
	    boolean exists = buildingService.existsById(id);

	    if (!exists) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Building not found");
	    }
	}

}