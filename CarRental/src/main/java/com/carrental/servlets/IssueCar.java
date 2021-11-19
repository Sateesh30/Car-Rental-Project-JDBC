package com.carrental.servlets;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.beans.IssueCarBean;
import com.carrental.dao.CarDao;

@WebServlet("/IssueCar")
public class IssueCar extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Add Car Form</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navrenter.html").include(request, response);
		
		out.println("<div class='container'>");
		String carid=request.getParameter("carid");
		
		String renterid=request.getParameter("renterid");
		
		String rentername=request.getParameter("rentername");
		
		String srentermobile=request.getParameter("rentermobile");
		long rentermobile=Long.parseLong(srentermobile);
		
		
		IssueCarBean bean=new IssueCarBean(carid,renterid,rentername,rentermobile);
		int i=CarDao.issueCar(bean);
		if(i>0){
			out.println("<h3>Car rented successfully</h3>");
		}else{
			out.println("<h3>Sorry, unable to rent car.</h3><p> Kindly visit later.</p>");
		}
		out.println("</div>");
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
