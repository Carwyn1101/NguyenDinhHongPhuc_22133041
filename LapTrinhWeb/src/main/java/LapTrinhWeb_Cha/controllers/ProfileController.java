package LapTrinhWeb_Cha.controllers;

import java.io.File;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import LapTrinhWeb_Cha.models.UserModel;
import LapTrinhWeb_Cha.services.impl.UserServiceImpl;
import LapTrinhWeb_Cha.ultis.Constant;

@WebServlet(urlPatterns = "/profile")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 15)
public class ProfileController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute("account");

        req.setAttribute("user", user);
        req.getRequestDispatcher("/views/profile.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
    	
    	HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute("account");

        String fullname = req.getParameter("fullname");
        String phone = req.getParameter("phone");

        // Handle file upload
        Part filePart = req.getPart("avatar");
        String fileName = filePart.getSubmittedFileName();
//        if (fileName != null && !fileName.isEmpty()) {
//            String uploadPath = getServletContext().getRealPath("") + File.separator + Constant.UPLOAD_DIR;
//            //String uploadPath = Constant.UPLOAD_DIR;
//            File uploadDir = new File(uploadPath);
//            if (!uploadDir.exists()) uploadDir.mkdir();
//            
//            filePart.write(uploadPath + File.separator + fileName);
//            user.setAvatar(fileName);  // Save the file name in user model
//        }
        if (fileName != null && !fileName.isEmpty()) {
            // Không dùng getServletContext().getRealPath("") khi đã có đường dẫn tuyệt đối
            String uploadPath = Constant.UPLOAD_DIR;
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) uploadDir.mkdir();

            filePart.write(uploadPath + File.separator + fileName);
            user.setAvatar(fileName);  // Save the file name in user model
        }

        user.setFullName(fullname);
        user.setPhone(phone);

        // Save changes to database
        UserServiceImpl userService = new UserServiceImpl();
        userService.updateUserProfile(user);

        session.setAttribute("account", user);
        resp.sendRedirect(req.getContextPath() + "/profile");
    }
}
