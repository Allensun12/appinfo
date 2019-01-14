package cn.sun.service;

import cn.sun.pojo.BackendUser;

public interface BackendUserService {
    BackendUser doLogin(String code, String password);
}
