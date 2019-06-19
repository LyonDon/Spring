package JVM.RemoteCallTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * javaclass执行工具
 * @author Administrator
 *
 */
public class JavaClassExecutor {
	/**
	 * 执行外部传过来的一个代表java类的byte数组
	 * 将输入类中的代表java.lang.System的CONSTANT_UTF8_INFO改为劫持后的HackSystem类
	 * 执行该类的static main(String args[])方法，输出结果为该类向System.out/err输出的信息
	 * 
	 * @param classByte 代表一个java类的byte数组
	 * @return 执行结果
	 */
	public static String execute(byte[] classByte){
		HackSystem.clearBuffer();
		ClassModifier cModifier=new ClassModifier(classByte);
		byte[] modifBytes=cModifier.modifyUTF8Constant("java/lang/System", "test/src/JVM/RemoteCallTest/HackSystem");
		HotSwapClassLoader loader=new HotSwapClassLoader();
		Class clazz=loader.loadByte(modifBytes);
		try {
			Method method=clazz.getMethod("main", new Class[]{String[].class});
			method.invoke(null, new String[]{});
		} catch (Throwable e){
			e.printStackTrace(HackSystem.OUT_PRINT_STREAM);
		}
		return HackSystem.getBufferString();
	}
}
