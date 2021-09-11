package servletone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class Servletone
 */
@WebServlet({ "/Servletone", "/Web" })
public class Servletone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletone() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = request.getParameter("txtname");
		System.out.println(name);
		
		response.setContentType("text/html");
		
		String htmlResponse ="<html>"
				+"<body><center>"
				
+"name is :"+name
				+ "</form>"
				+"<a href ='enter.jsp'>Enter home</a>"
			
				+"</center></body>"
				+"</html>"
				;
		
		Cookie cookie = new Cookie("txtname", name);
		response.addCookie(cookie);
		
		PrintWriter wr = response.getWriter();
		wr.println(htmlResponse);
		
		
		
		
	}

}
