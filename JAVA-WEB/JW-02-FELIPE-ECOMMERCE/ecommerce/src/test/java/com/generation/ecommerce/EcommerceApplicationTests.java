package com.generation.ecommerce;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	//pruebaGET
	@Test
	
	//pruebaGET
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/miOtzo/productos/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("papasSabritas.jpg")
				));
	}//finget
	
	@Test
	@Disabled("Dehabilitado porque ya fue probado") 
	//prueba DELETE
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/miOtzo/productos/1"))
		.andDo(print())
		.andExpect(status().isOk());
	} //fin delete
	
	//pueba post
	@Test
	
	Producto p = new Producto();
	p.setNombre("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
	p.setDescripcion("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
	p.setlmagen("producto_7.jpg");
	p.setPrecio(74.22);
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString

}
