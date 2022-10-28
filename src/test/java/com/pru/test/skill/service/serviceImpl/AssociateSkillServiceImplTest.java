package com.pru.test.skill.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.pru.test.skill.service.entity.AssociateSkill;
import com.pru.test.skill.service.repo.AssociateSkillRepo;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
		AssociateSkill as1= new AssociateSkill("15L", "4L", "2L", "3");
		wrapperList.add(as1);
		
		when(associateSkillRepo.findByAssociateId("15L")).thenReturn(wrapperList);

		List<AssociateSkill> assList = associateSkillServiceImpl.getAssociateSkillDetails("15L");

		assertEquals(1, assList.size());
		assertEquals("3", assList.get(0).getSkillRating());
	}

}
