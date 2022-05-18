package com.bnta.mhr_api_solo._2_repositories;

import com.bnta.mhr_api_solo._1_models.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {
}
