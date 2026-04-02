package org.itrys.system.data.service;

import org.itrys.boot.domain.dto.UserDTO;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/9
 */
public interface IUserDataService {
    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    UserDTO getUserById(Long userId);
}
