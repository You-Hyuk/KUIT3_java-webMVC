package jwp.controller;

import core.db.MemoryUserRepository;
import core.mvc.Controller;
import core.view.JspView;
import core.view.View;
import jwp.util.UserSessionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUserController implements Controller {
    @Override
    public View execute(HttpServletRequest req, HttpServletResponse resp) {
        if(UserSessionUtils.isLogined(req.getSession())){
            req.setAttribute("users", MemoryUserRepository.getInstance().findAll());
            return new JspView( "/user/list.jsp");
        }
        return new JspView(REDIRECT + "/user/loginForm");
    }
}
