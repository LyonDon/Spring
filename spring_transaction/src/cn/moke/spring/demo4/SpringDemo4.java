package cn.moke.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4")
public class SpringDemo4 {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo4(){
		accountService.account("aaa", "bbb", 200d);
	}
}
