package cn.sun.service.impl;


import cn.sun.dao.AppInfoMapper;
import cn.sun.pojo.AppInfo;
import cn.sun.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;
    public Map<String, Object> getAppInfoList(String pageNumber, String pageSize, AppInfo appInfo) {
        //设置默认值的起始页码
        int dPageNumber=1;
        //设置默认的页面大小
        int dPageSize=5;
        //解析用户设置的页码
        if(pageNumber!=null&&pageNumber.trim().length()>0){
            dPageNumber=Integer.parseInt(pageNumber);
        }
        //解析用户设置的页面大小
        if(pageSize!=null&&pageSize.trim().length()>0){
            dPageSize=Integer.parseInt(pageSize);
        }
        int totalRecord=appInfoMapper.getTotalRecord(appInfo);
        int totalPage=totalRecord%dPageSize==0? totalRecord/dPageSize:totalRecord/dPageSize+1;
        int pageIndex=(dPageNumber-1)*dPageSize;
        List<AppInfo> appInfoList=appInfoMapper.getAppInfoList(pageIndex,dPageSize,appInfo);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageNumber",dPageNumber);
        map.put("pageSize",dPageSize);
        map.put("totalPage",totalPage);
        map.put("appInfoList",appInfoList);
        String softwareName=appInfo.getSoftwareName()==null? "":appInfo.getSoftwareName();
        Long flatformId= appInfo.getFlatformId()==null? 0: appInfo.getFlatformId();
        map.put("appInfo",appInfo);
        return map;
    }
}
