package org.itrys.auth.service;

import org.itrys.boot.domain.model.RegisterBody;

/**
 *
 *
 * @author 邓华锋
 * @date 2026/4/2
 */
public interface ISysRegisterService {
    void register(RegisterBody registerBody);
    void validateCaptcha(String username, String code, String uuid);
}
