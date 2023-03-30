package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service



public class ProductoService {
	
	//Creo el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;
	
	//Cablear con el autowired
	 @Autowired
	 
	 //Uso ese objeto como parametro de mi constructor
	 public ProductoService (ProductoRepository productoRepository) {
		 this.productoRepository = productoRepository;
	 }
	
	//Declara la instancia de la Clase ProductoRepository

	// Create (Método para agregar un objeto del tipo Producto y guardarlo en la base de datos
	
	public void crearProducto() {
		
	}
	
	// Read (leer una lista de productos)
	public List<Producto> leerProducto() {
		return productoRepository.findAll();
		
	}
	
	//Read (leer un producto con un id especifico)
    public Producto getProducto(Long prodId) {
        return productoRepository.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto "
                        + "con el id " + prodId + " no existe.") );
    }//getProducto
	

   
//	// Update
//	
//	public void actualizarProducto() {
//		
//	}
//	
//	// Delete
//	public void borrarProducto() {
//		
//	}
}


