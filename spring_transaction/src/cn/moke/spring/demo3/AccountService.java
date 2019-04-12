package cn.moke.spring.demo3;

/**
 * 转账案例的业务层接口
 * @author Administrator
 *
 */
public interface AccountService {
	/**
	 * 
	 * @param out	转出账户
	 * @param in	转入账户
	 * @param money	转账金额
	 */
	public void account(String out,String in,Double money);
}
