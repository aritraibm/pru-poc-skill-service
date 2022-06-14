package com.pru.test.skill.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.skill.service.entity.AssociateSkill;


@Repository
public interface AssociateSkillRepo extends JpaRepository<AssociateSkill, Long> {

	AssociateSkill findByAssociateId(Long associateId);
	
}
