package com.yztc.china_ucsp.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.entity.RolePage;
import com.yztc.china_ucsp.mapper.AdminMapper;
import com.yztc.china_ucsp.mapper.RoleMapper;

public class TestRoleMapper {
	@Test
	public void testFindByPage(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
		RoleMapper mapper = ctx.getBean("roleMapper",RoleMapper.class);
		
		RolePage rolePage = new RolePage();
		rolePage.setCurrentPage(1);;
		rolePage.setPageSize(3);
		
		List<Role> listRole = mapper.findByPage(rolePage);
		for(Role r:listRole){
			System.out.println(r.getId()+":"+r.getName());
			List<Privilege> listPrivilege = r.getListPrivilege();
			for(Privilege p:listPrivilege){
				System.out.println(p.getName());
			}
			System.out.println("------------------------------------------");
		}
	}
		@Test
		public void testSave(){
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
			RoleMapper mapper = ctx.getBean("roleMapper",RoleMapper.class);
			
			Role role = new Role();
			role.setName("新管理员角色");
			mapper.save(role);
			System.out.println(role.getId());	
			
			Integer[] privilegeIds = new Integer[]{1,2,3,4,5};			
			
			for(Integer privilegeId:privilegeIds){
				Map<String,Integer> map = new HashMap<String,Integer>();
				map.put("roleId", role.getId());
				map.put("privilegeId", privilegeId);
				mapper.saveRolePrivilege(map);
			}
			
			
		}
		@Test
		public void testUpdate(){
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
			RoleMapper mapper = ctx.getBean("roleMapper",RoleMapper.class);
			
			Role role = new Role(7,"新的管理员角色111");		
			Integer[] privilegeIds = new Integer[]{4,5,6,7};
			
			mapper.update(role);
			mapper.deleteRolePrivilege(role.getId());
			
			
			for(Integer privilegeId:privilegeIds){
				Map<String,Integer> map = new HashMap<String,Integer>();
				map.put("roleId", role.getId());
				map.put("privilegeId", privilegeId);
				mapper.saveRolePrivilege(map);
			}
		}
		
		@Test
		public void testrecoreds(){
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
			AdminMapper adminMapper = ctx.getBean("adminMapper",AdminMapper.class);
			
			
			AdminPage adminPage = new AdminPage();
			adminPage.setPrivilegeId(2);
			int re = adminMapper.findRecords(adminPage);
			System.out.println(re);
			
		}
		
	
	
}

			
			
			
			
		
	
	
	


