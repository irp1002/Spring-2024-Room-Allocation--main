package edu.sru.group7.roomallocation.domain;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class StructuralArchitecturalFeatures {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
    @PrimaryKeyJoinColumn
    private Rooms room;

    @ManyToOne
    @JoinColumn(name = "structural_features_id")
    private StructuralFeatures structuralFeatures;
	
    @Lob
    private String specialCharacters;
    private Boolean communication;
    private Boolean electricalServ;
    private Boolean gasServ;
    private Boolean spPlumbingServ;
    private Boolean tempConServ;
    private Boolean ventilatingServ;
    private Boolean waterServ;
    @Lob
    private String notes;

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
	
	public StructuralFeatures getStructuralFeatures() {
		return structuralFeatures;
	}
	
	public void setStructuralFeatures(StructuralFeatures structuralFeatures) {
		this.structuralFeatures = structuralFeatures;
	}
	
	public String getSpecialCharacters() {
		return specialCharacters;
	}
	
	public void setSpecialCharacters(String specialCharacters) {
		this.specialCharacters = specialCharacters;
	}
	
	public Boolean getCommunication() {
		return communication;
	}
	
	public void setCommunication(Boolean communication) {
		this.communication = communication;
	}
	
	public Boolean getElectricalServ() {
		return electricalServ;
	}
	
	public void setElectricalServ(Boolean electricalServ) {
		this.electricalServ = electricalServ;
	}
	
	public Boolean getGasServ() {
		return gasServ;
	}
	
	public void setGasServ(Boolean gasServ) {
		this.gasServ = gasServ;
	}
	
	public Boolean getSpPlumbingServ() {
		return spPlumbingServ;
	}
	
	public void setSpPlumbingServ(Boolean spPlumbingServ) {
		this.spPlumbingServ = spPlumbingServ;
	}
	
	public Boolean getTempConServ() {
		return tempConServ;
	}
	
	public void setTempConServ(Boolean tempConServ) {
		this.tempConServ = tempConServ;
	}
	
	public Boolean getVentilatingServ() {
		return ventilatingServ;
	}
	
	public void setVentilatingServ(Boolean ventilatingServ) {
		this.ventilatingServ = ventilatingServ;
	}
	
	public Boolean getWaterServ() {
		return waterServ;
	}
	
	public void setWaterServ(Boolean waterServ) {
		this.waterServ = waterServ;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
