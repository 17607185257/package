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

		//��һ�ַ�ʽ 
		/*String encoding=config.getInitParameter("encoding");// ��������ļ��е���Ϣ
		System.out.println(encoding);*/
		
		//�ڶ��ַ�ʽ
	/*String encoding=super.getInitParameter("encoding");
	System.out.println(encoding);	*/
	
	//�����ַ�ʽ
	
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
