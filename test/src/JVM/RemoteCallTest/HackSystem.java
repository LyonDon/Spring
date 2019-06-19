package JVM.RemoteCallTest;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * 为javaclass劫持java.lang.System提供支持
 * 除了out和err之外，其余的直接转发给System处理
 * @author Administrator
 *
 */
public class HackSystem {
	//System.in返回一个标准输入流 InputStream
	//System.out返回一个标准输出流 PrintStream
	//System.err返回一个标准错误输入流 InputStream
	public final static InputStream INPUT_STREAM=System.in;
	
	//将数据写入字节数组输出流
	private static ByteArrayOutputStream buffer=new ByteArrayOutputStream();
	
	public final static PrintStream OUT_PRINT_STREAM=new PrintStream(buffer);
	
	public final static PrintStream err=OUT_PRINT_STREAM;
	
	public static String getBufferString() {
		return buffer.toString();
	}
	
	public static void clearBuffer() {
		buffer.reset();
	}
	
	public static void setSecurityManager(final SecurityManager s){
		System.setSecurityManager(s);//设置安全管理员
	}
	
	public static SecurityManager getSecurityManager(){
		return System.getSecurityManager();//获取安全管理员
	}
	
	public static long currentTimeMillis() {
		return System.currentTimeMillis();
	}
	
	public static void arrayCopy(Object src,int srcPos,Object dest,int destPos,int length) {
		//将指定源数组中的数组从指定位置复制到目标数组的指定位置，这里的数组是Object类型
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	public static int identityHashCode(Object x) {
		//返回与默认方法hashCode（）返回的给定对象相同的哈希码，无论给定对象的类是否覆盖了hashCode（）
		return System.identityHashCode(x);
	}
}
