package com.jordansilva.jscatalog.resources;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.web.servlet.MockMvc;

import com.jordansilva.jscatalog.dto.ProductDTO;
import com.jordansilva.jscatalog.services.ProductService;
import com.jordansilva.jscatalog.tests.Factory;

@WebMvcTest(ProductResource.class)
public class ProductResourceTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductService service;
	
	private ProductDTO productDTO;
	private PageImpl<ProductDTO> page;
	
	@BeforeEach
	void setUp() throws Exception {
		productDTO = Factory.createProductDTO();
		page = new PageImpl<>(List.of(productDTO));
		when(service.findAllPaged(any())).thenReturn(page);
	}
	
	@Test
	public void findAllShouldReturnPage() throws Exception{
		mockMvc.perform(get("/products")).andExpect(status().isOk());
	}
}
