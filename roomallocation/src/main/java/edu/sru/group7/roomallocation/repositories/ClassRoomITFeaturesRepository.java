package edu.sru.group7.roomallocation.repositories;

import org.springframework.data.repository.CrudRepository;
import edu.sru.group7.roomallocation.domain.ClassRoomITFeatures;
import edu.sru.group7.roomallocation.domain.Rooms;


public interface ClassRoomITFeaturesRepository extends CrudRepository <ClassRoomITFeatures, Integer>{
	
}
