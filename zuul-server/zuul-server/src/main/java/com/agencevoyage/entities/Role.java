package com.agencevoyage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idRole;
	private String libelle;

	public Role() {
		super();
	}

	public Role(long idRole, String libelle) {
		super();
		this.idRole = idRole;
		this.libelle = libelle;
	}

	public long getId() {
		return idRole;
	}

	public void setId(long id) {
		this.idRole = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", libelle=" + libelle + "]";
	}

}
