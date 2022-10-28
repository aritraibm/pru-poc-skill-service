package com.pru.test.skill.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.skill.service.entity.Skill;
import com.pru.test.skill.service.repo.SkillRepo;
import com.pru.test.skill.service.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepo skillRepo;

	@Override
	public List<Skill> getSkillMaster() {
		
		return skillRepo.findAll();
	}

	

}
