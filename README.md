# Blog

## 技术栈
SpringBoot + Mybatis + thymeleaf

## 更改需要的配置
修改配置文件中的mysql地址和端口，文章使用markdown，如需使用图片直接上传，需要配置七牛云对象存储
由于本网站很多功能都与markdown相关，blog和摄影作品的上传都是用了七牛云对象存储服务，如果需要使用图片上传服务的话，需要进行服务的配置,该配置在QiniuCloudService.java中
```
ACCESS_KEY：存取键
SECRET_KEY：秘钥
BUCKET：仓库名
QINIU_UPLOAD_SITE：外网访问地址
也可以不使用七牛云，可以自己上传之后再贴进来
```

## 导入数据库文件
```
file/blog.sql
```

## 使用maven进行打包
```
mvn clean package
在target包下找到生成的jar包：
```

## 开发环境 dev
nohup java -jar blog-1.0.0.RELEASE.jar --spring.profiles.active=dev

## 生产环境 prod
nohup java -jar blog-1.0.0.RELEASE.jar --spring.profiles.active=prod

## 部署成功
```
访问首页 http://localhost:8080/admin 
默认账号密码：admin 123456
```
## Quick Start
