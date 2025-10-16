2025-10-16 21:52:46.025 [main-SendThread(127.0.0.1:2181)] INFO  org.apache.zookeeper.ClientCnxn.logStartConnect:1177 - Opening socket connection to server 127.0.0.1/127.0.0.1:2181.
2025-10-16 21:52:46.026 [main-SendThread(127.0.0.1:2181)] INFO  org.apache.zookeeper.ClientCnxn.logStartConnect:1179 - SASL config status: Will not attempt to authenticate using SASL (unknown error)
2025-10-16 21:52:46.026 [main-SendThread(127.0.0.1:2181)] WARN  org.apache.zookeeper.ClientCnxn.run:1300 - Session 0x0 for server 127.0.0.1/127.0.0.1:2181, Closing socket connection. Attempting reconnect except it is a SessionExpiredException.
java.net.ConnectException: Connection refused: getsockopt
    at java.base/sun.nio.ch.Net.pollConnect(Native Method)
    at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:672)
    at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:946)
    at org.apache.zookeeper.ClientCnxnSocketNIO.doTransport(ClientCnxnSocketNIO.java:344)
    at org.apache.zookeeper.ClientCnxn$SendThread.run(ClientCnxn.java:1289)
2025-10-16 21:52:46.923 [main] ERROR org.apache.dubbo.remoting.zookeeper.curator5.Curator5ZookeeperClient.error:126 -  [DUBBO] Failed to connect with zookeeper, dubbo version: 3.3.5-add-more-logging, current host: 192.168.1.4, error code: 5-1. This may be caused by Zookeeper server offline, go to https://dubbo.apache.org/faq/5/1 to find instructions.
java.lang.IllegalStateException: zookeeper not connected, the address is: zookeeper://127.0.0.1:2181/org.apache.dubbo.config.ConfigCenterConfig?check=true&config-file=dubbo.properties&group=dubbo&highest-priority=false&namespace=dubbo&timeout=30000
    at org.apache.dubbo.remoting.zookeeper.curator5.Curator5ZookeeperClient.<init>(Curator5ZookeeperClient.java:101)
    at org.apache.dubbo.remoting.zookeeper.curator5.ZookeeperClientManager.connect(ZookeeperClientManager.java:89)
    at org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.<init>(ZookeeperDynamicConfiguration.java:74)
    at org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(ZookeeperDynamicConfigurationFactory.java:38)
    at org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.lambda$getDynamicConfiguration$0(AbstractDynamicConfigurationFactory.java:39)
    at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1708)
    at org.apache.dubbo.common.utils.ConcurrentHashMapUtils.computeIfAbsent(ConcurrentHashMapUtils.java:56)
    at org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(AbstractDynamicConfigurationFactory.java:39)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.getDynamicConfiguration(DefaultApplicationDeployer.java:992)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.prepareEnvironment(DefaultApplicationDeployer.java:904)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.startConfigCenter(DefaultApplicationDeployer.java:316)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.initialize(DefaultApplicationDeployer.java:228)
    at org.apache.dubbo.config.deploy.DefaultModuleDeployer.prepare(DefaultModuleDeployer.java:684)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.initDubboConfigBeans(DubboConfigApplicationListener.java:89)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.init(DubboConfigApplicationListener.java:70)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.onApplicationEvent(DubboConfigApplicationListener.java:60)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.onApplicationEvent(DubboConfigApplicationListener.java:38)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:186)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:178)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:156)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138)
    at org.springframework.context.support.AbstractApplicationContext.registerListeners(AbstractApplicationContext.java:946)
    at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:607)
    at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:781)
    at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:461)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1392)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1381)
    at com.example.learning.DubboProviderApplication.main(DubboProviderApplication.java:16)
2025-10-16 21:52:46.923 [main] WARN  org.springframework.context.support.AbstractApplicationContext.refresh:620 - Exception encountered during context initialization - cancelling refresh attempt: java.lang.IllegalStateException: java.lang.IllegalStateException: zookeeper not connected, the address is: zookeeper://127.0.0.1:2181/org.apache.dubbo.config.ConfigCenterConfig?check=true&config-file=dubbo.properties&group=dubbo&highest-priority=false&namespace=dubbo&timeout=30000
2025-10-16 21:52:46.923 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingletons:1435 - [SPRING] 自定义日志---销毁所有已创建的单例Bean
2025-10-16 21:52:46.923 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton:1443 - [SPRING] 自定义日志---销毁单例Bean：awaitingNonWebApplicationListener
2025-10-16 21:52:46.923 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton:1443 - [SPRING] 自定义日志---销毁单例Bean：org.apache.dubbo.config.spring.context.DubboConfigApplicationListener
2025-10-16 21:52:46.923 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton:1443 - [SPRING] 自定义日志---销毁单例Bean：org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
2025-10-16 21:52:46.923 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton:1443 - [SPRING] 自定义日志---销毁单例Bean：org.springframework.context.annotation.internalConfigurationAnnotationProcessor
2025-10-16 21:52:46.928 [main] INFO  org.springframework.boot.context.event.EventPublishingRunListener.failed:138 - [SPRING_BOOT] 自定义日志---【发布事件广播】：ApplicationFailedEvent
2025-10-16 21:52:46.928 [main] INFO  org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener:185 - [SPRING] 自定义日志---【发布事件广播】：ApplicationEvent，timestamp：1760622766927,监听者：org.springframework.boot.env.EnvironmentPostProcessorApplicationListener
2025-10-16 21:52:46.928 [main] INFO  org.springframework.boot.env.EnvironmentPostProcessorApplicationListener.onApplicationEvent:125 - [SPRING_BOOT] 自定义日志---【监听事件】：ApplicationEvent(ApplicationFailedEvent)，timestamp：1760622766927
2025-10-16 21:52:46.929 [main] INFO  org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener:185 - [SPRING] 自定义日志---【发布事件广播】：ApplicationEvent，timestamp：1760622766927,监听者：org.springframework.boot.context.logging.LoggingApplicationListener
2025-10-16 21:52:46.929 [main] INFO  org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent:236 - [SPRING_BOOT] 自定义日志---【监听事件】：ApplicationEvent(ApplicationFailedEvent)，timestamp：1760622766927
2025-10-16 21:52:46.929 [main] INFO  org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener:185 - [SPRING] 自定义日志---【发布事件广播】：ApplicationEvent，timestamp：1760622766927,监听者：org.springframework.boot.autoconfigure.BackgroundPreinitializer
2025-10-16 21:52:46.929 [main] INFO  org.springframework.boot.autoconfigure.BackgroundPreinitializer.onApplicationEvent:92 - [SPRING_BOOT] 自定义日志---【监听事件】：SpringApplicationEvent(ApplicationReadyEvent or ApplicationFailedEvent)，timestamp：1760622766927
2025-10-16 21:52:46.929 [main] INFO  org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener:185 - [SPRING] 自定义日志---【发布事件广播】：ApplicationEvent，timestamp：1760622766927,监听者：org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener$ConditionEvaluationReportListener
2025-10-16 21:52:46.929 [main] INFO  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener$ConditionEvaluationReportListener.onApplicationEvent:145 - [SPRING_BOOT] 自定义日志---【监听事件】：ApplicationEvent(ApplicationFailedEvent)，timestamp：1760622766927
2025-10-16 21:52:46.934 [main] INFO  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLogger.logMessage:82 -

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-10-16 21:52:46.958 [main] INFO  org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.<init>:76 - [SPRING_BOOT] 自定义日志---执行自身构造方法，该类作用：在应用启动过程中，记录和报告所有自动配置类（@Configuration 类）的条件评估结果，即为什么某些自动配置类被应用或为什么被跳过
2025-10-16 21:52:46.958 [main] INFO  org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.get:193 - [SPRING_BOOT] 自定义日志---【注册单例Bean】：autoConfigurationReport
2025-10-16 21:52:46.958 [main] INFO  org.springframework.beans.factory.support.DefaultListableBeanFactory.registerSingleton:1427 - [SPRING] 自定义日志---【注册单例Bean】,beanName：autoConfigurationReport,beanClass：org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport
2025-10-16 21:52:46.958 [main] INFO  org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.registerSingleton:133 - [SPRING] 自定义日志【关键流程-注册单例bean实例】---beanName：autoConfigurationReport
2025-10-16 21:52:46.958 [main] INFO  org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.addSingleton:152 - [SPRING] 自定义日志【关键流程-注册单例bean实例】---beanName：autoConfigurationReport
2025-10-16 21:52:46.969 [main] ERROR org.springframework.boot.SpringApplication.reportFailure:887 - Application run failed
java.lang.IllegalStateException: java.lang.IllegalStateException: zookeeper not connected, the address is: zookeeper://127.0.0.1:2181/org.apache.dubbo.config.ConfigCenterConfig?check=true&config-file=dubbo.properties&group=dubbo&highest-priority=false&namespace=dubbo&timeout=30000
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.prepareEnvironment(DefaultApplicationDeployer.java:916)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.startConfigCenter(DefaultApplicationDeployer.java:316)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.initialize(DefaultApplicationDeployer.java:228)
    at org.apache.dubbo.config.deploy.DefaultModuleDeployer.prepare(DefaultModuleDeployer.java:684)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.initDubboConfigBeans(DubboConfigApplicationListener.java:89)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.init(DubboConfigApplicationListener.java:70)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.onApplicationEvent(DubboConfigApplicationListener.java:60)
    at org.apache.dubbo.config.spring.context.DubboConfigApplicationListener.onApplicationEvent(DubboConfigApplicationListener.java:38)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:186)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:178)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:156)
    at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138)
    at org.springframework.context.support.AbstractApplicationContext.registerListeners(AbstractApplicationContext.java:946)
    at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:607)
    at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:781)
    at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:461)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1392)
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1381)
    at com.example.learning.DubboProviderApplication.main(DubboProviderApplication.java:16)
Caused by: java.lang.IllegalStateException: zookeeper not connected, the address is: zookeeper://127.0.0.1:2181/org.apache.dubbo.config.ConfigCenterConfig?check=true&config-file=dubbo.properties&group=dubbo&highest-priority=false&namespace=dubbo&timeout=30000
    at org.apache.dubbo.remoting.zookeeper.curator5.Curator5ZookeeperClient.<init>(Curator5ZookeeperClient.java:116)
    at org.apache.dubbo.remoting.zookeeper.curator5.ZookeeperClientManager.connect(ZookeeperClientManager.java:89)
    at org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.<init>(ZookeeperDynamicConfiguration.java:74)
    at org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(ZookeeperDynamicConfigurationFactory.java:38)
    at org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.lambda$getDynamicConfiguration$0(AbstractDynamicConfigurationFactory.java:39)
    at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1708)
    at org.apache.dubbo.common.utils.ConcurrentHashMapUtils.computeIfAbsent(ConcurrentHashMapUtils.java:56)
    at org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(AbstractDynamicConfigurationFactory.java:39)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.getDynamicConfiguration(DefaultApplicationDeployer.java:992)
    at org.apache.dubbo.config.deploy.DefaultApplicationDeployer.prepareEnvironment(DefaultApplicationDeployer.java:904)
... 19 common frames omitted
Caused by: java.lang.IllegalStateException: zookeeper not connected, the address is: zookeeper://127.0.0.1:2181/org.apache.dubbo.config.ConfigCenterConfig?check=true&config-file=dubbo.properties&group=dubbo&highest-priority=false&namespace=dubbo&timeout=30000
    at org.apache.dubbo.remoting.zookeeper.curator5.Curator5ZookeeperClient.<init>(Curator5ZookeeperClient.java:101)
... 28 common frames omitted
2025-10-16 21:52:46.971 [DubboShutdownHook] INFO  org.apache.dubbo.config.DubboShutdownHook.info:71 -  [DUBBO] Run shutdown hook now., dubbo version: 3.3.5-add-more-logging, current host: 192.168.1.4
Disconnected from the target VM, address: '127.0.0.1:64214', transport: 'socket'

Process finished with exit code 1