package com.itheima.servlet;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletDemon1 implements Servlet {
	
	
	
	//�������ڵķ�����ʵ��������
	//��һ�η���ʱ����
	public ServletDemon1(){
		System.out.println("*****ServletDemon1��������*****");
	}
	//�������ڵķ�������ʼ������
		//��һ�η���ʱ����
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("*****init()��������*****");
	}
	//�������ڵķ��������񷽷�
	//�����û����󣬲�������Ӧ
	//ÿ�����󶼱�����
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("*****service��������*****");
	}
	//�������ڵķ���������
	//��Ӧ��ж��ʱ����
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("*****destroy��������*****");
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
