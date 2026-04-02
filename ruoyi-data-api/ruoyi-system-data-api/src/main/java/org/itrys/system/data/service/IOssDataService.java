package org.itrys.system.data.service;

import org.itrys.boot.domain.dto.OssDTO;

import java.util.Collection;
import java.util.List;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/2
 */
public interface IOssDataService {
    List<OssDTO> listByIds(Collection<Long> ossIds);
}
