package org.itrys.auth.service;

import me.zhyd.oauth.model.AuthUser;
import org.itrys.boot.domain.model.LoginUser;
import org.itrys.boot.enums.LoginType;
import org.itrys.system.domain.vo.SysUserVo;

import java.util.function.Supplier;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/4/2
 */
public interface ISysLoginService {
    void socialRegister(AuthUser authUserData);
    void logout();
    void recordLoginInfo(String username, String status, String message);
    LoginUser buildLoginUser(SysUserVo user);
    void recordLoginInfo(Long userId, String ip);
    void checkLogin(LoginType loginType, String username, Supplier<Boolean> supplier);
}
