package com.pru.test.skill.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pru.test.skill.service.entity.AssociateSkill;
import com.pru.test.skill.service.repo.AssociateSkillRepo;
import com.pru.test.skill.service.service.AssociateSkillService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class AssociateSkillServiceImplTest{

	@InjectMocks
	AssociateSkillServiceImpl associateSkillServiceImpl;

	@Mock
	AssociateSkillRepo associateSkillRepo;


	@Test
	public void getAssociateSkillDetails() {
		
		List<AssociateSkill> wrapperList= new ArrayList<>();
		AssociateSkill as1= new AssociateSkill(15L, 4L, 2L, "3");
		wrapperList.add(as1);
		
		when(associateSkillRepo.findByAssociateId(15L)).thenReturn(wrapperList);

		List<AssociateSkill> assList = associateSkillServiceImpl.getAssociateSkillDetails(15L);

		assertEquals(1, assList.size());
		assertEquals("3", assList.get(0).getSkillRating());
	}

}
