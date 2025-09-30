（1）Spring中其他容易混淆的概念有哪些？
（1.1）org.springframework.beans.factory.ObjectFactory和org.springframework.beans.factory.FactoryBean什么关系？
ObjectFactory：延迟加载的轻量级工厂，而FactoryBean则用于封装复杂对象的创建逻辑。
（1.2）
Instantiation（实例化）：从Class到对象创建的过程
Initialization（初始化）：给Bean设置属性等各种配置的过程
（2）Spring中循环依赖是如何解决的？可以解决哪种循环依赖，解决不了哪种循环依赖？
（3）Spring Bean的创建过程可以简要概括为：获取Bean入口(getBean)->创建Bean(createBean[实例化前捷径(resolveBeforeInstantiation)->实例化（createBeanInstance）->属性填充(populateBean)->初始化(initializeBean)])。
