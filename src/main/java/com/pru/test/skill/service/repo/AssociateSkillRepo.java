package com.pru.test.skill.service.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.skill.service.entity.AssociateSkill;


@Repository
public interface AssociateSkillRepo extends MongoRepository<AssociateSkill, String> {

	List<AssociateSkill> findByAssociateId(String associateId);
	
}
