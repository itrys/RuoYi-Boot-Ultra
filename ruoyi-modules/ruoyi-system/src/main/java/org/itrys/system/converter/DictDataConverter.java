package org.itrys.system.converter;

import org.itrys.boot.domain.dto.DictDataDTO;
import org.itrys.system.domain.vo.SysDictDataVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/2
 */
@Mapper(componentModel = "spring")
public interface DictDataConverter {
    DictDataConverter INSTANCE = Mappers.getMapper(DictDataConverter.class);

    DictDataDTO toDictDataVO(SysDictDataVo dictDataVo);
}
