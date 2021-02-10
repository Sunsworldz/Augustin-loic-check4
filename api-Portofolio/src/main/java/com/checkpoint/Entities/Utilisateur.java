package com.checkpoint.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long utilisateur;

    private String username;
    private String password;
    
    public Utilisateur() {
    	
    }
    
    public Utilisateur( String username, String password) {
    	this.username = username;
    	this.password = password;
    	}

	public Long getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Long utilisateur) {
		this.utilisateur = utilisateur;
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
}
