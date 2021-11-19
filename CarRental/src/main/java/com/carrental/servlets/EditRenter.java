package com.carrental.servlets;


import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.beans.RenterBean;
import com.carrental.dao.RenterDao;



@WebServlet("/EditRenter")
public class EditRenter extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String smobile=request.getParameter("mobile");
		long mobile=Long.parseLong(smobile);
		RenterBean bean=new RenterBean(id,name, email, password, mobile);
		RenterDao.update(bean);
		response.sendRedirect("ViewRenter");
	}

}
