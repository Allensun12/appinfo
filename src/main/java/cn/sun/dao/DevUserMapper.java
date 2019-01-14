package cn.sun.dao;

import cn.sun.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserMapper {
    DevUser getDevUser(@Param("code") String code);
}
