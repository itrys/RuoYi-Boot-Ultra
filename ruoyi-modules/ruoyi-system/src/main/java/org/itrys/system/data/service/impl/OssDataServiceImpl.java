package org.itrys.system.data.service.impl;

import lombok.RequiredArgsConstructor;
import org.itrys.boot.domain.dto.OssDTO;
import org.itrys.system.converter.OssConverter;
import org.itrys.system.data.service.IOssDataService;
import org.itrys.system.domain.vo.SysOssVo;
import org.itrys.system.service.ISysOssService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/2
 */
@RequiredArgsConstructor
@Service
public class OssDataServiceImpl implements IOssDataService {
    private final ISysOssService sysOssService;
    @Override
    public List<OssDTO> listByIds(Collection<Long> ossIds) {
        List<OssDTO> list=new ArrayList<>();
        List<SysOssVo> result=sysOssService.listByIds(ossIds);
        for (SysOssVo sysOssVo : result) {
            OssDTO ossVO= OssConverter.INSTANCE.toOssVO(sysOssVo);
            list.add(ossVO);
        }
        return list;
    }
}
