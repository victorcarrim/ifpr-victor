package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import repository.ProductRepository;

@WebServlet("/products")
public class ProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductRepository repository = new ProductRepository();
			List<Product> products = repository.findAll();
			req.setAttribute("products", products);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("products.jsp");
		
		dispatcher.forward(req, resp);
	}
}
