package edu.sru.group7.roomallocation.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Projector {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
    @PrimaryKeyJoinColumn
    private Rooms room;
	
	
	@ManyToOne
	@JoinColumn(name="proj1_make_model_id")
    private ProjMakeModelNumber proj1MakeModelNumber;
	
	private String proj1IPAddress;
	private String proj1SerialNumber;
	private String proj1Hours;
    private String proj1Install;
	
	
	
	@ManyToOne
	@JoinColumn(name="proj2_make_model_id")
    private ProjMakeModelNumber proj2MakeModelNumber;
	
	private String proj2IPAddress;
	private String proj2SerialNumber;
	private String proj2Hours;
    private String proj2Install;
	
	
	
	@ManyToOne
	@JoinColumn(name="proj3_make_model_id")
    private ProjMakeModelNumber proj3MakeModelNumber;
	
	private String proj3IPAddress;
	private String proj3SerialNumber;
	private String proj3Hours;
    private String proj3Install;
	
	
	
	@ManyToOne
	@JoinColumn(name="proj4_make_model_id")
    private ProjMakeModelNumber proj4MakeModelNumber;
	
	private String proj4IPAddress;
	private String proj4SerialNumber;
	private String proj4Hours;
    private String proj4Install;
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
	public ProjMakeModelNumber getProj1MakeModelNumber() {
		return proj1MakeModelNumber;
	}
	public void setProj1MakeModelNumber(ProjMakeModelNumber proj1MakeModelNumber) {
		this.proj1MakeModelNumber = proj1MakeModelNumber;
	}
	public String getProj1IPAddress() {
		return proj1IPAddress;
	}
	public void setProj1IPAddress(String proj1ipAddress) {
		proj1IPAddress = proj1ipAddress;
	}
	public String getProj1SerialNumber() {
		return proj1SerialNumber;
	}
	public void setProj1SerialNumber(String proj1SerialNumber) {
		this.proj1SerialNumber = proj1SerialNumber;
	}
	public String getProj1Hours() {
		return proj1Hours;
	}
	public void setProj1Hours(String proj1Hours) {
		this.proj1Hours = proj1Hours;
	}
	public String getProj1Install() {
		return proj1Install;
	}
	public void setProj1Install(String proj1Install) {
		this.proj1Install = proj1Install;
	}
	public ProjMakeModelNumber getProj2MakeModelNumber() {
		return proj2MakeModelNumber;
	}
	public void setProj2MakeModelNumber(ProjMakeModelNumber proj2MakeModelNumber) {
		this.proj2MakeModelNumber = proj2MakeModelNumber;
	}
	public String getProj2IPAddress() {
		return proj2IPAddress;
	}
	public void setProj2IPAddress(String proj2ipAddress) {
		proj2IPAddress = proj2ipAddress;
	}
	public String getProj2SerialNumber() {
		return proj2SerialNumber;
	}
	public void setProj2SerialNumber(String proj2SerialNumber) {
		this.proj2SerialNumber = proj2SerialNumber;
	}
	public String getProj2Hours() {
		return proj2Hours;
	}
	public void setProj2Hours(String proj2Hours) {
		this.proj2Hours = proj2Hours;
	}
	public String getProj2Install() {
		return proj2Install;
	}
	public void setProj2Install(String proj2Install) {
		this.proj2Install = proj2Install;
	}
	public ProjMakeModelNumber getProj3MakeModelNumber() {
		return proj3MakeModelNumber;
	}
	public void setProj3MakeModelNumber(ProjMakeModelNumber proj3MakeModelNumber) {
		this.proj3MakeModelNumber = proj3MakeModelNumber;
	}
	public String getProj3IPAddress() {
		return proj3IPAddress;
	}
	public void setProj3IPAddress(String proj3ipAddress) {
		proj3IPAddress = proj3ipAddress;
	}
	public String getProj3SerialNumber() {
		return proj3SerialNumber;
	}
	public void setProj3SerialNumber(String proj3SerialNumber) {
		this.proj3SerialNumber = proj3SerialNumber;
	}
	public String getProj3Hours() {
		return proj3Hours;
	}
	public void setProj3Hours(String proj3Hours) {
		this.proj3Hours = proj3Hours;
	}
	public String getProj3Install() {
		return proj3Install;
	}
	public void setProj3Install(String proj3Install) {
		this.proj3Install = proj3Install;
	}
	public ProjMakeModelNumber getProj4MakeModelNumber() {
		return proj4MakeModelNumber;
	}
	public void setProj4MakeModelNumber(ProjMakeModelNumber proj4MakeModelNumber) {
		this.proj4MakeModelNumber = proj4MakeModelNumber;
	}
	public String getProj4IPAddress() {
		return proj4IPAddress;
	}
	public void setProj4IPAddress(String proj4ipAddress) {
		proj4IPAddress = proj4ipAddress;
	}
	public String getProj4SerialNumber() {
		return proj4SerialNumber;
	}
	public void setProj4SerialNumber(String proj4SerialNumber) {
		this.proj4SerialNumber = proj4SerialNumber;
	}
	public String getProj4Hours() {
		return proj4Hours;
	}
	public void setProj4Hours(String proj4Hours) {
		this.proj4Hours = proj4Hours;
	}
	public String getProj4Install() {
		return proj4Install;
	}
	public void setProj4Install(String proj4Install) {
		this.proj4Install = proj4Install;
	}
}
