package com.pru.test.skill.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "AssociateSkills")
public class AssociateSkill {

	@Id
	private String associateSkillId;
    private String associateId;
    private String skillId;
    private String skillRating;
    
	public String getAssociateSkillId() {
		return associateSkillId;
	}
	public void setAssociateSkillId(String associateSkillId) {
		this.associateSkillId = associateSkillId;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public String getSkillRating() {
		return skillRating;
	}
	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}
	public AssociateSkill(String associateSkillId, String associateId, String skillId, String skillRating) {
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
