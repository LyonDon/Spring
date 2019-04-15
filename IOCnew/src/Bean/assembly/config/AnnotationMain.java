package Bean.assembly.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Bean.assembly.Role;

public class AnnotationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Role role=ctx.getBean(Role.class);
		RoleService roleService=ctx.getBean(RoleService.class);
		roleService.printRoleInfo(role);
		ctx.close();
	}
}
