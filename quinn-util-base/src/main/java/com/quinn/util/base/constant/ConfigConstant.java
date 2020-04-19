package com.quinn.util.base.constant;

import java.util.regex.Pattern;

/**
 * 字符串常量
 *
 * @author Qunhua.Liao
 * @since 2020-03-29
 */
public interface ConfigConstant {

    /**
     * Spring boot容器自动剔除的配置类样式
     */
    Pattern PROPERTY_NAME_AUTOCONFIGURE_EXCLUDE = Pattern.compile("spring.autoconfigure.exclude[\\d]");

    /**
     * 默认日志生成器
     */
    String SYSTEM_LOGGER_GENERATOR_DEFAULT = "LoggerExtendSlf4jGenerator";

    /**
     * 默认日志生成器
     */
    String SYSTEM_USER_KEY_DEFAULT = "system";

    /**
     * 配置前缀：类路径下懒汉模式
     */
    String CONFIG_KEY_PREFIX_CLASSPATH = "classpath:";

    /**
     * 配置前缀：类路径下饿汉模式
     */
    String CONFIG_KEY_PREFIX_CLASSPATH_ALL = "classpath*:";

    /**
     * 默认日志生成器
     */
    String CONFIG_KEY_LOGGER_GENERATOR_NAME = "com.quinn-service.logger.generator.name";

    /**
     * 默认日志工厂初始化器
     */
    String SYSTEM_LOGGER_INITIALIZER_DEFAULT = "DefaultLoggerFactoryInitializer";

    /**
     * 默认日志工厂初始化器
     */
    String CONFIG_KEY_LOGGER_INITIALIZER_NAME = "com.quinn-service.logger.initializer.name";

    /**
     * 参数名-外部配置文件路径
     */
    String CONFIG_KEY_OUT_CONFIGURATION_FILE_PATH = "com.quinn-service.profile.out.path";

    /**
     * 所有包根路径
     */
    String PACKAGE_PATH_BASE = "com.quinn";

    /**
     * 框架Bean扫描路径
     */
    String PACKAGE_PATH_FRAMEWORK = "com.quinn.framework";

    /**
     * 应用Bean扫描路径-名称（配置文件中对应的key）
     */
    String PACKAGE_NAME_APPLICATION = "package.path.application";

    /**
     * 各功能模块添加资源的预留配置接口
     */
    String MODULE_DEFINITION_RESOURCES = "classpath*:META-INF/biz-quinn-module*.properties";

    /**
     * 各功能模块添加资源的预留配置接口
     */
    String MODULE_DEFINITION_METADATA = "classpath*:META-INF/meta-quinn-module*.properties";

    /**
     * 各功能模块添加资源的预留配置接口
     */
    String MODULE_DEFINITION_SDK = "classpath*:META-INF/sdk-quinn-module*.properties";

    /**
     * 功能模块扫描路径-名称（配置文件中对应的key）
     */
    String PACKAGE_NAME_MODULES_BEAN = "module.bean.basePackages";

    /**
     * 功能模块Mapper扫描路径-名称（配置文件中对应的key）
     */
    String PACKAGE_NAME_MODULES_MAPPER = "module.mapper.basePackages";

    /**
     * 功能模块命名空间（配置文件中对应的key）
     */
    String NAMESPACE_NAME_MODULES = "module.configuration.namespace";

    /**
     * 功能模块命名空间（配置文件中对应的key）
     */
    String GROUPS_NAME_MODULES = "module.configuration.groups";

    /**
     * 功能模块扫描路径-名称（配置文件中对应的key）
     */
    String CONFIGURATION_CLASS_NAME_IGNORED = "spring.autoconfigure.exclude";

    /**
     * 接口文档分组
     */
    String RESTFUL_DOC_API_GROUPS = "com.quinn-service.base.http.restful.doc.api.groups";

    /**
     * 接口文档标题
     */
    String RESTFUL_DOC_API_TITLES = "com.quinn-service.base.http.restful.doc.api.titles";

    /**
     * 接口文档描述
     */
    String RESTFUL_DOC_API_DESCRIPTIONS = "com.quinn-service.base.http.restful.doc.api.descriptions";

    /**
     * 接口文档URL
     */
    String RESTFUL_DOC_API_TERMS_OF_URL = "com.quinn-service.base.http.restful.doc.api.termsOfUrls";

    /**
     * 接口文档版本
     */
    String RESTFUL_DOC_API_VERSIONS = "com.quinn-service.base.http.restful.doc.api.versions";

    /**
     * 生成SWA
     */
    String RESTFUL_DOC_API_URL_PATTERN = "com.quinn-service.base.restful.doc.api.url.pattern";

    /**
     * Redis部署方式 - 哨兵
     */
    String REDIS_DEPLOY_TYPE_SENTINEL = "sentinel";

    /**
     * Redis部署方式 - Cluster
     */
    String REDIS_DEPLOY_TYPE_CLUSTER = "cluster";

    /**
     * 配置:许可证路径
     */
    String PROP_KEY_OF_LICENCE_PATH = "com.quinn-service.licence.path";

    /**
     * 默认许可证路径
     */
    String DEFAULT_LICENCE_PATH = "licence/licence.lic";

}