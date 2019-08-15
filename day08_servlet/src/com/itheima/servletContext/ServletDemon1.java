package com.itheima.servletContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemon1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//test1();
			text2();
			
	}

	private void text2() throws IOException, FileNotFoundException {
		ServletContext sc=this.getServletContext();
		String path=sc.getRealPath("/WEB-INF/classes/a.properties");//要以/开头，/代表的是当前应用的名称
		Properties prop=new Properties();
		prop.load(new FileInputStream(path));
		System.out.println(prop.get("key"));
	}

	private void test1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ServletContext sc=this.getServletContext();
		String path=sc.getRealPath("/WEB-INF/a.properties");//要以/开头，/代表的是当前应用的名称
		Properties prop=new Properties();
		prop.load(new FileInputStream(path));
		System.out.println(prop.getProperty("key"));
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);		
	}

}
