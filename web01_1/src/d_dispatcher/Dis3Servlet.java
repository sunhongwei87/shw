package d_dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Dis3Servlet
 */
public class Dis3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contextPath = this.getServletContext().getContextPath();
		System.out.println("context: " + contextPath);
		System.out.println("request: " + request.getContextPath());
		if(true)response.sendRedirect(request.getContextPath()+"/index.html");
		else{
			request.getRequestDispatcher("/1.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
