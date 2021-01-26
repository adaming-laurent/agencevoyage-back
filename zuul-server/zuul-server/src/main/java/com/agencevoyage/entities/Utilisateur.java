package com.agencevoyage.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUser;
	private String nomUser;
	private String prenomUser;
	@Column(unique = true)
	private String username;
	private String password;
	private boolean enable = true;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", joinColumns = {
			@JoinColumn(referencedColumnName = "idUser", name = "idUser") }, inverseJoinColumns = @JoinColumn(referencedColumnName = "idRole", name = "idRole", table = "role"))
	private Set<Role> roles = new HashSet<Role>();

	public Utilisateur() {
	}

	public Utilisateur(long idUser, String nomUser, String prenomUser, String username, String password, boolean enable,
			Set<Role> roles) {
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.username = username;
		this.password = password;
		this.enable = enable;
		this.roles = roles;
	}

	public Utilisateur(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", username="
				+ username + ", password=" + password + ", enable=" + enable + ", roles=" + roles + "]";
	}

}
