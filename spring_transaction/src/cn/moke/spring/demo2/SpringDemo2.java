package cn.moke.spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring声明式事务管理的方式1测试类
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
	
//	@Resource(name="accountService")
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.account("aaa", "bbb", 200d);
	}
}
