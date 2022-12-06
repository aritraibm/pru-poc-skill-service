package com.pru.test.skill.service.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.skill.service.entity.AssociateSkill;
import com.pru.test.skill.service.entity.Skill;
import com.pru.test.skill.service.service.AssociateSkillService;
import com.pru.test.skill.service.service.SkillService;

@RestController
@RequestMapping(value = "/pru-skill")
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@Value("${skill.service.url}")
	private String skillServiceUrl;
	
	@Autowired
	private AssociateSkillService associateSkillService;
	
	final Logger logger= LoggerFactory.getLogger(SkillController.class);
	
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping(value = "/get-skill-master")
	public List<Skill> getAllSkill() {
		
		return skillService.getSkillMaster();
	}

	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping(value = "/get-skill/{associateId}")
	public List<AssociateSkill> getAssociateWithSkillDetails(@PathVariable String associateId) {
		
		return associateSkillService.getAssociateSkillDetails(associateId);
	}
	
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping(value = "/skill/{id}")
	public Skill getSkill(@PathVariable String id) {
		Optional<Skill> skill= skillService.getSkill(id);
		if (skill.isPresent()) {
			return skill.get();
		}
		return null;
	}

}
