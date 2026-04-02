package org.itrys.system.data.service.impl;

import lombok.RequiredArgsConstructor;
import org.itrys.system.data.service.IConfigDataService;
import org.itrys.system.service.ISysConfigService;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/9
 */
@RequiredArgsConstructor
@Service
public class ConfigDataService implements IConfigDataService {
    private final ISysConfigService sysConfigService;
    @Override
    public String getConfigByKey(String configKey) {
        return sysConfigService.selectConfigByKey(configKey);
    }
}
