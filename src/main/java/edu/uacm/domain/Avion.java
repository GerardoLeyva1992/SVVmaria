package edu.uacm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Table(name="avion")
@Entity
public class Avion {
	@Id
	@javax.persistence.TableGenerator(
		    name="EMP_GEN",
		    table="GENERATOR_TABLE",
		    pkColumnName = "key",
		    valueColumnName = "hi",
		    pkColumnValue="EMP",
		    		initialValue = 10,
		    	      allocationSize = 100
		    
		)
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.TABLE)	
	private Long idavion;
	@NotNull
	private String modeloavion;
	@NotNull
	private int capacidad;
	@NotNull
	private String lineaaerea;
	public Long getIdavion() {
		return idavion;
	}
	public void setIdavion(Long idavion) {
		this.idavion = idavion;
	}

	public String getModeloavion() {
		return modeloavion;
	}
	public void setModeloavion(String modeloavion) {
		this.modeloavion = modeloavion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getLineaaerea() {
		return lineaaerea;
	}
	public void setLineaaerea(String lineaaerea) {
		this.lineaaerea = lineaaerea;
	}
	
	


}
