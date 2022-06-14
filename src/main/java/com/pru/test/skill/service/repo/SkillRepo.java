package com.pru.test.skill.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.skill.service.entity.Skill;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

	
}
