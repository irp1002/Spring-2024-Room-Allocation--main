package edu.sru.group7.roomallocation.domain;



import org.springframework.data.relational.core.mapping.Embedded.Nullable;

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
public class ClassRoomITFeatures {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
    @PrimaryKeyJoinColumn
    private Rooms room;
	
	@ManyToOne
	@JoinColumn(name="zoom_id")
    private Zoom zoom;

	@ManyToOne
	@JoinColumn(name="podium_station_id")
    private PodiumStationType podiumStationType;

	@ManyToOne
	@JoinColumn(name="console_comp_model_id")
    private ConsoleCompModel consoleCompModel;
	
	
    private String consoleCompSpecs;
    private String consoleCompWarranty;
    
 
    private String consoleCompInstall; 
    
    private Integer numberProj;
    
	@ManyToOne
	@JoinColumn(name="project_display_type_id")
    private ProjDisplayType projDisplayType;
    
    
	@ManyToOne
	@JoinColumn(name="creston_model_id")
    private CrestonModel crestonModel;
    private String crestonSerialNumber;
    private String crestonIPAddress;
    
	@ManyToOne
	@JoinColumn(name="audio_desc_id")
    private AudioDesc audioDesc;
    
    private String voiceLift;
    
    private Boolean docCam;

	@ManyToOne
	@JoinColumn(name="white_board_id")
    private InterWhiteBoard interWhiteBoard;
    
    private String iwbInstall; 
    
    
    @Lob
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
	
	public String getConsoleCompSpecs() {
		return consoleCompSpecs;
	}
	
	public void setConsoleCompSpecs(String consoleCompSpecs) {
		this.consoleCompSpecs = consoleCompSpecs;
	}
	
	public String getConsoleCompWarranty() {
		return consoleCompWarranty;
	}
	
	public void setConsoleCompWarranty(String consoleCompWarranty) {
		this.consoleCompWarranty = consoleCompWarranty;
	}
	
	public String getConsoleCompInstall() {
		return consoleCompInstall;
	}
	
	public void setConsoleCompInstall(String consoleCompInstall) {
		this.consoleCompInstall = consoleCompInstall;
	}
	
	public Integer getNumberProj() {
		return numberProj;
	}
	
	public void setNumberProj(Integer numberProj) {
		this.numberProj = numberProj;
	}
	
	public String getCrestonSerialNumber() {
		return crestonSerialNumber;
	}
	
	public void setCrestonSerialNumber(String crestonSerialNumber) {
		this.crestonSerialNumber = crestonSerialNumber;
	}
	
	public String getCrestonIPAddress() {
		return crestonIPAddress;
	}
	
	public void setCrestonIPAddress(String crestonIPAddress) {
		this.crestonIPAddress = crestonIPAddress;
	}
	
	public AudioDesc getAudioDesc() {
		return audioDesc;
	}
	
	public void setAudioDesc(AudioDesc audioDesc) {
		this.audioDesc = audioDesc;
	}
	
	public String getVoiceLift() {
		return voiceLift;
	}
	
	public void setVoiceLift(String voiceLift) {
		this.voiceLift = voiceLift;
	}
	
	public Boolean getDocCam() {
		return docCam;
	}
	
	public void setDocCam(Boolean docCam) {
		this.docCam = docCam;
	}
	
	public InterWhiteBoard getInterWhiteBoard() {
		return interWhiteBoard;
	}
	
	public void setInterWhiteBoards(InterWhiteBoard interWhiteBoard) {
		this.interWhiteBoard = interWhiteBoard;
	}
	
	public String getIwbInstall() {
		return iwbInstall;
	}
	
	public void setIwbInstall(String iwbInstall) {
		this.iwbInstall = iwbInstall;
	}
	
	public String getUniqueFeatures() {
		return uniqueFeatures;
	}
	
	public void setUniqueFeatures(String uniqueFeatures) {
		this.uniqueFeatures = uniqueFeatures;
	}
	
	public PodiumStationType getPodiumStationType() {
		return podiumStationType;
	}
	
	public void setPodiumStationType(PodiumStationType podiumStationType) {
		this.podiumStationType = podiumStationType;
	}
	
	public ConsoleCompModel getConsoleCompModel() {
		return consoleCompModel;
	}
	
	public void setConsoleCompModel(ConsoleCompModel consoleCompModel) {
		this.consoleCompModel = consoleCompModel;
	}
	
	public ProjDisplayType getProjDisplayType() {
		return projDisplayType;
	}
	
	public void setProjDisplayType(ProjDisplayType projDisplayType) {
		this.projDisplayType = projDisplayType;
	}
	
	public CrestonModel getCrestonModel() {
		return crestonModel;
	}
	
	public void setCrestonModel(CrestonModel crestonModel) {
		this.crestonModel = crestonModel;
	}
	
	public Zoom getZoom() {
		return zoom;
	}
	
	public void setZoom(Zoom zoom) {
		this.zoom = zoom;
	}

}

