package edu.sru.group7.roomallocation.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class ComputerLabIT {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
    @PrimaryKeyJoinColumn
    private Rooms room;
	
	private Integer numberDesktopComp;
	private String desktopCompOS;
	private String desktopCompApp;
	private String desktopCompInstall;
	private String computerDesksDesc;
	private String wireAccPt;
	private String dataCabling;
	private String floorBoxes;
	private String uniqueFeatures;

	
	

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
	
	public Integer getNumberDesktopComp() {
		return numberDesktopComp;
	}
	public void setNumberDesktopComp(Integer numberDesktopComp) {
		this.numberDesktopComp = numberDesktopComp;
	}
	public String getDesktopCompOS() {
		return desktopCompOS;
	}
	public void setDesktopCompOS(String desktopCompOS) {
		this.desktopCompOS = desktopCompOS;
	}
	public String getDesktopCompApp() {
		return desktopCompApp;
	}
	public void setDesktopCompApp(String desktopCompApp) {
		this.desktopCompApp = desktopCompApp;
	}
	public String getDesktopCompInstall() {
		return desktopCompInstall;
	}
	public void setDesktopCompInstall(String desktopCompInstall) {
		this.desktopCompInstall = desktopCompInstall;
	}
	public String getComputerDesksDesc() {
		return computerDesksDesc;
	}
	public void setComputerDesksDesc(String computerDesksDesc) {
		this.computerDesksDesc = computerDesksDesc;
	}
	public String getWireAccPt() {
		return wireAccPt;
	}
	public void setWireAccPt(String wireAccPt) {
		this.wireAccPt = wireAccPt;
	}
	public String getDataCabling() {
		return dataCabling;
	}
	public void setDataCabling(String dataCabling) {
		this.dataCabling = dataCabling;
	}
	public String getFloorBoxes() {
		return floorBoxes;
	}
	public void setFloorBoxes(String floorBoxes) {
		this.floorBoxes = floorBoxes;
	}
	public String getUniqueFeatures() {
		return uniqueFeatures;
	}
	public void setUniqueFeatures(String uniqueFeatures) {
		this.uniqueFeatures = uniqueFeatures;
	}
	
}
