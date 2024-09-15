package LapTrinhWeb_Cha.controllers;

import java.io.IOException;

import LapTrinhWeb_Cha.services.impl.UserServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/forgetPassword")


public class ForgetPasswordController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserServiceImpl userService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    // Điều hướng người dùng tới trang forgetPassword.jsp khi họ truy cập vào ForgetPasswordController qua GET request
	    RequestDispatcher dispatcher = req.getRequestDispatcher("/views/forgetPassword.jsp");
	    dispatcher.forward(req, resp);
	}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String newPassword = req.getParameter("newPassword");

        try {
            userService.resetPassword(username, newPassword);
            resp.sendRedirect(req.getContextPath() + "/login");
        } catch (Exception e) {
            req.setAttribute("error", e.getMessage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/forgetPassword.jsp");
            dispatcher.forward(req, resp);
        }
    }

}
