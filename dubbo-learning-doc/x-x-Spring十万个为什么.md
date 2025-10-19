（1）核心接口
    
    org.springframework.beans.factory.config.BeanDefinition
    org.springframework.beans.factory.BeanFactory
    ---重要实现：org.springframework.beans.factory.support.DefaultListableBeanFactory
    org.springframework.context.ApplicationContext
    org.springframework.beans.factory.config.BeanPostProcessor
    ---子接口：org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor

（2）核心代码：
    
    org.springframework.boot.SpringApplication.run，304行，核心作用：SpringBoot启动入口
    org.springframework.boot.SpringApplication.refreshContext，456行
    org.springframework.context.support.AbstractApplicationContext.refresh，558行
    org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors，49行
    org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry，249行，它负责处理配置类（例如用@Configuration注解的类），并从中解析出更多的Bean定义注册到容器中。
    org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization，956行，核心作用：完成BeanFactory的初始化，实例化所有非延迟加载的单例 Bean，完成 Spring 容器的完全启动。
    org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons，1069行，实例化所有单例Bean。
    org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean，205行，核心作用：获取Bean的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean，469行，核心作用，创建Bean的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance，1191,核心作用：Bean实例化核心方法
    org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor，91行，核心作用：构造函数注入的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyMergedBeanDefinitionPostProcessors,1116行，核心作用：应用org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor.postProcessMergedBeanDefinition
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean，1418行，核心作用：Setter注入和字段注入，方法注入的核心方法
    org.springframework.beans.factory.annotation.InjectionMetadata.InjectedElement.inject，265行，核心作用：@Resource字段依赖注入反射调用
    org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredFieldElement.inject，719行，核心作用：@Autowired字段依赖注入反射调用
    org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredMethodElement.inject，799行，核心作用：@Autowired方法依赖注入反射调用
    org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator.postProcessAfterInitialization，313行，核心作用：创建代理对像入口（通过AnnotationAwareAspectJAutoProxyCreator调用父类AbstractAutoProxyCreator.postProcessAfterInitialization）
    org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator.createProxy，461行，核心作用：创建代理对像

（3）重要的BeanPostProcessor：

    org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator：创建代理对像，间接调用父类：AbstractAutoProxyCreator.postProcessAfterInitialization

（4）重要的MergedBeanDefinitionPostProcessor：
    
    org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor.postProcessMergedBeanDefinition：检查是否使用@DubboReference，@Reference
    org.springframework.context.annotation.CommonAnnotationBeanPostProcessor.postProcessMergedBeanDefinition：检查是否有 @Resource注解信息，如果有，就创建一个InjectionMetadata对象
    org.springframework.context.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessMergedBeanDefinition：检查是否有 @PostConstruct, @PreDestroy注解信息，由CommonAnnotationBeanPostProcessor间接调用
    org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessMergedBeanDefinition：检查是否有 @Autowired，如果有，就创建一个InjectionMetadata对象

（5）Spring套路：
    
    MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(className);
    metadata = metadataReader.getAnnotationMetadata();
    



（1）Spring中其他容易混淆的概念有哪些？
（1.1）org.springframework.beans.factory.ObjectFactory和org.springframework.beans.factory.FactoryBean什么关系？
ObjectFactory：延迟加载的轻量级工厂，而FactoryBean则用于封装复杂对象的创建逻辑。
（1.2）
Instantiation（实例化）：从Class到对象创建的过程
Initialization（初始化）：给Bean设置属性等各种配置的过程
（2）Spring中循环依赖是如何解决的？可以解决哪种循环依赖，解决不了哪种循环依赖？
（3）Spring Bean的创建过程可以简要概括为：获取Bean入口(getBean)->创建Bean(createBean[实例化前捷径(resolveBeforeInstantiation)->实例化（createBeanInstance）->属性填充(populateBean)->初始化(initializeBean)])。
（4）不要搞混：
org.apache.dubbo.config.spring.beans.factory.annotation.AbstractAnnotationBeanPostProcessor 
org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor