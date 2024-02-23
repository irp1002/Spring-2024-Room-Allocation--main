package edu.sru.group7.roomallocation.domain;

import jakarta.persistence.*;

@Entity
public class Facilities {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
    @PrimaryKeyJoinColumn
    private Rooms room;
	
    @ManyToOne
    @JoinColumn(name = "space_condition_id")
	private SpaceCondition spaceCondition;
	
    @ManyToOne
    @JoinColumn(name = "space_use_code_id")
	private SpaceUseCode spaceUseCode;
	
	private Integer netSquareFootage;
	private Integer numberStations;
	private Integer numberADAStation;
	
	
	 @ManyToOne
	 @JoinColumn(name = "furniture_id") 
	 private Furniture furniture;
	 
	private Integer maxOccupantCap;
	private Integer fireCap;
	
	

	public SpaceCondition getSpaceCondition() {
		return spaceCondition;
	}
	
	public void setSpaceCondition(SpaceCondition spaceCondition) {
		this.spaceCondition = spaceCondition;
	}
	
	public SpaceUseCode getSpaceUseCode() {
		return spaceUseCode;
	}
	
	public void setSpaceUseCode(SpaceUseCode spaceUseCode) {
		this.spaceUseCode = spaceUseCode;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Rooms getRoom() {
		return room;
	}
	
	public void setRoom(Rooms room) {
		this.room = room;
	}



	public Integer getNetSquareFootage() {
		return netSquareFootage;
	}
	public void setNetSquareFootage(Integer netSquareFootage) {
		this.netSquareFootage = netSquareFootage;
	}
	public Integer getNumberStations() {
		return numberStations;
	}
	public void setNumberStations(Integer numberStations) {
		this.numberStations = numberStations;
	}
	public Integer getNumberADAStation() {
		return numberADAStation;
	}
	public void setNumberADAStation(Integer numberADAStation) {
		this.numberADAStation = numberADAStation;
	}

	public Furniture getFurniture() {
		return furniture;
	}

	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}

	public Integer getMaxOccupantCap() {
		return maxOccupantCap;
	}
	public void setMaxOccupantCap(Integer maxOccupantCap) {
		this.maxOccupantCap = maxOccupantCap;
	}
	public Integer getFireCap() {
		return fireCap;
	}
	public void setFireCap(Integer fireCap) {
		this.fireCap = fireCap;
	}
}
