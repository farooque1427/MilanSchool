package com.sms.beans;

public class Role {

	private Long roleId;
	private String role;
	private String description;

	public Role() {	}

	public Role(Long roleId, String role, String description) {
		this.roleId = roleId;
		this.role = role;
		this.description = description;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", role=" + role + ", description=" + description + "]";
	}

}
