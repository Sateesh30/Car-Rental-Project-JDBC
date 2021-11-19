package com.carrental.servlets;


import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.beans.CarBean;
import com.carrental.dao.CarDao;





@WebServlet("/ViewCar")
public class ViewCar extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Car</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navrenter.html").include(request, response);
		
		out.println("<div class='container'>");
		
		List<CarBean> list=CarDao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>CarID</th><th>Name</th><th>Seater</th><th>Rented</th><th>Quantity</th><th>Delete</th></tr>");
		for(CarBean bean:list){
			out.println("<tr><td>"+bean.getCarid()+"</td><td>"+bean.getName()+"</td><td>"+bean.getSeater()+"</td><td>"+bean.getIssued()+"</td><td>"+bean.getQuantity()+"</td><td>"+
					"</td></tr>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}
}
