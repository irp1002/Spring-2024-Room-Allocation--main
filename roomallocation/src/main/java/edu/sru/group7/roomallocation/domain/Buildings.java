package edu.sru.group7.roomallocation.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "building")
public class Buildings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String buildingName;
	private String yearBuilt;
	private String lastReno;
	private Integer grossSqFootage;
	
	@Lob
	private String buildingPics;
	
	@Lob
	private String floorPlan;
	
	@OneToMany(mappedBy="buildings")
	private Set<Rooms> room;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getLastReno() {
		return lastReno;
	}

	public void setLastReno(String lastReno) {
		this.lastReno = lastReno;
	}

	public Integer getGrossSqFootage() {
		return grossSqFootage;
	}

	public void setGrossSqFootage(Integer grossSqFootage) {
		this.grossSqFootage = grossSqFootage;
	}

	public String getBuildingPics() {
		return buildingPics;
	}

	public void setBuildingPics(String buildingPics) {
		this.buildingPics = buildingPics;
	}

	public String getFloorPlan() {
		return floorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}

	

	

}
