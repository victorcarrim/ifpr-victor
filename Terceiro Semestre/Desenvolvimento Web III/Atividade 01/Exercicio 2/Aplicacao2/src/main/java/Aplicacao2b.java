import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/requisicao")
public class Aplicacao2b extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest resq, HttpServletResponse resp) throws IOException {
		String metodo, uri, protocolo;
		
		PrintWriter out = resp.getWriter();
	
		
		metodo = resq.getMethod();
		uri = resq.getRequestURI();
		protocolo = resq.getProtocol();
		
		out.println("Metodo: " + metodo);
		out.println("URI: " + uri);
		out.println("Protocolo: " + protocolo);
	}
	
	
}

