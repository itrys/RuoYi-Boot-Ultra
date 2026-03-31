<img src="https://foruda.gitee.com/images/1679673773341074847/178e8451_1766278.png" width="50%" height="50%">
<div style="height: 10px; clear: both;"></div>

- - -
## 平台简介

[![GitHub](https://img.shields.io/github/stars/itrys/RuoYi-Boot-Ultra.svg?label=Github%20Stars)](https://github.com/itrys/RuoYi-Boot-Ultra)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/itrys/RuoYi-Boot-Ultra/blob/main/LICENSE)
<br>
[![RuoYi-Boot-Ultra](https://img.shields.io/badge/RuoYi_Boot_Ultra-1.0.0-success.svg)](https://github.com/itrys/RuoYi-Boot-Ultra)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-blue.svg)]()
[![JDK-21](https://img.shields.io/badge/JDK-21-green.svg)]()

> **RuoYi-Boot-Ultra** 是基于 RuoYi-Vue-Plus 5.5.3 版本重构的企业级后台管理系统，采用 DHF（Domain-Helper-Facade）架构，蜕变技术基座，同步更新代码，业务代码剥离，技术自主迭代，业务逻辑恒稳运行。

> 对标 Spring Boot 源码，规整模块与依赖，作为纯粹技术基座，与业务代码分离，实现如 Spring Boot 般的便捷使用体验。

> 项目代码、文档均开源免费可商用，遵循开源协议在项目中保留开源协议文件即可。

---

## 🎯 重构愿景

**RuoYi-Vue-Plus 重构聚焦提升维护性、扩展性与专业度，契合现代工程实践。**

- **蜕变技术基座**：同步更新代码，业务代码剥离，技术自主迭代，业务逻辑恒稳运行
- **对标 Spring Boot 源码**：规整模块与依赖，作为纯粹技术基座，与业务代码分离
- **便捷使用体验**：实现如 Spring Boot 般的便捷使用体验，简注解、轻配置

---

## ✨ 重构特性

| 特性 | 说明 |
|------|------|
| 🧱 **模块细分** | RuoYi-Vue-Plus 核心功能重塑为独立模块，各司其职，确保高内聚低耦合 |
| ♿️ **依赖精炼** | Maven 细控模块间依赖，剔除冗余，加速构建，稳固项目根基 |
| 🍃 **边界明晰** | 技术基座与业务代码泾渭分明，前者专注基础设施与服务，后者专攻逻辑实现 |
| 🚀 **升级无痕** | 技术基座平滑迭代，业务逻辑运行如常，规避升级之扰 |
| ♻️ **功能共享** | 承袭 RuoYi-Vue-Plus 后端精华，组件化封装，按需启用，灵活适配 |
| 🏗️ **前端无缝** | 直连 RuoYi-Vue-Plus 前端，无需额外配置，体验一贯 |
| 🎡 **独立开发** | 业务代码独立测试，技术栈变动无虞，保障业务连续性 |
| 🦺 **集成简化** | 业务变动仅需局部调整，集成测试与持续交付提速增效 |

---

## 🙋 适用群体

| 群体 | 说明 |
|------|------|
| 👽 **快速启动派** | RuoYi-Boot-Ultra 打造即拿即用的开发环境，简注解、轻配置，速构应用骨架，直击业务逻辑开发 |
| 🙈 **非侵入式用户** | 无需触碰 RuoYi-Vue-Plus 源码，RuoYi-Boot-Ultra 配置先行，功能定制无忧，专注业务不改码 |
| 🧐 **轻配置高手** | 微调配置项，驾驭大部分开发场景，免底层代码深潜，业务创新焦点不偏移 |

---

## 🏗️ 架构理念

### DHF（Domain-Helper-Facade）架构

DHF 是一套面向现代 Java 项目的架构治理方案，通过三个正交维度组织系统：

| 维度 | 职责 | 关键原则 |
|------|------|----------|
| **Domain（业务域）** | 封装核心业务能力 | 以业务为第一拆分单元（如订单、用户） |
| **Helper（能力助手）** | 封装通用技术能力 | 以 Spring Boot Starter 形式提供（如 Redis、幂等） |
| **Facade（协议门面）** | 处理客户端协议适配 | Controller 仅做 DTO 转换，无业务逻辑 |

### 核心优势

- **逻辑隔离**：业务逻辑与技术实现分离，模块边界清晰
- **契约协作**：标准化的接口设计，提升团队协作效率
- **平滑演进**：模块化设计便于未来向微服务架构演进
- **规范即代码**：自动化的架构检查，确保规范执行

---

## 📁 项目结构

```
RuoYi-Boot-Ultra/
├── ruoyi-dependencies/        # 依赖管理
├── ruoyi-boot/                # 核心助手层
│   ├── config/                # 配置类
│   ├── constant/              # 常量定义
│   ├── domain/                # 领域模型
│   ├── enums/                 # 枚举类
│   ├── exception/             # 异常体系
│   ├── service/               # 服务接口
│   └── utils/                 # 工具类
├── ruoyi-boot-starters/       # 能力助手（Starter形式）
│   ├── ruoyi-boot-starter-doc/       # 文档插件
│   ├── ruoyi-boot-starter-security/  # 安全插件
│   └── ... 其他插件
├── ruoyi-extensions/          # 扩展模块
├── ruoyi-modules/             # 业务域
│   ├── ruoyi-system/          # 系统管理
│   ├── ruoyi-gen/             # 代码生成
│   ├── ruoyi-job/             # 定时任务
│   └── ruoyi-demo/            # 演示模块
├── ruoyi-admin/               # 协议门面
└── pom.xml                    # 项目构建
```

---

## 🛠️ 技术栈

### 核心框架
- **Spring Boot 4.0.3** - 基础框架
- **MyBatis-Plus 3.5.16** - ORM框架
- **Sa-Token 1.45.0** - 权限认证框架
- **Redisson 4.3.0** - Redis客户端

### 数据库支持
- MySQL、Oracle、PostgreSQL、SQLServer
- 多数据源支持
- 雪花ID主键策略

### 工具库
- **Hutool 5.8.43** - Java工具库
- **Mapstruct-Plus 1.5.0** - 对象映射
- **Lombok 1.18.42** - 代码简化

### 其他组件
- **SpringDoc 3.0.2** - API文档
- **Fesod 2.0.1** - Excel处理
- **SnailJob 1.9.0** - 分布式任务调度
- **WarmFlow 1.8.4** - 工作流引擎
- **Lock4j 2.2.7** - 分布式锁
- **SMS4J 3.3.5** - 短信服务
- **JustAuth 1.16.7** - 第三方登录

---

## ⭐ 核心特性

### 1. **多租户支持**
- 完整的多租户架构设计
- 租户隔离的数据权限控制

### 2. **安全特性**
- Sa-Token JWT认证
- 数据加解密（AES、RSA、SM2、SM4）
- 接口传输加密
- XSS防护
- 数据脱敏

### 3. **分布式能力**
- Redis分布式缓存
- Redisson分布式锁
- 分布式限流
- 分布式任务调度

### 4. **代码生成器**
- 一键生成CRUD代码
- 支持多数据源
- 生成Vue3前端代码

### 5. **工作流**
- 基于WarmFlow
- 支持审批、转办、委派、会签等

### 6. **DHF架构优势**
- **架构清晰**：三层划分，职责明确
- **可维护性强**：模块化设计，易于扩展
- **演进顺畅**：便于未来拆分为微服务
- **开发效率高**：标准化的项目结构

---

## 📦 功能模块

| 模块 | 功能说明 |
|------|----------|
| **客户端管理** | 系统内对接的所有客户端管理，支持动态授权登录方式 |
| **用户管理** | 用户的管理配置，如新增用户、分配用户所属部门、角色、岗位等 |
| **部门管理** | 配置系统组织机构（公司、部门、小组），树结构展现支持数据权限 |
| **岗位管理** | 配置系统用户所属担任职务 |
| **菜单管理** | 配置系统菜单、操作权限、按钮权限标识等 |
| **角色管理** | 角色菜单权限分配、设置角色按机构进行数据范围权限划分 |
| **字典管理** | 对系统中经常使用的一些较为固定的数据进行维护 |
| **参数管理** | 对系统动态配置常用参数 |
| **通知公告** | 系统通知公告信息发布维护 |
| **操作日志** | 系统正常操作日志记录和查询，系统异常信息日志记录和查询 |
| **登录日志** | 系统登录日志记录查询包含登录异常 |
| **文件管理** | 系统文件展示、上传、下载、删除等管理 |
| **文件配置管理** | 系统文件上传、下载所需要的配置信息动态添加、修改、删除等管理 |
| **在线用户管理** | 已登录系统的在线用户信息监控与强制踢出操作 |
| **定时任务** | 运行报表、任务管理(添加、修改、删除)、日志管理、执行器管理等 |
| **代码生成** | 多数据源前后端代码的生成（java、html、xml、sql）支持CRUD下载 |
| **系统接口** | 根据业务代码自动生成相关的api接口文档 |
| **服务监控** | 监视集群系统CPU、内存、磁盘、堆栈、在线日志、Spring相关配置等 |
| **缓存监控** | 对系统的缓存信息查询，命令统计等 |
| **使用案例** | 系统的一些功能案例 |

---

## 🚀 快速开始

### 环境要求
- JDK 21+
- Maven 3.9+
- MySQL 8.0+
- Redis 6.0+

### 初始化步骤
1. **克隆项目**
   ```bash
   git clone https://github.com/itrys/RuoYi-Boot-Ultra.git
   ```

2. **配置数据库**
   - 创建数据库 `ry-boot-ultra`
   - 执行 `sql` 目录下的初始化脚本

3. **配置Redis**
   - 确保Redis服务运行在 `localhost:6379`

4. **编译项目**
   ```bash
   mvn clean install -DskipTests
   ```

5. **运行项目**
   ```bash
   cd ruoyi-admin
   mvn spring-boot:run
   ```

6. **访问系统**
   - 地址：`http://localhost:8080`
   - 用户名：`admin`
   - 密码：`123456`

---

## 📤 部署说明

### 打包部署
1. **构建项目**
   ```bash
   mvn clean package -DskipTests
   ```

2. **部署jar包**
   ```bash
   java -jar ruoyi-admin/target/ruoyi-admin.jar
   ```

### Docker部署
1. **构建镜像**
   ```bash
   docker build -t ruoyi-boot-ultra:1.0.0 .
   ```

2. **运行容器**
   ```bash
   docker run -d -p 8080:8080 --name ruoyi-boot-ultra ruoyi-boot-ultra:1.0.0
   ```

---

## 🤝 贡献指南

1. **Fork 项目**
2. **创建分支**
3. **提交代码**
4. **发起 Pull Request**

---

## 📚 参考文档

- [DHF架构规范](https://github.com/itrys/RuoYi-Boot-Ultra/wiki/DHF-Architecture)
- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [MyBatis-Plus文档](https://baomidou.com/)
- [Sa-Token文档](http://sa-token.dev33.cn/)

---

## 📄 许可证

本项目采用 MIT 许可证 - 详见 [LICENSE](LICENSE) 文件

---

## 🙏 致谢

- 感谢 [RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus) 提供的基础架构
- 感谢所有为项目做出贡献的开发者

---

**RuoYi-Boot-Ultra** - 基于 DHF 架构的企业级后台管理系统，为您的业务发展提供坚实的技术支撑！