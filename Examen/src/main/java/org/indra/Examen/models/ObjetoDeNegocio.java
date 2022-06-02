package org.indra.Examen.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ObjetoDeNegocio {
	
	@Id
	@GeneratedValue
	private int id;

}
