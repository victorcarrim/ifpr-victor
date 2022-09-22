package app.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import app.models.Product;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/products")
public class ProductResource {
	
	List<Product> products = new ArrayList<>();
	
	
	
	public ProductResource() {
		Product p1 = new Product(1 , "Notebook Acer", 2000.00);
		Product p2 = new Product(2 , "Mouse Logitech", 120.00);
		Product p3 = new Product(3 , "Monitor Samsung", 890.00);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll(@QueryParam("sort") String sort) {
		Collections.sort(products, Comparator.comparing(Product::getPrice));
		
		if(sort != null && sort.equals("desc")) {
			Collections.reverse(products);
		}
		
		return Response.status(Status.OK).entity(products).build();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") Integer id) {
	
		Product p = null;
		
		if(id == 1) {
			p = products.get(0);
		} else if (id == 2) {
			p = products.get(1);
		} else if (id == 3) {
			p = products.get(2);
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.status(Status.OK).entity(p).build();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createProduct(Product product) throws URISyntaxException {
		
		product.setId(4);
		
		products.add(product);
		
		return Response.created(new URI("products/" + product.getId())).entity(product).build();
	}
	
}
