package com.pru.test.skill.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.skill.service.entity.AssociateSkill;
import com.pru.test.skill.service.repo.AssociateSkillRepo;
import com.pru.test.skill.service.service.AssociateSkillService;

@Service
public class AssociateSkillServiceImpl implements AssociateSkillService {

	@Autowired
	private AssociateSkillRepo associateSkillRepo;

	@Override
	public List<AssociateSkill> getAssociateSkillDetails(String associateId) {
		//System.out.println("SKILL SERVICE associateId ::::: >>>>"+associateId);
		// TODO Auto-generated method stub
		return associateSkillRepo.findByAssociateId(associateId);
	}

}
