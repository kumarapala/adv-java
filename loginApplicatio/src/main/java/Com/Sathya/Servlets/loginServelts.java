package Com.Sathya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginApplicatio")
public class loginServelts extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1 read the data
	String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		//step-2 process the data
		String status;
		if(username.equals("sathya")&& password.equals("sathya@123"))
		{
			
		status = "login successfull";
		}
		else
		{
			status = "login fail";
		}
		//step-3 render the data
		PrintWriter Writer = response.getWriter();
		response.setContentType("text/html");
		Writer.println("<html>");
		Writer.println("<h1>login status...</h1>"+status);
		Writer.println("</html>");
		}
	}


