package com.bnta.mhr_api_solo._3_components;

import com.bnta.mhr_api_solo._1_models.Arena;
import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._2_repositories.ArenaRepository;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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


//        TODO: ADD SOME ARENAS
        Arena arena1 = new Arena("Shrine Ruins", "Zinogre");
        Arena arena2 = new Arena("Frost Islands", "Rathian");
        Arena arena3 = new Arena("Lava Caverns", "Magnamalo");
        Arena arena4 = new Arena("Flooded Forest", "Almudron");
        Arena arena5 = new Arena("Sandy Plains", "Apex Rathalos");
        arenaRepository.saveAll(Arrays.asList(arena1, arena2, arena3, arena4, arena5));


    }
}
