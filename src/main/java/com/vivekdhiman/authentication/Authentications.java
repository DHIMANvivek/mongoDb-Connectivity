package com.vivekdhiman.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vivekdhiman.Control.DataBase;
import com.vivekdhiman.model.Access;


@WebServlet("/Login")
public class Authentications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

 
 
 
 
    public Authentications() {
        super();
     
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Access access = new Access();
		access.email = request.getParameter("email");
		access.password = request.getParameter("password");
		System.out.println("ACCESS:"+access);
		
		DataBase database = new  DataBase();
		database.fetching();
		
response.setContentType("text/html");
		
		
		PrintWriter writer = response.getWriter();
		
		String html = "";
		if(true) {
		html =  "<html><body><center>THANK YOU "+access.email+"<br>Login Success<br><br>"+"<a href='Script.jsp'>Go To Script</a>"+
				"<html><body><center>"; 
		}
		
		writer.println(html);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
