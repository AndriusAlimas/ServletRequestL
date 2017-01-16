package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import com.example.listener.MyServletRequestListener;

import java.io.*;

public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     out.println("<html><title>ServletResponse</title>");
	     out.println("<body><h3>Total request was made: " + MyServletRequestListener.totalRequest + "</h3></body>");
	     out.println("</html>");
	}
	
}
