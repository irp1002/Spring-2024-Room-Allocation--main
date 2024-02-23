package edu.sru.group7.roomallocation.repositories;


import org.springframework.data.repository.CrudRepository;
import edu.sru.group7.roomallocation.domain.Buildings;
import edu.sru.group7.roomallocation.domain.Rooms;


public interface BuildingsRepository extends CrudRepository <Buildings, Integer>{

}
