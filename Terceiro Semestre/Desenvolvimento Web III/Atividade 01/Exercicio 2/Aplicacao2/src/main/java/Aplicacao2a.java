import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/requisicao")
public class Aplicacao2a extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest resq, HttpServletResponse resp) throws IOException {
		String host, userAgent, acceptEncoding, acceptLanguage;
		
		PrintWriter out = resp.getWriter();
		
		host = resq.getHeader("host");
		userAgent = resq.getHeader("user-agent");
		acceptEncoding = resq.getHeader("accept-encoding");
		acceptLanguage = resq.getHeader("accept-language");
		
		out.println("Host: " + host);
		out.println("User-Agent: " + userAgent);
		out.println("Accet-Encoding: " + acceptEncoding);
		out.println("Accept-Language: " + acceptLanguage);
		
	}
	
	
}

