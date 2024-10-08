package LapTrinhWeb_Cha.controllers;

import java.io.IOException;

import LapTrinhWeb_Cha.models.UserModel;
import LapTrinhWeb_Cha.services.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import LapTrinhWeb_Cha.ultis.Constant;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login")

public class LoginController extends HttpServlet {
	
	public LoginController() {
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("account") != null) {
			resp.sendRedirect(req.getContextPath() + "/waiting");
			return;
		}
		// Check cookie
//		Cookie[] cookies = req.getCookies();
//		if (cookies != null) {
//			for (Cookie cookie : cookies) {
//				if (cookie.getName().equals("username")) {
//					session = req.getSession(true);
//					session.setAttribute("username", cookie.getValue());
//					resp.sendRedirect(req.getContextPath() + "/waiting");
//					return;
//				}
//			}
//		}
		req.getRequestDispatcher("views/login.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ma hoa UTF-8 Tieng Viet
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		//lay tham so tu view
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//boolean isRememberMe = false;
		//String remember = req.getParameter("remember");
		Boolean isRememberMe = "on".equals(req.getParameter("remember"));
//		if ("on".equals(remember)) {
//			isRememberMe = true;
//		}
		String alertMsg = "";
		if (username.isEmpty() || password.isEmpty()) {
			alertMsg = "Tài khoản hoặc mật khẩu không được rỗng";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
			return;
		}
		UserServiceImpl service = new UserServiceImpl();
		UserModel user = service.login(username, password);
		if (user != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("account", user);
			if (isRememberMe) {
				saveRemeberMe(resp, username, password);
				req.setAttribute("remember", isRememberMe);
			} else {
				deleteRememberMe(resp);
			}
			resp.sendRedirect(req.getContextPath() + "/waiting");
		} else {
			alertMsg = "Tài khoản hoặc mật khẩu không đúng";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}
	}

	private void saveRemeberMe(HttpServletResponse response, String username, String password) {
		//Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, username);
		Cookie cookie = new Cookie("username", username);
		Cookie passwordCookie = new Cookie("password", password);
		cookie.setMaxAge(30);
		passwordCookie.setMaxAge(30);
		cookie.setPath("/");
		response.addCookie(cookie);
		response.addCookie(passwordCookie);
	}
	private void deleteRememberMe(HttpServletResponse response) {
		Cookie cookie = new Cookie("username", "");
		Cookie passwordCookie = new Cookie("password", "");
		cookie.setMaxAge(0); // Xóa cookie 
		passwordCookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		response.addCookie(passwordCookie);
	}
}
