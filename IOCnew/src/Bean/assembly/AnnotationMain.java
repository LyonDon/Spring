package Bean.assembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Role role=ctx.getBean(Role.class);
		System.out.println(role.getNote());
		ctx.close();
	}
}
