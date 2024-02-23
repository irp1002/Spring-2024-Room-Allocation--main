package edu.sru.group7.roomallocation.repositories;

import org.springframework.data.repository.CrudRepository;
import edu.sru.group7.roomallocation.domain.Rooms;

//Sam's Code
/**import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;**/


public interface RoomsRepository extends CrudRepository <Rooms, Integer>{
	
	/**public interface RoomsRepository extends CrudRepository <Rooms, Integer>{
	
	List<Rooms> findAllByBuildingId(Integer buildingId);

	 @Query("SELECT r FROM Rooms r JOIN FETCH r.facilities f JOIN FETCH r.structuralArchitecturalFeatures s WHERE r.id = :roomId")
	 Rooms findRoomWithFacilitiesAndStructuralFeatures(@Param("roomId") Integer roomId); **/

}
