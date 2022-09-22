import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("")
public class Aplicacao1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest resq, HttpServletResponse resp) throws ServletException, IOException{
		
		resp.getWriter().print("Olá Mundo");
		
	}
}
