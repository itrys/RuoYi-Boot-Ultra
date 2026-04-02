package org.itrys.system.data.service;

import org.itrys.boot.domain.dto.DictDataDTO;

import java.util.List;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/2/24
 */
public interface IDictDataService {
    List<DictDataDTO> listDictDataByType(String dictType);
    DictDataDTO getDictDataByTypeDictValue(String dictType, String dictValue);
}
