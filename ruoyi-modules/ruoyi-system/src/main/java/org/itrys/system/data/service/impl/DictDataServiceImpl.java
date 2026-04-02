package org.itrys.system.data.service.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.RequiredArgsConstructor;
import org.itrys.boot.domain.dto.DictDataDTO;
import org.itrys.system.converter.DictDataConverter;
import org.itrys.system.data.service.IDictDataService;
import org.itrys.system.domain.vo.SysDictDataVo;
import org.itrys.system.service.ISysDictDataService;
import org.itrys.system.service.ISysDictTypeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典 数据API实现
 *
 * @author 邓华锋
 * @date 2026/2/24
 */
@RequiredArgsConstructor
@Service
public class DictDataServiceImpl implements IDictDataService {

    private final ISysDictTypeService dictTypeService;
    private final ISysDictDataService dictDataService;

    @Override
    public List<DictDataDTO> listDictDataByType(String dictType) {
        List<SysDictDataVo> data = dictTypeService.selectDictDataByType(dictType);
        if (ObjectUtil.isNull(data)) {
            return List.of();
        }
        List<DictDataDTO> dictDatas = new ArrayList<>();
        for (SysDictDataVo sysDictDataVo : data) {
            DictDataDTO dictDataDTO = new DictDataDTO();
            //dictDataDTO.setDictCode(sysDictDataVo.getDictCode());
            //dictDataDTO.setDictSort(sysDictDataVo.getDictSort());
            dictDataDTO.setDictLabel(sysDictDataVo.getDictLabel());
            dictDataDTO.setDictValue(sysDictDataVo.getDictValue());
            //dictDataDTO.setDictType(sysDictDataVo.getDictType());
            //dictDataDTO.setCssClass(sysDictDataVo.getCssClass());
            //dictDataDTO.setListClass(sysDictDataVo.getListClass());
            dictDataDTO.setIsDefault(sysDictDataVo.getIsDefault());
            dictDataDTO.setRemark(sysDictDataVo.getRemark());
            dictDatas.add(dictDataDTO);
        }
        return dictDatas;
    }

    @Override
    public DictDataDTO getDictDataByTypeDictValue(String dictType, String dictValue) {
        SysDictDataVo dictData = dictDataService.selectDictDataByTypeDictValue(dictType, dictValue);
        return DictDataConverter.INSTANCE.toDictDataVO(dictData);
    }
}
