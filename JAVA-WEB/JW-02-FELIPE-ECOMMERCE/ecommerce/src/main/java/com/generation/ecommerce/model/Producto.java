package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //indico que mi clase Producto se convierte en una entidad JPA (persistencia de datos)

@Table(name = "Producto") // especificar de forma correcta el nombre de la tabla



public class Producto {
	
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	private Long id;
	private String nombre;
	private String desceiption;
	private String URL_Imagen;
	private double precio;
	
	//Constructor vacio para el Jacson (serializador y deserealizar un objeto JAVA a JASON)
	public Producto () {
		
	}
	
	//Constructor con todos los campos

	public Producto(Long id, String nombre, String desceiption, String uRL_Imagen, double precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.desceiption = desceiption;
		this.URL_Imagen = uRL_Imagen;
		this.precio = precio;
	}
	
	//Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesceiption() {
		return desceiption;
	}

	public void setDesceiption(String desceiption) {
		this.desceiption = desceiption;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//toString (sobreescritura de metodos)
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", desceiption=" + desceiption + ", URL_Imagen="
				+ URL_Imagen + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	

}
