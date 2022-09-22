package app.models;

import java.io.Serializable;

public class Product implements Serializable{
	private Integer id;
	private String product;
	private Double price;
	
	public Product() {}
	
	public Product(Integer id, String product, Double price) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + ", price=" + price + "]";
	}
	
	
	
}
