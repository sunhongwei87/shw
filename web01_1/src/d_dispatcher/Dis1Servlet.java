package d_dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 找我借钱
 */
//localhost:8080/day01/Dis1Servlet
public class Dis1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("俊文曰:东哥,借我"+request.getParameter("money"));
		System.out.println("我曰:稍等~~");
		
		//将借钱人的姓名放入request
		request.setAttribute("msg", "俊文");
	/*	★respnse.setContentType("text/html;charset=utf-8");
		1.设置文件的类型为 text/html
		2.设置响应流的编码 utf-8
		3.告诉浏览器用utf-8解码*/

		/*request.setCharacterEncoding("utf-8");//设置请求流的编码的*/
		
		//我找春喜去借20 请求转发
		request.getRequestDispatcher("/dis2").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
