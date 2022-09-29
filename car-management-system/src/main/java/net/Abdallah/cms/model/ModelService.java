package net.Abdallah.cms.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;
	
public List<CarModel> getAllModels(String brandId) {
		
//		List<CarModel> models = new ArrayList<>();
//		modelRepository.findByCarId(brandId)
//		.forEach(models :: add);
//		return models;
	
	return modelRepository.findByBrandId(brandId);
	}
}
