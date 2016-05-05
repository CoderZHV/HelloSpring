# HelloSpring 基于配置
 
 1.Ioc容器
 
	* FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML文件的完整路径
	* ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
	* WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
 2.配置bean
 	
	******************************************************************************************
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
    	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    	xsi:schemaLocation="http://www.springframework.org/schema/beans
    	http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   	<!-- A simple bean definition -->
   	<bean id="..." class="...">
       <!-- collaborators and configuration for this bean go here -->
   	</bean>

   	<!-- A bean definition with lazy init set on -->
   	<bean id="..." class="..." lazy-init="true">
       <!-- collaborators and configuration for this bean go here -->
   	</bean>

   	<!-- A bean definition with initialization method -->
   	<bean id="..." class="..." init-method="...">
       <!-- collaborators and configuration for this bean go here -->
   	</bean>

   	<!-- A bean definition with destruction method -->
   	<bean id="..." class="..." destroy-method="...">
       <!-- collaborators and configuration for this bean go here -->
   	</bean>

   	<!-- more bean definitions go here -->

	</beans>
	******************************************************************************************

 2. 作用域 scope
  
		<bean id="..." class="..." scope="singleton">
    		<!-- collaborators and configuration for this bean go here -->
		</bean>
		
		> singleton:该作用域将 bean 的定义的限制在每一个 Spring IoC 容器中的一个单一实例(默认)。
		> prototype:该作用域将单一 bean 的定义限制在任意数量的对象实例。
		> request:该作用域将 bean 的定义限制为 HTTP 请求。只在 web-aware Spring ApplicationContext 的上下文中有效.
		> session:该作用域将 bean 的定义限制为 HTTP 会话。 只在web-aware Spring ApplicationContext的上下文中有效。
		> global-session:该作用域将 bean 的定义限制为全局 HTTP 会话。只在 web-aware Spring ApplicationContext 的上下文中有效。
		
 
 		
 		
	