package hii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
       	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.println("<h1>kumar the king of andhra</h1>");
		writer.println("<h2>Nithin naidu akula</h2>");
		writer.println("<h3>ajay comedy star</h3>");
		
	}

}
