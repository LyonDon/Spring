package cn.moke.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Spring声明式事务管理方法2：基于AspectJ的XML的方式的配置
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	/**
	 * 转账案例
	 */
	public void demo3(){
		accountService.account("aaa", "bbb", 200d);
	}
}
