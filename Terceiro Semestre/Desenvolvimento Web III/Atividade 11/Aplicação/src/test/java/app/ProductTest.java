package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.models.Product;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

public class ProductTest {
	
	private Client client;
	private WebTarget target;
	
	@Before
	public void setup() {
		client = ClientBuilder.newClient();
		
		target =  client.target("http://localhost:8080/RestAPI/rest/"); //url base
	}

	@Test
	public void testeSeOServidorEstaOnline() {
		
		
		String payload =  target.path("products").request().get(String.class);
		
		Assert.assertTrue(payload.contains("Notebook"));
		
		
	}
	
	@Test
	public void testaSeOMetodoGetByIdFunciona() throws JsonMappingException, JsonProcessingException {
		String payload =  target.path("products/2").request().get(String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Product product = objectMapper.readValue(payload, Product.class);
		
		Assert.assertEquals("Mouse", product.getProduct());
	}
	
}

