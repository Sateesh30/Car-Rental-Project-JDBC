package com.carrental.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.beans.CarBean;
import com.carrental.dao.CarDao;


@WebServlet("/AddCar")
public class AddCar extends HttpServlet {
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
		String name=request.getParameter("name");
		String seater=request.getParameter("seater");
		
		String sissued = request.getParameter("issued");
		int issued = Integer.parseInt(sissued);
		
		String squantity=request.getParameter("quantity");
		int quantity=Integer.parseInt(squantity);
		
		
		CarBean bean=new CarBean(carid,name,seater,quantity,issued);
		int i=CarDao.save(bean);
		if(i>0){
			out.println("<h3>Car saved successfully</h3>");
		}
		request.getRequestDispatcher("addcarform.html").include(request, response);
		out.println("</div>");
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
