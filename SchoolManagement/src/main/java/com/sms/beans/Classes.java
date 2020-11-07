package com.sms.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class Classes {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "class_Id")
	private Long classId;
	
	@Column(name = "classes")
	private String classes;
	
	@Column(name = "active")
	private String active;

	public Classes() {	}

	public Classes(Long classId, String classes, String active) {
		this.classId = classId;
		this.classes = classes;
		this.active = active;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", classes=" + classes + ", active=" + active + "]";
	}
	
}
