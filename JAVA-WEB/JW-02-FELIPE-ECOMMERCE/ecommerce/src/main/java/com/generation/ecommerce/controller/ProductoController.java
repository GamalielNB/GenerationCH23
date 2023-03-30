package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@RestController //con esta notacion indico que es un controller para soportar metodos http


//mapear la ruta de donde se ejecutan los metodos HTTP
@RequestMapping(path = "/miOtzo/productos/") //indica la ruta o URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP 


public class ProductoController {
	
	//*******Inyeccion de dependencia
	
	//Declara la Instancia de la clase "ProductoService" que se ultiza para acceder a los metodos definidios ahí. Se declara como final porque su valor no sera cambiado despues de incializar, para que esta instancia no cambie durante la ejecucion del programa
	
	private final ProductoService productoServicio;
	
	@Autowired //Se usa para indicar a Spring que inyecta automaticamente una instancia del productoService en la clase ProductoController. Así nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase
	
	//*******Segunda parte de inyeccion de dependencia
	
	//Constructor con ese objeto como parametro
	
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}
	

	
	//HTTP GET para todos los productos
	@GetMapping
	
	public List<Producto> getProductos() {
		return productoServicio.leerProducto();
	}
	
	
	
//	//HTTP POST
//	 @PostMapping
//	public postProducto() {
//		return productoServicio.crearProducto();
//	}
//	//HTTP PUT 
//	public putProduct() {
//		return productoServicio.actualizarProducto();
//	}
//	//HTTP DELETE
//	@DeleteMapping
//	public deleteProducto() {
//		return productoServicio.actualizarProducto();
//	}
}


