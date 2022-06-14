package com.pru.test.skill.service.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
