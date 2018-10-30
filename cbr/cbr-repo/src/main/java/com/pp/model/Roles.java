package com.pp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "ROLES")
public class Roles {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLE_ID")
	private Integer roleId;
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Permissions.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "ROLE_ID", referencedColumnName="ROLE_ID")
	private Set<Permissions> Permission;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

}
