package cn.sun.controller;

import cn.sun.pojo.AppInfo;
import cn.sun.service.AppInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/appInfoController")
@Controller
public class AppInfoController {
    @Resource
    private AppInfoService appInfoService;
    @RequestMapping("/appInfoList")
    public String showAppInfoList(String pageNumber, String pageSize, AppInfo appInfo, HttpServletRequest request) {
        Map<String,Object> map=appInfoService.getAppInfoList(pageNumber,pageSize,appInfo);
        System.out.println("========================查询结果===========================");
        System.out.println("总页码："+map.get("totalPage"));
        System.out.println("页码值："+map.get("pageNumber"));
        System.out.println("页大小："+map.get("pageSize"));
        List<AppInfo> list=(List<AppInfo>) map.get("appInfoList");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("===========================================================");
        request.setAttribute("map",map);
        request.setAttribute("querySoftwareName",appInfo.getSoftwareName());
        return "backend/applist";
    }

}
