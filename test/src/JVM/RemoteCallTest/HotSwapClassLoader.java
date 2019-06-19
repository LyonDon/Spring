package JVM.RemoteCallTest;

/**
 * 为了多次载入执行类而加入的加载器
 * 把defineclass开放，只有外部显式调用的时候才会使用loadBytes方法
 * 虚拟机调用时，仍使用双亲委派方法使用loadClass进行类加载
 * 
 * @author Administrator
 *
 */
public class HotSwapClassLoader extends ClassLoader{
	public HotSwapClassLoader() {
		super(HotSwapClassLoader.class.getClassLoader());//getClassLoader()返回一个类加载器
	}
	
	/**
	 * 将字节数组转换为别类的实例
	 * @param classByte构成类数据的字节
	 * @return	从指定的类数据创建的类对象
	 */
	public Class loadByte(byte[] classByte){
		/**
		 * null "name"预期的binary name类
		 * 0表示起始位置
		 * classByte.length表示偏移量
		 */
		return defineClass(null, classByte, 0,classByte.length);
	}
}
