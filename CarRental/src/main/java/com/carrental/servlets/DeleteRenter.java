package com.carrental.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.dao.RenterDao;

@WebServlet("/DeleteRenter")
public class DeleteRenter extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		RenterDao.delete(id);
		response.sendRedirect("ViewRenter");
	}
}
