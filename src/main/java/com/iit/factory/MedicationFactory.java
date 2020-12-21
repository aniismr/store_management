package com.iit.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.iit.dto.CategoryDto;
import com.iit.dto.MedicationDto;
import com.iit.entity.Medication;

public class MedicationFactory {

	public static MedicationDto medicationToMedicationDto(Medication medication)
    {
		MedicationDto medicationDto = new MedicationDto ();
		medicationDto.setId(medication.getMedicationId());
		medicationDto.setDosage (medication.getDosage ());
		medicationDto.setCategoryName (medication.getCategory().getName ());
		medicationDto.setCategoryId (medication.getCategory ().getId ());
		medicationDto.setPrice(medication.getPrix());
		medicationDto.setName (medication.getName ());
        return medicationDto;
    }

    public static Medication medicamentDtoToMedicament(MedicationDto medicationDto)
    {
    	Medication medication = new Medication ();
    	medication.setMedicationId (medicationDto.getId ());
    	medication.setDosage (medicationDto.getDosage ());
        //TODO:Verify if Category Exists or no
        CategoryDto categoryDto=new CategoryDto (medicationDto.getCategoryName ());
        medication.setCategory (CategoryFactory.categoryDtoToCategory (categoryDto));
        
        medication.setPrix (medicationDto.getPrice());
        medication.setName (medicationDto.getName ());
        return medication;
    }

    public static Collection<MedicationDto> medicamentsToMedicamentDtos(Collection<Medication> medications)
    {
        List<MedicationDto> medicationDtoList = new ArrayList<> ();
        medications.forEach(medication -> {
        	medicationDtoList.add (medicationToMedicationDto (medication));
        });
        return medicationDtoList;
    }
}
