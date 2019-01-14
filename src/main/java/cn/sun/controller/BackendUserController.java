package cn.sun.controller;

import cn.sun.pojo.BackendUser;
import cn.sun.service.BackendUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class BackendUserController {
    @Resource
    private BackendUserService backendUserService;

    //说明：登录
    @RequestMapping("/login")
    public String login(String userCode, String userPassword, HttpServletRequest request){
        //用户名或密非空判断
        if(userCode!=null&&!"".equals(userCode)&&userPassword!=null&&!"".equals(userPassword)){
            BackendUser backendUser=backendUserService.doLogin(userCode,userPassword);
            if(backendUser!=null){
                request.getSession().setAttribute("userSession",backendUser);
                return "backend/main";
            }else {
                request.setAttribute("message","用户名或密码错误！");
                return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/WEB-INF/jsp/backendlogin.jsp";
            }
        }else {
            request.setAttribute("message","用户名或密码不能为空！");
            return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/WEB-INF/jsp/backendlogin.jsp";
        }
    }
    //说明：注销
    @RequestMapping("/logout")
    public String loginOut(HttpSession session){
        session.invalidate();
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/index.jsp";
    }
}
