package JVM;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
	public static void main(String[] args) throws Exception{
		ClassLoader myloader=new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String filename=name.substring(name.indexOf(".")+1)+".class";
					InputStream is=getClass().getResourceAsStream(filename);
					if (is==null) {
						return super.loadClass(name);	
					}
					byte[] b=new byte[is.available()];
					is.read(b);
					return defineClass(name,b,0,b.length);
				} catch (ClassFormatError e) {
					throw new ClassNotFoundException(name);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		Object obj=myloader.loadClass("JVM.ClassLoaderTest");
		System.out.println(obj.getClass());
		System.out.println(obj instanceof ClassLoaderTest);
		//第二行返回false的原因在于：虽然处于同一个class文件下，但是一个是使用系统类加载器加载的类，一个是自定义类加载器加载的类
		//因此，instanceof返回的结果为false
	}
}
