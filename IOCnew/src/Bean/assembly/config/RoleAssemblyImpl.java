package Bean.assembly.config;

import org.springframework.stereotype.Component;

import Bean.assembly.Role;

@Component("roleAssemblyImpl")
public class RoleAssemblyImpl implements RoleService{

	@Override
	public void printRoleInfo(Role role) {
		System.out.println("id:"+role.getId());
		System.out.println("note:"+role.getNote());
		System.out.println("name:"+role.getRoleName());
	}

}
