package com.iit.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MedicationDto {

	private long medicationId;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String name;
    @NotNull
    private float dosage;
    @NotNull
    private float prix;
    @NotNull
    private long categoryId;
    @NotNull
    @Size(min = 3)
    private String categoryName;

	public long getId() {
		return medicationId;
	}
	public void setId(long id) {
		this.medicationId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	public float getPrice() {
		return prix;
	}
	public void setPrice(float price) {
		this.prix = price;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "MedicationDto [id=" + medicationId + ", name=" + name + ", dosage=" + dosage + ", price=" + prix
				+ ", categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	public MedicationDto(@NotNull @NotEmpty @Size(min = 3) String name, @NotNull float dosage, @NotNull float price,
			@NotNull long categoryId, @NotNull @Size(min = 3) String categoryName) {
		super();
		this.name = name;
		this.dosage = dosage;
		this.prix = price;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public MedicationDto() {
		super();
	}
	
	

    
}
