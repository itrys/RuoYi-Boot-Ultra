package org.itrys.system.converter;

import org.itrys.boot.domain.dto.UserDTO;
import org.itrys.system.domain.vo.SysUserVo;
import org.mapstruct.factory.Mappers;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/10
 */
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);
    UserDTO toOssVO(SysUserVo sysUserVo);
}
