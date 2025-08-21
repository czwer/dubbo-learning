### 项目介绍：

用于学习dubbo相关源码，环境搭建时相关版本如下：

dubbo的版本为：3.3.5

JDK版本：17

maven版本：3.9.11

zookeeper版本：3.9.3

dubbo admin版本：0.6.0-release

### 一.ubuntu下JDK安装

sudo apt install openjdk-17-jdk

### 二.maven安装

（1）maven下载地址：https://dlcdn.apache.org/maven/maven-3/3.9.11/binaries/apache-maven-3.9.11-bin.zip

（2）ubuntu下maven多版本下使用：

sudo update-alternatives --install /usr/bin/mvn mvn /xxx/apache-maven-3.9.11/bin/mvn 3911

sudo update-alternatives --config mvn

### 三.zookeeper安装

（1）zookeeper下载地址：https://dlcdn.apache.org/zookeeper/zookeeper-3.9.3/apache-zookeeper-3.9.3-bin.tar.gz

（2）拷贝配置：cp apache-zookeeper-3.9.3-bin/conf/zoo_sample.cfg apache-zookeeper-3.9.3-bin/conf/zoo.cfg

（3）创建数据目录和日志目录：

    mkdir apache-zookeeper-3.9.3-bin/data
    mkdir apache-zookeeper-3.9.3-bin/logs
（4）修改apache-zookeeper-3.9.3-bin/conf/zoo.cfg：

    dataDir=/xxx/apache-zookeeper-3.9.3-bin/data
    dataLogDir=/xxx/apache-zookeeper-3.9.3-bin/logs
（5）启动：

（5.1）前台启动：apache-zookeeper-3.9.3-bin/bin/zkServer.sh start-foreground

（5.2）后台启动：apache-zookeeper-3.9.3-bin/bin/zkServer.sh start

### 四.dubbo admin安装

（1）官网：https://github.com/apache/dubbo-admin

（2）dubbo admin下载：git clone https://github.com/apache/dubbo-admin.git

（2.1）切到分支：0.6.0-release

（2.2）修改dubbo-admin/dubbo-admin-server/pom.xml中zookeeper版本：3.7.2

    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.7.2</version>
（2.3）maven进行构建： mvn clean install -Dmaven.test.skip=true

（2.4）启动： java -jar dubbo-admin-server-0.6.0.jar

（3）访问地址：http://localhost:38080/#/ ，root/root

### 五.dubbo

（1）官方文档：https://cn.dubbo.apache.org/zh-cn/

（2）源代码：https://github.com/apache/dubbo