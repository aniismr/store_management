package com.iit.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iit.dto.MedicationDto;
import com.iit.service.MedicationService;

@CrossOrigin("*")
@RequestMapping(value ="/medications")
@RestController()
public class MedicationController {

	 private final MedicationService medicationService;
	 
	 public MedicationController(MedicationService medicationService) {
	        this.medicationService = medicationService;
	    }

	    @GetMapping("/{id}")
	    public MedicationDto findOne(@PathVariable("id") long id) {
	        return medicationService.findOne (id);
	    }

	    @GetMapping()
	    public Collection<MedicationDto> findAll() {
	        return medicationService.findAll ();
	    }

	    @PostMapping
	    public MedicationDto add(@Valid @RequestBody MedicationDto medicationDto) {
	        return medicationService.save (medicationDto);
	    }

	    @PutMapping("/{id}")
	    public MedicationDto update(@Valid @RequestBody MedicationDto medicationDto) {
	        return medicationService.save (medicationDto);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable("id") long id) {
	    	medicationService.deleteById(id);
	    }
}
