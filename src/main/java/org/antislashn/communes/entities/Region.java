package org.antislashn.communes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	@Id
	private String code;
	@Column(name="name")
	private String nom;

	public String getNom() {
		return nom;
	}

	public String getCode() {
		return code;
	}

}
