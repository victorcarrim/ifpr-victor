package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class TesteJSPServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("attr_chave", "um objeto qualquer");
		//resp.sendRedirect("https://google.com?q=pizza");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");
		
		dispatcher.forward(req, resp);
		
	}
}
