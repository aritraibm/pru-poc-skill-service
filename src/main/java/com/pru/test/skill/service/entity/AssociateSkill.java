package com.pru.test.skill.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_associate_skills")
public class AssociateSkill {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long associateSkillId;
    private Long associateId;
    private Long skillId;
    private String skillRating;
    
	public Long getAssociateSkillId() {
		return associateSkillId;
	}
	public void setAssociateSkillId(Long associateSkillId) {
		this.associateSkillId = associateSkillId;
	}
	public Long getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillRating() {
		return skillRating;
	}
	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}
	public AssociateSkill(Long associateSkillId, Long associateId, Long skillId, String skillRating) {
		super();
		this.associateSkillId = associateSkillId;
		this.associateId = associateId;
		this.skillId = skillId;
		this.skillRating = skillRating;
	}
	public AssociateSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AssociateSkill [associateSkillId=" + associateSkillId + ", associateId=" + associateId + ", skillId="
				+ skillId + ", skillRating=" + skillRating + "]";
	}
    
}
