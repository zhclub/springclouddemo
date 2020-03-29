## 注意事项
1. 必须书写完整的注解参数，禁止使用@GetMapping
2. url前缀附带服务名，以防出现重复url
3. 实现类必须使用@RestController
```java
@RequestMapping(value = "/user/get", method = RequestMethod.GET)
String getUser(@RequestParam(name = "id") Long id);
```


## 客户端配置文件模板
```yaml
server:
  port: 8890

eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8888/eureka/

spring:
  application:
    name: user
```