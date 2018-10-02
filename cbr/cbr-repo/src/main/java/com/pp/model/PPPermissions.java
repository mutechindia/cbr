package com.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERMISSION")
public class PPPermissions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PERMISSION_ID")
	private Integer permissionId;
	@Column(name = "PERMISSSION_NAME")
	private String permissionName;
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	
	
}
