package com.pru.test.skill.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@Autowired
	private AssociateSkillService associateSkillService;
	
	final Logger logger= LoggerFactory.getLogger(SkillController.class);
	
	@GetMapping(value = "/get-skill-master")
	public List<Skill> saveUser() {
		
		return skillService.getSkillMaster();
	}

	@GetMapping(value = "/get-skill/{associateId}")
	public AssociateSkill getAssociateWithSkillDetails(@PathVariable Long associateId) {
		
		return associateSkillService.getAssociateSkillDetails(associateId);
	}

}
