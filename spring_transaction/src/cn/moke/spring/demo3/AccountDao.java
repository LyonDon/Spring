package cn.moke.spring.demo3;
/**
 * 转账案例持久层接口
 * @author Administrator
 *
 */
public interface AccountDao {
	/**
	 * 
	 * @param out	转出账户
	 * @param money	转出金额
	 */
	public void outMoney(String out,Double money);
	
	/**
	 * 
	 * @param in	转入账户
	 * @param money	转入金额
	 */
	public void inMoney(String in,Double money);
}
