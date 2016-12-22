package edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Table(name="aeropuerto")
@Entity
public class Aeropuerto {
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
	private Long idaeropuerto;
	@NotNull
	private String nombreaeropuerto;
	@NotNull
	private String ciudad="Algo";
	@NotNull
	private String pais="Algo2";
	

	
	public Long getIdaeropuerto() {
		return idaeropuerto;
	}
	public void setIdaeropuerto(Long idaeropuerto) {
		this.idaeropuerto = idaeropuerto;
	}
	public String getNombreaeropuerto() {
		return nombreaeropuerto;
	}
	public void setNombreaeropuerto(String nombreaeropuerto) {
		this.nombreaeropuerto = nombreaeropuerto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	


}
