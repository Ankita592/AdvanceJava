package in.co.rays.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionTracking extends HttpServlet {

	 @Override
	 protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	 
	 {
		 String jsessionid = req.getParameter("jsessionid");
		 System.out.println("jsessionid = "+jsessionid);
		 
	 }
	
	 protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	 {
		 String jsessionid = req.getParameter("jsessionid");
		 System.out.println("jsessionid = "+jsessionid);
		 
		 
	 }
	
	
	
}
