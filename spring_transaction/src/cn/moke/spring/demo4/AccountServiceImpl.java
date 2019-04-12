package cn.moke.spring.demo4;

import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例的业务层实现类
 * 
 * @author Administrator
 *
 */
/**
 * 注解的属性
 * @author Administrator
 *
 *
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
public class AccountServiceImpl implements AccountService {
	// 注入转账的DAO类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	/**
	 * in 输入账户 out 输出账户 money转账金额
	 */
	public void account(String out, String in,Double money) {
		accountDao.outMoney(out, money);
		int i=1/0;//设置异常
		accountDao.inMoney(in, money);
	}
}
