package org.itrys.boot.sensitive.handler;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.itrys.boot.json.enhance.JsonEnhancementContext;
import org.itrys.boot.json.enhance.JsonFieldContext;
import org.itrys.boot.json.enhance.JsonFieldProcessor;
import org.itrys.boot.sensitive.annotation.Sensitive;
import org.itrys.boot.sensitive.core.SensitiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

/**
 * 响应脱敏处理器。
 */
@Slf4j
@Order(100)
public class SensitiveJsonFieldProcessor implements JsonFieldProcessor {

    @Autowired(required = false)
    private SensitiveService sensitiveService;

    @Override
    public Object process(JsonFieldContext fieldContext, Object value, JsonEnhancementContext context) {
        Sensitive sensitive = fieldContext.getAnnotation(Sensitive.class);
        if (sensitive == null || !(value instanceof String text)) {
            return value;
        }
        if (ObjectUtil.isNotNull(sensitiveService) && sensitiveService.isSensitive(sensitive.roleKey(), sensitive.perms())) {
            return sensitive.strategy().desensitizer().apply(text);
        }
        return text;
    }

}
