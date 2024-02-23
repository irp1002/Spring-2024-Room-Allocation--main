package edu.sru.group7.roomallocation.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import edu.sru.group7.roomallocation.domain.Facilities;
import edu.sru.group7.roomallocation.domain.Rooms;
import edu.sru.group7.roomallocation.domain.SpaceUseCode;


public interface FacilitiesRepository extends CrudRepository <Facilities, Integer>{
	
	List<Facilities> findBySpaceUseCode(SpaceUseCode spaceUseCode);
}
