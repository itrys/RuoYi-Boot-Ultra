package org.itrys.boot.excel.annotation;

import org.itrys.boot.excel.core.ExcelOptionsProvider;

import java.lang.annotation.*;

/**
 * Excel动态下拉选项注解
 *
 * @author Angus
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExcelDynamicOptions {

    /**
     * 提供者类全限定名
     * <p>
     * {@link ExcelOptionsProvider} 接口实现类 class
     */
    Class<? extends ExcelOptionsProvider> providerClass();
}
