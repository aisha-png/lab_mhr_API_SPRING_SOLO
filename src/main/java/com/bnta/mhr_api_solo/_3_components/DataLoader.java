package com.bnta.mhr_api_solo._3_components;

import com.bnta.mhr_api_solo._1_models.Arena;
import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._1_models.Quest;
import com.bnta.mhr_api_solo._2_repositories.ArenaRepository;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Arrays;

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
//        TODO: ADD SOME HUNTERS:
        Hunter hunter1 = new Hunter("Mad Dog", "Long Sword", "PALAMUTE");
        Hunter hunter2 = new Hunter("Scar", "Dual Blade", "PALAMUTE");
        Hunter hunter3 = new Hunter("Gunner", "Light BowGun", "PALICO");
        Hunter hunter4 = new Hunter("Zero", "bow", "PALAMUTE");
        Hunter hunter5 = new Hunter("Iron Heart", "Charge Blade", "PALICO");
        Hunter hunter6 = new Hunter("Slasher", "Great Sword", "PALICO");
        Hunter hunter7 = new Hunter("Diablo", "Heavy BowGun", "PALAMUTE");
        Hunter hunter8 = new Hunter("Sythe", "Switch Axe", "PALICOE");
        Hunter hunter9 = new Hunter("Insurgent", "Gunlance", "PALAMUTE");
        Hunter hunter10 = new Hunter("Skull Crusher", "Hammer", "PALAMUTE");
        hunterRepository.saveAll(Arrays.asList
                (hunter1, hunter2, hunter3, hunter4, hunter5, hunter6, hunter7, hunter8, hunter9, hunter10));


//        TODO: ADD SOME ARENAS:
        Arena arena1 = new Arena("Shrine Ruins", "Zinogre");
        Arena arena2 = new Arena("Frost Islands", "Rathian");
        Arena arena3 = new Arena("Lava Caverns", "Magnamalo");
        Arena arena4 = new Arena("Flooded Forest", "Almudron");
        Arena arena5 = new Arena("Sandy Plains", "Apex Rathalos");
        arenaRepository.saveAll(Arrays.asList(arena1, arena2, arena3, arena4, arena5));

//        TODO: ADD SOME QUESTS:
        Quest quest1 = new Quest("Blazin' Soul of a Warrior", 7, Duration.ofMinutes(26), "Magnamalo",arena3,
                Arrays.asList(hunter1, hunter3, hunter4, hunter7));
        Quest quest2 = new Quest("Frost Bites", 6, Duration.ofMinutes(23), "Lagombi", arena2,
                Arrays.asList(hunter2, hunter5, hunter6, hunter8));
        Quest quest3 = new Quest("Apex Rathalos Emergency", 7, Duration.ofMinutes(34), "Apex Rathalos", arena5,
                Arrays.asList(hunter9, hunter10, hunter4, hunter7));
        Quest quest4 = new Quest("Almundron: Fashion Victim", 4, Duration.ofMinutes(29), "Almundron", arena3,
                Arrays.asList(hunter1, hunter5, hunter6, hunter10));
        Quest quest5 = new Quest("Flooded in the Flooded Forest", 7, Duration.ofMinutes(32), "Chameleos", arena4,
                Arrays.asList(hunter8, hunter6, hunter9, hunter1));
        Quest quest6 = new Quest("SF: Ultimate Promotion Exam", 7, Duration.ofMinutes(39), "Rajang", arena1,
                Arrays.asList(hunter2, hunter7, hunter3, hunter5));
        Quest quest7 = new Quest("Boomy Dango", 6, Duration.ofMinutes(17), "Bazelguese",arena2,
                Arrays.asList(hunter3, hunter8, hunter2, hunter6));
        Quest quest8 = new Quest("Wrestling the Pain", 5, Duration.ofMinutes(23), "Arzuros", arena4,
                Arrays.asList(hunter4, hunter9, hunter5, hunter9));
        Quest quest9 = new Quest("Dancing Parasol, Snowy Breeze", 7, Duration.ofMinutes(23), "Aknosom", arena2,
                Arrays.asList(hunter5, hunter10, hunter4, hunter2));
        Quest quest10 = new Quest("Kunai Ask You a Favor", 7, Duration.ofMinutes(23), "Diablos", arena5,
                Arrays.asList(hunter6, hunter1, hunter10, hunter3));
        questRepository.saveAll(
                Arrays.asList(quest1, quest2, quest3, quest4, quest5, quest6, quest7, quest8, quest9, quest10));


    }
}
