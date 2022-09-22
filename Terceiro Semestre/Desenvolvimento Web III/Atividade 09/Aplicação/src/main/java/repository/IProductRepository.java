package repository;

import java.util.List;

import models.Product;

public interface IProductRepository {
	public Integer insert(Product product);
	
	public Integer update(Product product);
	
	public Integer deleteById(Product product);
	
	public List<Product> findAll();
	
	public Product findById(Integer id);
	
	public Product findByName(String name);
}
