package a_row;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 操作请求行
 */
public class RowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(87654321);a(1234);
		//了解
		//1.获取请求的路径
		String uri = request.getRequestURI();
		
		//2.获取get请求的参数
		String ps = request.getQueryString();
		
		//3.获取请求协议和版本
		String pro = request.getProtocol();
		System.out.println(11111);
		System.out.println("请求路径:"+uri);// /day01/row
		System.out.println("请求参数:"+ps);//username=tom&password=123
		System.out.println("协议版本:"+pro);//协议版本:HTTP/1.1
		System.out.println("-------------------");
		
		//★
		//1.获取请求方式
		String method = request.getMethod();//请求方式:GET
		System.out.println("请求方式:"+method);
		
		//2.获取项目的路径
		String path = request.getContextPath();//项目路径:/day36
		System.out.println("项目路径:"+path);
		
		//3.获取请求者的ip
		String ip = request.getRemoteAddr();//请求者ip:0:0:0:0:0:0:0:1
		System.out.println("请求者ip:"+ip);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void a(int a){
		System.out.println(a);
	}


}
