package org.sig.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Laureat implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String name;
	private String prenom;
	private String genre;
	private String telephone;
	private String email;
	private String promotion;
	private String filiere;
	private String organisme;
	private double Lat;
	private double Lon;
	private long photo;
	private String secteur;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String description;
	private String province;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getOrganisme() {
		return organisme;
	}
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	public double getLat() {
		return Lat;
	}
	public void setLat(double lat) {
		Lat = lat;
	}
	public double getLon() {
		return Lon;
	}
	public void setLon(double lon) {
		Lon = lon;
	}
	public long getPhoto() {
		return photo;
	}
	public void setPhoto(long photo) {
		this.photo = photo;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Laureat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laureat(String name, String prenom, String genre, String telephone, String email, String promotion,
			String filiere, String organisme, double lat, double lon, long photo, String secteur, Date dateInscription,
			String description, String province) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.genre = genre;
		this.telephone = telephone;
		this.email = email;
		this.promotion = promotion;
		this.filiere = filiere;
		this.organisme = organisme;
		Lat = lat;
		Lon = lon;
		this.photo = photo;
		this.secteur = secteur;
		this.dateInscription = dateInscription;
		this.description = description;
		this.province = province;
	}
	
	
}
