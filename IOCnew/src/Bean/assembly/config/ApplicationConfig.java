package Bean.assembly.config;

import org.springframework.context.annotation.ComponentScan;

import Bean.assembly.Role;

@ComponentScan(basePackageClasses={Role.class,RoleAssemblyImpl.class})
public class ApplicationConfig {
	
}
