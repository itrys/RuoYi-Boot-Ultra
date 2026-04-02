package org.itrys.system.data.service;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/3/9
 */
public interface IConfigDataService {
    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数键值
     */
    String getConfigByKey(String configKey);
}
