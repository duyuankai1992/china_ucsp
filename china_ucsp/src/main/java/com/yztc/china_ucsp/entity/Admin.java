package com.yztc.china_ucsp.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
/**
 * 
 * 管理员实体类
 * 
 */
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id; /*编号*/
    private String admin_code; /*账号*/
    private String password;
    private String name;
    private String telephone;
    private String email;
    private Date enrolldate;
    
    private List<Role> listRole;
    
    
    
    public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}

	public Admin(Integer id, String admin_code, String password, String name, String telephone, String email,
			Date enrolldate) {
		super();
		this.id = id;
		this.admin_code = admin_code;
		this.password = password;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.enrolldate = enrolldate;
	}

	public Admin(){}
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdmin_code() {
		return admin_code;
	}
	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEnrolldate() {
		return enrolldate;
	}
	public void setEnrolldate(Date enrolldate) {
		this.enrolldate = enrolldate;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin_code=" + admin_code + ", password=" + password + ", name=" + name
				+ ", telephone=" + telephone + ", email=" + email + ", enrolldate=" + enrolldate + "]\n";
	}

}
