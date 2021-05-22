# blog_springboot
a blog by vue(frontend) and springboot(backend), this is the springboot part

## 命令
#### 打包后运行命令，需指定properties文件
`java -jar .\blog-1.0-SNAPSHOT.jar  --spring.config.location=resources/application.properties`
#### linux启动命令，指定生产配置文件，并输出日志文件到blog.log并后台运行
`nohup java -jar blog-1.0-SNAPSHOT.jar --spring.config.location=resources/application-prod.properties > blog.log 2&>1 &`
#### 查看日志
`tail -fn 300 blog.log`
#### curl请求本地应用
`curl localhost:8080/client/list/1/2`


# 约定
- dao：数据库访问的object
- dto：接收前端的object
- vo：返回给前端的view object
- pojo：其他无法区分的object

# 目录结构
- 按官网建议，按模块来分，而不是按功能来分，更方便开发，详见: `https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#using-boot`
