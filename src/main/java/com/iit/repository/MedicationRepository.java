package com.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iit.entity.Medication;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Long>{

}
