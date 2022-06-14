package com.pru.test.skill.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_skills")
public class Skill {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long skillId;
    private String skillName;
    private String status;
    
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Long skillId, String skillName, String status) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", status=" + status + "]";
	}
    
}
