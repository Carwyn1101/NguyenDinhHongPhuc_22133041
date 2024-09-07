package Web1.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home","/trangchu"}) //root


public class HomeController extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3470227057427224862L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		PrintWriter printW = resp.getWriter();
		printW.println(holot+" "+ten);
		printW.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		PrintWriter printW = resp.getWriter();
		printW.println(holot+" "+ten);
		printW.close();
	}
	
}
