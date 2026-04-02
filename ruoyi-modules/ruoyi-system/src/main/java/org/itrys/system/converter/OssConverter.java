package org.itrys.system.converter;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/2
 */

import org.itrys.boot.domain.dto.OssDTO;
import org.itrys.system.domain.vo.SysOssVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OssConverter {
    OssConverter INSTANCE = Mappers.getMapper(OssConverter.class); // 非 Spring 方式可选

    OssDTO toOssVO(SysOssVo ossVo);
}
