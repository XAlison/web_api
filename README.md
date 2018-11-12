#### 简介
web_api项目是一个基于Spring Boot & 通用mapper，用于快速构建中小型API、RESTful API项目。项目实现基础的增删改查基础的API，并运行提供服务

####特征&提供
- 最佳实践的项目结构、配置文件、精简的POM
- 使用Druid Spring Boot Starter 集成Druid数据库连接池与监控
- 使用FastJsonHttpMessageConverter，提高JSON序列化速度
- 集成MyBatis、通用Mapper插件、PageHelper分页插件，实现单表业务零SQL
- 集成log4j2日志框架(据可靠测试数据该日志框架是java目前性能最优的)
 
#### 快速开始
1. 克隆项目 git clone https://gitee.com/diaodiaofly/web_api.git
2. 加载maven依赖所需jar包
3. 新建测试数据库，执行db目录下的sql，修改配置文件中的jdbc连接信息(改为自己的库名、账户、密码)
3. 右键运行Application.java中的main方法
 
#### 开发建议
- 表名，建议使用小写，多个单词使用下划线拼接
- Model内成员变量建议与表字段数量对应，如需扩展成员变量（比如连表查询）建议创建DTO，否则需在扩展的成员变量上加```@Transient```注解，详情见[通用Mapper插件文档说明](https://mapperhelper.github.io/docs/2.use/)
- 开发规范建议遵循阿里巴巴Java开发手册（[最新版下载](https://github.com/alibaba/p3c))
 
#### 技术选型&文档
- Spring Boot1.5.17
- MyBatis（[查看官方中文文档](http://www.mybatis.org/mybatis-3/zh/index.html)）
- MyBatisb通用Mapper插件（[查看官方中文文档](https://mapperhelper.github.io/docs/)）
- MyBatis PageHelper分页插件（[查看官方中文文档](https://pagehelper.github.io/)）
- Druid Spring Boot Starter（[查看官方中文文档](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter/)）
- Fastjson（[查看官方中文文档](https://github.com/Alibaba/fastjson/wiki/%E9%A6%96%E9%A1%B5)）
- 其他略...

## License
无，纯粹开源分享，感谢大家start，共勉之