package com.bnta.mhr_api_solo._3_components;

import com.bnta.mhr_api_solo._2_repositories.ArenaRepository;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

//    INJECT REPOSITORIES HERE:
    @Autowired
    HunterRepository hunterRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    ArenaRepository arenaRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {


    }
}
