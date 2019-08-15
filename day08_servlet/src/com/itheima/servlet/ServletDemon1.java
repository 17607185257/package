package com.itheima.servlet;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletDemon1 implements Servlet {
	
	
	
	//生命周期的方法，实例化对象
	//第一次访问时调用
	public ServletDemon1(){
		System.out.println("*****ServletDemon1被调用了*****");
	}
	//生命周期的方法，初始化方法
		//第一次访问时调用
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("*****init()被调用了*****");
	}
	//生命周期的方法，服务方法
	//接收用户请求，并做出响应
	//每次请求都被调用
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("*****service被调用了*****");
	}
	//生命周期的方法，销毁
	//当应用卸载时调用
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("*****destroy被调用了*****");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}





}
