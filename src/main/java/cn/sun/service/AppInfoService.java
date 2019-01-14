package cn.sun.service;

import cn.sun.pojo.AppInfo;

import java.util.Map;

public interface AppInfoService {
    Map<String,Object> getAppInfoList(String pageNumber, String pageSize, AppInfo appInfo);
}
