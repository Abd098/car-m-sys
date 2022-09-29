package net.Abdallah.cms.brand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
    public List<Car> getAllCarBrands() {
		
			List<Car> brands = new ArrayList<>();
			brandRepository.findAll()
			.forEach(brands::add);
			return brands;
	}	

}
