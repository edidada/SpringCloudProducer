# SpringCloudProducer

Producer

[![Build Status](https://travis-ci.org/edidada/SpringCloudProducer.svg?branch=master)](https://travis-ci.org/edidada/SpringCloudProducer)


```shell
2021-04-05 14:31:54.056  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2047 ms
2021-04-05 14:31:55.091  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
2021-04-05 14:31:55.091  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2021-04-05 14:31:55.092  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'traceFilter' to: [/*]
2021-04-05 14:31:55.092  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2021-04-05 14:31:55.092  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2021-04-05 14:31:55.092  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2021-04-05 14:31:55.093  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestLoggingFilter' to: [/*]
2021-04-05 14:31:55.093  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
2021-04-05 14:31:55.093  INFO [spring-cloud-producer,,,] 32904 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2021-04-05 14:31:55.243  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@3c98781a: startup date [Mon Apr 05 14:31:55 CST 2021]; parent: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@7749bf93
2021-04-05 14:31:55.261  INFO [spring-cloud-producer,,,] 32904 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2021-04-05 14:31:57.352  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : jolokia: No access restrictor found, access to any MBean is allowed
2021-04-05 14:31:59.413  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@7749bf93: startup date [Mon Apr 05 14:31:52 CST 2021]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@dbf57b3
2021-04-05 14:31:59.639  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello]}" onto public java.lang.String com.neo.controller.HelloController.index(java.lang.String)
2021-04-05 14:31:59.640  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/test/user/{id}]}" onto public java.lang.String com.neo.controller.HelloController.getBlogInfo(int)
2021-04-05 14:31:59.641  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/getip]}" onto public java.lang.String com.neo.controller.utils.GetIpController.getIP(javax.servlet.http.HttpServletRequest)
2021-04-05 14:31:59.643  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2021-04-05 14:31:59.644  INFO [spring-cloud-producer,,,] 32904 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2021-04-05 14:31:59.807  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-05 14:31:59.807  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-05 14:31:59.905  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-05 14:32:01.198  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/auditevents || /auditevents.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.boot.actuate.endpoint.mvc.AuditEventsMvcEndpoint.findByPrincipalAndAfterAndType(java.lang.String,java.util.Date,java.lang.String)
2021-04-05 14:32:01.199  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
2021-04-05 14:32:01.199  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/service-registry/instance-status],methods=[POST]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.cloud.client.serviceregistry.endpoint.ServiceRegistryEndpoint.setStatus(java.lang.String)
2021-04-05 14:32:01.200  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/service-registry/instance-status],methods=[GET]}" onto public org.springframework.http.ResponseEntity org.springframework.cloud.client.serviceregistry.endpoint.ServiceRegistryEndpoint.getStatus()
2021-04-05 14:32:01.201  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.201  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.202  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.202  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
2021-04-05 14:32:01.205  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.get(java.lang.String)
2021-04-05 14:32:01.205  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[POST],consumes=[application/vnd.spring-boot.actuator.v1+json || application/json],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.set(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)
2021-04-05 14:32:01.205  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers || /loggers.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.206  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.329  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.329  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
2021-04-05 14:32:01.331  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
2021-04-05 14:32:01.331  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.332  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/archaius || /archaius.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.333  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/features || /features.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.333  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.334  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/jolokia/**]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.actuate.endpoint.mvc.JolokiaMvcEndpoint.handle(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.lang.Exception
2021-04-05 14:32:01.334  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
2021-04-05 14:32:01.335  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
2021-04-05 14:32:01.335  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.336  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
2021-04-05 14:32:01.336  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
2021-04-05 14:32:01.336  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
2021-04-05 14:32:01.337  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2021-04-05 14:32:01.337  INFO [spring-cloud-producer,,,] 32904 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(javax.servlet.http.HttpServletRequest,java.security.Principal)
2021-04-05 14:32:01.676  WARN [spring-cloud-producer,,,] 32904 --- [           main] c.n.c.sources.URLConfigurationSource
```

http接口列表
-
-


```shell
org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://localhost:9411/api/v1/spans": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
	at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:666) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:628) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.client.RestTemplate.exchange(RestTemplate.java:590) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cloud.sleuth.zipkin.RestTemplateSender.post(RestTemplateSender.java:73) ~[spring-cloud-sleuth-zipkin-1.2.0.RELEASE.jar:1.2.0.RELEASE]
	at org.springframework.cloud.sleuth.zipkin.RestTemplateSender.sendSpans(RestTemplateSender.java:46) ~[spring-cloud-sleuth-zipkin-1.2.0.RELEASE.jar:1.2.0.RELEASE]
	at zipkin.reporter.AsyncReporter$BoundedAsyncReporter.flush(AsyncReporter.java:228) [zipkin-reporter-0.6.12.jar:na]
	at zipkin.reporter.AsyncReporter$Builder.lambda$build$0(AsyncReporter.java:153) [zipkin-reporter-0.6.12.jar:na]
	at zipkin.reporter.AsyncReporter$Builder$$Lambda$1.run(Unknown Source) [zipkin-reporter-0.6.12.jar:na]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_231]
```

http://localhost:9411/api/v1/spans
这个是什么鬼？


纯洁的微笑

http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html
搞定
