package c_param;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 	获取请求参数
*/
public class ParamPlusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户名
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso8859-1"),"utf-8");
		System.out.println(username);
		
		//获取爱好
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println(hobbies);
		
		System.out.println("----------");
		//获取所有的参数和值
		Map<String, String[]> map = request.getParameterMap();
		for(String key:map.keySet()){
			System.out.println(key+"="+Arrays.toString(map.get(key)));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//先设置编码
		request.setCharacterEncoding("utf-8");
		
		//获取用户名
		String username = request.getParameter("username");
		System.out.println(username);
		
		//获取爱好
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println(hobbies);
		
		System.out.println("----------");
		//获取所有的参数和值
		Map<String, String[]> map = request.getParameterMap();
		for(String key:map.keySet()){
			System.out.println(key+"="+Arrays.toString(map.get(key)));
		}
	}

}
