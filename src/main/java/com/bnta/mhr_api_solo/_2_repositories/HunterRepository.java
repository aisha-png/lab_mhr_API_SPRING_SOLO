package com.bnta.mhr_api_solo._2_repositories;

import com.bnta.mhr_api_solo._1_models.Hunter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HunterRepository extends JpaRepository<Hunter, Long> {

    List<Hunter> findHunterByUserName(String userName);
    List<Hunter> findHuntersByBuddyType(String buddyType);
    List<Hunter> findHunterByWeapon(String weapon);

}
