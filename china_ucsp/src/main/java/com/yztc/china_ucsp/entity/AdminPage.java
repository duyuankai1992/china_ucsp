package com.yztc.china_ucsp.entity;

public class AdminPage extends page {
	private Integer privilegeId;/*权限号*/
	private String roleName;   /*角色名*/
	
	public Integer getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	@Override
	public String toString() {
		return "AdminPage [privilegeId=" + privilegeId + ", roleName=" + roleName + ", getCurrentPage()="
				+ getCurrentPage() + ", getPageSize()=" + getPageSize() + ", getRecords()=" + getRecords()
				+ ", getMaxPage()=" + getMaxPage() + ", getNextPage()=" + getNextPage() + ", getPrePage()="
				+ getPrePage() + ", getBegin()=" + getBegin() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
