package b_header;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 操作请求头
 */
public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取浏览器的内核
		String agent = request.getHeader("user-agent");
		System.out.println(agent);
		//Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36
		//2.获取页面的来源
		String referer = request.getHeader("referer");
		System.out.println(referer);
		//http://localhost:8080/day36/
		
		System.out.println("-------------------");
		//3.了解 获取所有的请求头的名称
		Enumeration<String> names = request.getHeaderNames();
		while(names.hasMoreElements()){
			String nextElement = names.nextElement();
			System.out.println(nextElement);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
