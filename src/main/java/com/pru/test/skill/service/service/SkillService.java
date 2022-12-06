package com.pru.test.skill.service.service;

import java.util.List;
import java.util.Optional;

import com.pru.test.skill.service.entity.Skill;

public interface SkillService {

	List<Skill> getSkillMaster();

	Optional<Skill> getSkill(String id);

}
