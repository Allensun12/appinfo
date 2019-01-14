package cn.sun.controller;

import cn.sun.pojo.DevUser;
import cn.sun.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/devUser")
@Controller
public class DevUserController {
    @Resource
    private DevUserService devUserService;

    //说明：登陆
    @RequestMapping("/login")
    public String login(String devCode, String devPassword, HttpServletRequest request){
        //用户名或密非空判断
        if(devCode!=null&&!"".equals(devCode)&&devPassword!=null&&!"".equals(devPassword)){
            DevUser devUser=devUserService.doLogin(devCode,devPassword);
            if(devUser!=null){
                request.getSession().setAttribute("devUserSession",devUser);
                return "developer/main";
            }else {
                request.setAttribute("message","用户名或密码错误！");
                return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/WEB-INF/jsp/devlogin.jsp";
            }
        }else {
            request.setAttribute("message","用户名或密码不能为空！");
            return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/WEB-INF/jsp/devlogin.jsp";
        }
    }
    //说明：注销
    @RequestMapping("/logout")
    public String loginOut(HttpSession session){
        session.invalidate();//设置session失效
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/index.jsp";
    }

}
