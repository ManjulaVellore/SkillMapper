package com.niit.CEBSkillMapper.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="skillMaster")
@Entity
public class Skills {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int skillId;
	private int employeeid;
	private String skillName;
	private String certifications;
	private int teachingHrs;
	private int studentsTrained;
	private int studentPlaced;
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public int getTeachingHrs() {
		return teachingHrs;
	}
	public void setTeachingHrs(int teachingHrs) {
		this.teachingHrs = teachingHrs;
	}
	public int getStudentsTrained() {
		return studentsTrained;
	}
	public void setStudentsTrained(int studentsTrained) {
		this.studentsTrained = studentsTrained;
	}
	public int getStudentPlaced() {
		return studentPlaced;
	}
	public void setStudentPlaced(int studentPlaced) {
		this.studentPlaced = studentPlaced;
	}	
	

}