package com.bnta.mhr_api_solo._2_repositories;

import com.bnta.mhr_api_solo._1_models.Arena;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArenaRepository extends JpaRepository<Arena, Long> {

    List<Arena> findArenaByLocation(String location);
}
