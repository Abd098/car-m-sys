package net.Abdallah.cms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import net.Abdallah.cms.brand.Car;

@Entity
@Table(name = "model")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String model_id;
	
	@Transient
	private String brand_id;
	
	@Column(name = "Model", unique = true, nullable = false)
	private String model;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "brandId", referencedColumnName = "id", insertable = false, updatable = false)
	private Car car;
	
	public CarModel() {
		
		super();
	}

	public CarModel(String model_id, String brand_id, String model, Car car) {
		super();
		this.model_id = model_id;
		this.brand_id = brand_id;
		this.model = model;
		this.car = car;
	}

	public String getModelId() {
		return model_id;
	}

	public void setModelId(String model_id) {
		this.model_id = model_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getBrandId() {
		return brand_id;
	}

	public void setBrandId(String brand_id) {
		this.brand_id = brand_id;
	}
	
}
