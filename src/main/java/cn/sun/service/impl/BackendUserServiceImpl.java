package cn.sun.service.impl;

import cn.sun.core.MD5Util;
import cn.sun.dao.BackendUserMapper;
import cn.sun.pojo.BackendUser;
import cn.sun.service.BackendUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BackendUserServiceImpl implements BackendUserService {
    @Resource
    private BackendUserMapper backendUserMapper;

    /**
     * 说明：登陆功能
     * @param code 用户名
     * @param password 密码
     * @return 返回对象
     */
    public BackendUser doLogin(String code, String password) {
        BackendUser backendUser=backendUserMapper.getBackendUser(code.trim());
        if(backendUser!=null){
            String pwd=backendUser.getUserPassword();
            //加密功能在此处实现
            String pwd1= MD5Util.toMD5(password).toLowerCase();
            if(pwd!=null&&pwd.equals(pwd1)){
                return backendUser;
            }
        }
        return null;
    }
}
