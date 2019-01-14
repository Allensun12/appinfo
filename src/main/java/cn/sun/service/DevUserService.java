package cn.sun.service;

import cn.sun.pojo.DevUser;

public interface DevUserService {
    DevUser doLogin(String code,String password);
}
