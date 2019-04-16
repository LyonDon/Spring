[1.事务](#1)
[1.1事务的特性](#1.1)
[1.2Spring事务管理接口](#1.1)

[2.Spring事务管理](#2)


## <h1 id="1">事务

表示逻辑上的一组操作，要么全部成功，要么全部失败

### <h1 id="1.1">事务的特性

*	原子性：事务是一个不可分割的单位
*	一致性：前后的数据完整性要保持一致
*	隔离性：多个用户并发访问时，一个事务不能被其他用户的事务干扰
*	持久性：一个事务一旦被提交，其对数据库的改变时永久的

***

## <h2 id="1.2">Spring事务管理接口

*	PlatformTransactionManager：事务管理器
*	TransactionDefinition：事务定义信息
*	TransactionSatus：事务运行状态

>三者之间存在联系，TransactionDefinition定义事务信息之后，
>由PlatformTransactionManager进行管理，并将其运行状态保存在TransactionStaus中

### PlatformTransactionManager
Spring会根据不同的持久层框架选择不同的PlatformTransactionManager实现类

### TransactionDefinition

*	成员变量中的ISOLATION……定义了隔离级别（用于不同程度的防止脏读，幻读，不可重复读)

	+	脏读：读取了修改但是未提交的数据，回滚时可能失效
	+	幻读：读取了插入之前的数据
	+	不可重复读：同一数据，多次读取内容不一致

*	成员变量中的PROPAGATION……定义了传播行为（解决事务层之间相互调用的问题）

	*	PROPAGATION_REQUIED：支持当前事务，不存在就创建一个
	*	PROPAGATION_REQUIES_NEW:有事务存在则挂起，创建一个新事务（两个操作不在一个事务里面）
	*	PROPAGATION_NESTED：当前事务存在，则嵌套事务执行（可以选择回到事务保存点，或者回到初始状态）

*	TIME定义了超时信息

### TranScationStatus(获得事务相应的状态)

***

## <h1 id='2'>Spring事务管理

**无论是编程式事务管理还是声明式事务管理，都需要配置事务管理器，因为这才是真正的事务管理者**

### 编程式事务管理（需要手动修改代码，不推荐）

*	通过配置事务管理模板，将事务中的不同语句归入一个事务中执行，要么一块成功，要么一块失败

### 声明式事务管理（通过AOP实现，代码侵入小，推荐使用）

*	基于TransactionProxyFactoryBean的方式（很少使用）

	*	需要为每个进行事务管理的类配置一个TransactionProxyFactoryBean进行增强

*	基于AspectJ的XML方式：AspectJ是一个AOP的第三方开源框架（经常使用）
	*	相对注解麻烦一点，但是一旦配置好，就不需要在代码中做任何更改

*	基于注解的方式（经常使用）
	*	配置简单，但是需要在**业务层**类上加上@transactional的注解