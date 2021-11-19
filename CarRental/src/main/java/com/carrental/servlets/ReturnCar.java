package com.carrental.servlets;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.dao.CarDao;

@WebServlet("/ReturnCar")
public class ReturnCar extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Return Car</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navrenter.html").include(request, response);
		
		out.println("<div class='container'>");
		String carid=request.getParameter("carid");
		out.print(carid);
		String srenterid=request.getParameter("renterid");
		int renterid=Integer.parseInt(srenterid);
		out.print(renterid);
		
		int i=CarDao.returnCar(carid,renterid);
		if(i>0){
			out.println("<h3>Car returned successfully</h3>");
		}else{
			out.println("<h3>Sorry, unable to return car.</h3><p>We may have sortage of cars. Kindly visit later.</p>");
		}
		out.println("</div>");
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
