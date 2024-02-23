package edu.sru.group7.roomallocation.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.sru.group7.roomallocation.domain.Rooms;
import edu.sru.group7.roomallocation.domain.StructuralArchitecturalFeatures;


public interface StructuralArchitecturalFeaturesRepository extends CrudRepository <StructuralArchitecturalFeatures, Integer>{
	
}