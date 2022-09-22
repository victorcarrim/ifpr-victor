package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;

public class ConnectionTest {
	
	public static void main(String[] args) {
		//ConnectionFactory factory = new ConnectionFactory();
		
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("select * from produtos;");
			
			ResultSet produtos = stmt.executeQuery();
			
			while(produtos.next()) {
				Integer i = produtos.getInt("id");
				String name = produtos.getString("name");
				String description = produtos.getString("description");
				String imageUri = produtos.getString("imageUri");
				
				System.out.println(i + " : " + name + " : " + description + " : " + imageUri);
//				System.out.println(name);
//				System.out.println(description);
//				System.out.println(imageUri);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
