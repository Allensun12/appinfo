package cn.sun.dao;

import cn.sun.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    int getTotalRecord(@Param("appInfo") AppInfo appInfo);
    List<AppInfo> getAppInfoList(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize,@Param("appInfo") AppInfo appInfo);
}
