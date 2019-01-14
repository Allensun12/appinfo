package cn.sun.service.impl;

import cn.sun.core.MD5Util;
import cn.sun.dao.DevUserMapper;
import cn.sun.pojo.DevUser;
import cn.sun.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper devUserMapper;

    /**
     * 说明：用户登陆
     * @param code 用户登陆名，数据库中唯一
     * @param password 用户登陆密码，加密前的明文
     * @return 返回用户对象
     */
    public DevUser doLogin(String code, String password) {
        DevUser devUser=devUserMapper.getDevUser(code.trim());
        if(devUser!=null){
            String pwd=devUser.getDevPassword();
            //加密功能再此处实现
            String pwd1=MD5Util.toMD5(password).toLowerCase();
            if(pwd!=null&&pwd.equals(pwd1)){
                return devUser;
            }
        }
        return null;
    }
}
