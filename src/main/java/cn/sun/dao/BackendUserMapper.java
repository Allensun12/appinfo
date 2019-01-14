package cn.sun.dao;

import cn.sun.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendUserMapper {
    BackendUser getBackendUser(@Param("code") String code);
}
