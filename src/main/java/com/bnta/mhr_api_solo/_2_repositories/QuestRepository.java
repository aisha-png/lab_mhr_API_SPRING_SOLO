package com.bnta.mhr_api_solo._2_repositories;

import com.bnta.mhr_api_solo._1_models.Arena;
import com.bnta.mhr_api_solo._1_models.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestRepository extends JpaRepository<Quest, Long> {


    List<Quest> findQuestByTitle(String title);
//    List<Quest> findAllLevel7Quests(Integer level);
    List<Quest> findQuestByMonster(String monster);
    List<Quest> findQuestByArena(Arena arena);



}
