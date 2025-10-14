（1）核心代码：
    org.springframework.boot.SpringApplication.run，304行，核心作用：SpringBoot启动入口
    org.springframework.boot.SpringApplication.refreshContext，456行
    org.springframework.context.support.AbstractApplicationContext.refresh，558行
    org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors，49行
    org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization，956行，核心作用：完成BeanFactory的初始化，实例化所有非延迟加载的单例 Bean，完成 Spring 容器的完全启动。
    org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons，1069行，实例化所有单例Bean。
    org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean，205行，核心作用：获取Bean的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean，469行，核心作用，创建Bean的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance，1191,核心作用：Bean实例化的核心方法
    org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor，91行，核心作用：构造函数注入的核心方法
    org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean，1418行，核心作用：属性注入的核心方法


（1）Spring中其他容易混淆的概念有哪些？
（1.1）org.springframework.beans.factory.ObjectFactory和org.springframework.beans.factory.FactoryBean什么关系？
ObjectFactory：延迟加载的轻量级工厂，而FactoryBean则用于封装复杂对象的创建逻辑。
（1.2）
Instantiation（实例化）：从Class到对象创建的过程
Initialization（初始化）：给Bean设置属性等各种配置的过程
（2）Spring中循环依赖是如何解决的？可以解决哪种循环依赖，解决不了哪种循环依赖？
（3）Spring Bean的创建过程可以简要概括为：获取Bean入口(getBean)->创建Bean(createBean[实例化前捷径(resolveBeforeInstantiation)->实例化（createBeanInstance）->属性填充(populateBean)->初始化(initializeBean)])。
