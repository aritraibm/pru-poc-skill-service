package com.pru.test.skill.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pru.test.skill.service.entity.AssociateSkill;


public interface AssociateSkillService {

	AssociateSkill getAssociateSkillDetails(Long associateId);

	
}
