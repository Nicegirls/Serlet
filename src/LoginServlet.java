import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public LoginServlet(){
		System.out.println("LoginServlet���췽��������");
	}
	



	@Override
	public void init(ServletConfig config) {
		// TODO Auto-generated method stub
		System.out.println("init(ServletConfig)");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory()");
	}




	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
//		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println("�������������ʱ������URL,����Э�� ������ �˿ڣ�����У�:"+req.getRequestURL());
		System.out.println("����������������Դ�����֣�ȥ��Э���������:"+req.getRequestURI());
		System.out.println("�������еĲ�������:"+req.getQueryString());
		System.out.println("����������ڿͻ�����IP��ַ:"+req.getRemoteAddr());
		System.out.println("����������ͻ�����������:"+req.getRemoteHost());
		System.out.println("����������Ŀͻ���ʹ�õĶ˿ں�:"+req.getRemotePort());
		System.out.println("��������IP��ַ:"+req.getLocalAddr());
		System.out.println("��������������:"+req.getLocalName());
		System.out.println("�õ��ͻ���������ʽ"+req.getMethod());
		System.out.println("name:"+name);
		String html = null;
		/**
		if("admin".equals(name)&&"123".equals(password))
			html = "<div style='color:green'>��½�ɹ�</div>";
		else
			html = "<div style='color:red'>��½ʧ��</div>";
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.println(html);
		*/
		if("admin".equals(name)&&"123".equals(password)){
			req.getRequestDispatcher("success.html").forward(req, resp);
		}
		else{
			resp.setStatus(301);
			resp.sendRedirect("fail.html");
		}
		
	}
	
}
