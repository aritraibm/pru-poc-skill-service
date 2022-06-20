package com.pru.test.skill.service.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pru.test.skill.service.entity.AssociateSkill;
import com.pru.test.skill.service.repo.AssociateSkillRepo;
import com.pru.test.skill.service.service.AssociateSkillService;

@Service
public class AssociateSkillServiceImpl implements AssociateSkillService {

	@Autowired
	private AssociateSkillRepo associateSkillRepo;

	@Override
	public List<AssociateSkill> getAssociateSkillDetails(Long associateId) {
		//System.out.println("SKILL SERVICE associateId ::::: >>>>"+associateId);
		// TODO Auto-generated method stub
		return associateSkillRepo.findByAssociateId(associateId);
	}

}
