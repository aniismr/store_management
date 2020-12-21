package com.iit.service;

import java.util.Collection;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iit.dto.MedicationDto;
import com.iit.entity.Medication;
import com.iit.factory.MedicationFactory;
import com.iit.repository.MedicationRepository;
@Transactional
@Service
public class MedicationService {
	 	
		private final MedicationRepository medicationRepository;

	    public MedicationService(MedicationRepository medicationRepository) {
			this.medicationRepository = medicationRepository;
		}
	    
	    
		public MedicationDto save(MedicationDto medicationDto) {
			medicationRepository.saveAndFlush (MedicationFactory.medicamentDtoToMedicament (medicationDto));
	        return medicationDto;
	    }
	    public void deleteById(Long id){
	        this.medicationRepository.deleteById (id);
	    }
	    @Transactional(readOnly=true)
	    public MedicationDto findOne(Long id){
	        Optional<Medication> medicament=medicationRepository.findById (id);
	      
	        return MedicationFactory.medicationToMedicationDto (medicament.get ());
	    }
	    @Transactional(readOnly=true)
	    public Collection<MedicationDto> findAll(){
	        return MedicationFactory.medicamentsToMedicamentDtos (medicationRepository.findAll ());
	    }
}
