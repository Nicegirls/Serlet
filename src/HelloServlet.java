import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init of Hello Servlet");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
	/**
		Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			String value = req.getHeader(header);
			System.out.printf("%s\t%s%n",header,value);
		}
		try {
			resp.getWriter().println("<h1>Hello Servlet</h1>");
			resp.getWriter().println(new Date().toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		/**
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter pw = resp.getWriter();
//			pw.println("<h1>Hello Servlet</h1>");
//			resp.setContentType("text/lol");
			pw.println("<h1>第一次使用 Servlet</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		try {
			resp.setDateHeader("Expires", 0);
			resp.setHeader("Cache", "no-cache");
			resp.setHeader("prama", "nocache");
			resp.getWriter().println("<h1>Hello Servlet!</h1>");
			resp.getWriter().println(new Date().toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
