package net.Abdallah.cms.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<CarModel, String>{

	@Query(value = "SELECT distinct model_id, brand_id, model FROM model JOIN brand ON model.brand_id = brand.id", nativeQuery = true)
	public List<CarModel> findByBrandId(String brandId);

}
