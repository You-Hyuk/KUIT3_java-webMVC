package jwp.controller;

import core.db.MemoryUserRepository;
import jwp.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/user/updateForm")
//public class UpdateUserFormController extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//        User user = MemoryUserRepository.getInstance().findUserById(req.getParameter("userId"));
//        req.setAttribute("user", user);
//        RequestDispatcher rd = req.getRequestDispatcher("/user/updateForm.jsp");
//        rd.forward(req, resp);
//    }
//}

public class UpdateUserFormController implements Controller {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User user = MemoryUserRepository.getInstance().findUserById(req.getParameter("userId"));
        req.setAttribute("user", user);
        return "/user/updateForm.jsp";
    }
}

