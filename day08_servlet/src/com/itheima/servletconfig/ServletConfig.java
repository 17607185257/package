package com.itheima.servletconfig;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//第一种方式 
		/*String encoding=config.getInitParameter("encoding");// 获得配置文件中的信息
		System.out.println(encoding);*/
		
		//第二种方式
	/*String encoding=super.getInitParameter("encoding");
	System.out.println(encoding);	*/
	
	//第三种方式
	
	String encoding=this.getServletConfig().getInitParameter("encoding");
	System.out.println(encoding);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
		
}
