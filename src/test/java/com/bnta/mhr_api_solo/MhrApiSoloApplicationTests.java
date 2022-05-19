package com.bnta.mhr_api_solo;

import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._1_models.Quest;
import com.bnta.mhr_api_solo._2_repositories.ArenaRepository;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MhrApiSoloApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	HunterRepository hunterRepository;


//	--------------------------------------------TESTS FOR HUNTER--------------------------------------------------------
	@Test
	public void canFindHunterByUserName(){
		List<Hunter> found = hunterRepository.findHunterByUserName("mad_dog");
		assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void canFindHuntersByBuddyType(){
		List<Hunter> found = hunterRepository.findHuntersByBuddyType("palamute");
		assertThat(found.size()).isEqualTo(6);
	}

	@Test
	public void canFindHunterByWeapon(){
		List<Hunter> found = hunterRepository.findHunterByWeapon("hammer");
		assertThat(found.size()).isEqualTo(1);
	}

//	@Test
//	public void canRemoveHunter(){
//		hunterRepository.deleteById(1L);
//		List<Hunter> hunters = hunterRepository.findAll();
//		assertThat(hunters.size()).isEqualTo(9);
//	}





}
