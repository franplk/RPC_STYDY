#Description
RPC FrameWork Study (Java RMI , Dubbo etc.)

#Modules
-javaRMI
	--rmi-api
	--rmi-client
	--rmi-server
-dubbo
	--dubbo-api
	--dubbo-client
	--dubbo-server
	
##Multicast注册中心

###Multicast注册中心特性
1.不需要启动任何中心节点，只要广播地址一样，就可以互相发现
2.组播受网络结构限制，只适合小规模应用或开发阶段使用。
3.组播地址段: 224.0.0.0 - 239.255.255.255

###Multicast过程
1.提供方启动时广播自己的地址，供消费方订阅。
2.消费方启动时广播订阅请求，根据配置的广播地址进行服务订阅。
3.提供方收到订阅请求时，单播自己的地址给订阅者，如果设置了unicast=false，则广播给订阅者。
4.消费方收到提供方地址时，连接该地址进行RPC调用。

###注意
1.为了减少广播量，Dubbo缺省使用单播发送提供者地址信息给消费者，
2.如果一个机器上同时启了多个消费者进程，消费者需声明unicast=false，否则只会有一个消费者能收到消息
3.可以这样加入参数
<dubbo:registry address="multicast://ip:port?unicast=false"/>
4.也可以这样
<dubbo:registry protocol="multicast" address="ip:port">
    <dubbo:parameter key="unicast" value="false"/>
</dubbo:registry>
