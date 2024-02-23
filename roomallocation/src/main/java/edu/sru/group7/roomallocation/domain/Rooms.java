package edu.sru.group7.roomallocation.domain;

import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Rooms {
	
	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NonNull
	private Integer roomNumber;
	private String spaceName;
	
	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
	private Facilities facilities;
	
	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
	private ComputerLabIT computerLabIT;
	
	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
	private ClassRoomITFeatures classRoomITFeatures;
	
	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
	private StructuralArchitecturalFeatures structuralArchitecturalFeatures;
	
	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
	private Projector projector;
	
	
	@ManyToOne
	@JoinColumn(name="bulding_id") 
	private Buildings buildings;
	 
	
	@Lob
	@Column(columnDefinition = "MEDIUMTEXT")
	private String image;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getSpaceName() {
		return spaceName;
	}
	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Facilities getFacilities() {
		return facilities;
	}
	public void setFacilities(Facilities facilities) {
		this.facilities = facilities;
	}
	public ComputerLabIT getComputerLabIT() {
		return computerLabIT;
	}
	public void setComputerLabIT(ComputerLabIT computerLabIT) {
		this.computerLabIT = computerLabIT;
	}
	public ClassRoomITFeatures getClassRoomITFeatures() {
		return classRoomITFeatures;
	}
	public void setClassRoomITFeatures(ClassRoomITFeatures classRoomITFeatures) {
		this.classRoomITFeatures = classRoomITFeatures;
	}
	public StructuralArchitecturalFeatures getStructuralArchitecturalFeatures() {
		return structuralArchitecturalFeatures;
	}
	public void setStructuralArchitecturalFeatures(StructuralArchitecturalFeatures structuralArchitecturalFeatures) {
		this.structuralArchitecturalFeatures = structuralArchitecturalFeatures;
	}
	public Projector getProjector() {
		return projector;
	}
	public void setProjector(Projector projector) {
		this.projector = projector;
	}
	public Buildings getBuildings() {
		return buildings;
	}
	public void setBuildings(Buildings buildings) {
		this.buildings = buildings;
	}
}
