# IOC

控制反转是一种通过描述（在java中是通过注解或者XML文件）并通过第三方创建或获取对象的方式

**在Spring中实现控制反转的是IOC容器
实现方式是通过依赖注入**

## IOC容器

可以容纳所开发的各种bean，并且可以从中获取各种发布在Spring IOC容器中的bean

*	BeanFactory
	Spring IOC容器的最底层接口
    
*	ApplicationContext
	BeanFactory的gaojishixian

###	IOC容器的初始化和依赖注入

Bean的定义和初始化在IOC容器中是两个步骤，首先完成定义，然后才进行初始化和依赖注入

**Bean的定义：**

*	Resource定位

*	BeanDefinition的载入

*	BeanDefinition的注册

**依赖注入的两种方式：**

*	构造器注入

*	设值注入

	*	接口注入
	*	使用setter注入

**Bean装配的两种方式**

*	使用XML配置文件进行装配

*	使用注解
	优点：更加简单，省去了XML繁琐的配置流程，同时省去了引入大量XML文件的烦恼
    缺点：注解的使用比较分散，不利于统一维护和管理
    所以使用注解为主，XML为辅的方式

    *	@Component注解代表SpringIOC将此类扫描生成实例