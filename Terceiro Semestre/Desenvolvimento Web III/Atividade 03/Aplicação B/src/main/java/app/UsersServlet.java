package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> usuarios = new ArrayList<String>();
		usuarios.add("Lara");
		usuarios.add("Suzy");
		usuarios.add("Victor");
		
		req.setAttribute("usuarios", usuarios);
		
		RequestDispatcher rd = req.getRequestDispatcher("listaUsuarios.jsp");
		
		rd.foward(req, resp);
		
	}

}
