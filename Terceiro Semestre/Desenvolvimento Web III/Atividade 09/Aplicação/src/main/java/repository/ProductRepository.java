package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import models.Product;

public class ProductRepository implements IProductRepository{
	private Connection conn;
	
	public ProductRepository() {
		conn = ConnectionFactory.getConnection();
	}

	@Override
	public Integer insert(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Product product) {
		
		return null;
	}

	@Override
	public Integer deleteById(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			stmt =  conn.prepareStatement("Select * from produtos");
			result = stmt.executeQuery();
			
			while(result.next()) {
				
				Integer id = result.getInt("id");
				String name = result.getString("name");
				Double price = result.getDouble("price");
				String description = result.getString("description");
				String imageUri = result.getString("imageUri");
				
				Product p = new Product(id, name, price, description, imageUri);
				
				products.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());}
//		} finally {
//			ConnectionFactory.close();
//			try {
//				stmt.close();
//				result.close();
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		
		return products;
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
