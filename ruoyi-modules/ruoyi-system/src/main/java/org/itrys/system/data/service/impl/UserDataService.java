package org.itrys.system.data.service.impl;

import lombok.RequiredArgsConstructor;
import org.itrys.boot.domain.dto.UserDTO;
import org.itrys.system.converter.UserConverter;
import org.itrys.system.data.service.IUserDataService;
import org.itrys.system.domain.vo.SysUserVo;
import org.itrys.system.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/9
 */
@RequiredArgsConstructor
@Service
public class UserDataService implements IUserDataService {
    private final ISysUserService sysUserService;
    @Override
    public UserDTO getUserById(Long userId) {
        SysUserVo user = sysUserService.selectUserById(userId);
        return UserConverter.INSTANCE.toOssVO(user);
    }
}
