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
        Hunter hunter1 = new Hunter("mad_dog", "long_sword", "palamute");
        Hunter hunter2 = new Hunter("scar", "dual_blade", "palamute");
        Hunter hunter3 = new Hunter("gunner", "light_bowgun", "palico");
        Hunter hunter4 = new Hunter("zero", "bow", "palamute");
        Hunter hunter5 = new Hunter("iron_heart", "charge_blade", "palico");
        Hunter hunter6 = new Hunter("slasher", "great_sword", "palico");
        Hunter hunter7 = new Hunter("diablo", "heavy_bowgun", "palamute");
        Hunter hunter8 = new Hunter("sythe", "switch_axe", "palico");
        Hunter hunter9 = new Hunter("insurgent", "gunlance", "palamute");
        Hunter hunter10 = new Hunter("skull_crusher", "hammer", "palamute");
        hunterRepository.saveAll(Arrays.asList
                (hunter1, hunter2, hunter3, hunter4, hunter5, hunter6, hunter7, hunter8, hunter9, hunter10));


//        TODO: ADD SOME ARENAS:
        Arena arena1 = new Arena("shrine_ruins");
        Arena arena2 = new Arena("frost_islands");
        Arena arena3 = new Arena("lava_caverns");
        Arena arena4 = new Arena("flooded_forest");
        Arena arena5 = new Arena("sandy_plains");
        Arena specialArena = new Arena("coral_palace");
        arenaRepository.saveAll(Arrays.asList(arena1, arena2, arena3, arena4, arena5, specialArena));


//        TODO: ADD SOME QUESTS:
        Quest quest1 = new Quest("blazin_soul_of_a_warrior", 7, Duration.ofMinutes(26), "magnamalo",arena3,
                Arrays.asList(hunter1, hunter3, hunter4, hunter7));
        Quest quest2 = new Quest("frost_bites", 6, Duration.ofMinutes(23), "lagombi", arena2,
                Arrays.asList(hunter2, hunter5, hunter6, hunter8));
        Quest quest3 = new Quest("apex_rathalos_emergency", 7, Duration.ofMinutes(34), "apex_rathalos", arena5,
                Arrays.asList(hunter9, hunter10, hunter4, hunter7));
        Quest quest4 = new Quest("almundron_fashion_victim", 4, Duration.ofMinutes(29), "almundron", arena3,
                Arrays.asList(hunter1, hunter5, hunter6, hunter10));
        Quest quest5 = new Quest("flooded_in_the_flooded_forest", 7, Duration.ofMinutes(32), "chameleos", arena4,
                Arrays.asList(hunter8, hunter6, hunter9, hunter1));
        Quest quest6 = new Quest("sf_ultimate_promotion_exam", 7, Duration.ofMinutes(35), "rajang", arena1,
                Arrays.asList(hunter2, hunter7, hunter3, hunter5));
        Quest quest7 = new Quest("boomy_dango", 6, Duration.ofMinutes(17), "bazelguese",arena2,
                Arrays.asList(hunter3, hunter8, hunter2, hunter6));
        Quest quest8 = new Quest("wrestling_the_pain", 5, Duration.ofMinutes(23), "arzuros", arena4,
                Arrays.asList(hunter4, hunter9, hunter5, hunter9));
        Quest quest9 = new Quest("dancing_parasol_snowy_breeze", 7, Duration.ofMinutes(23), "aknosom", arena2,
                Arrays.asList(hunter5, hunter10, hunter4, hunter2));
        Quest quest10 = new Quest("kunai_ask_you_a_favor", 7, Duration.ofMinutes(23), "diablos", arena5,
                Arrays.asList(hunter6, hunter1, hunter10, hunter3));
        Quest quest11 = new Quest("sharpening_amber_fangs", 6, Duration.ofMinutes(16), "barioth", arena2,
                Arrays.asList(hunter7, hunter1, hunter5, hunter2));
        Quest quest12 = new Quest("a_bewitching_dance", 6, Duration.ofMinutes(15), "mizutsune", arena1,
                Arrays.asList(hunter6, hunter9, hunter10, hunter3));
        Quest quest13 = new Quest("clad_in_hellfire", 7, Duration.ofMinutes(22), "magnamalo", arena1,
                Arrays.asList(hunter4, hunter8, hunter3, hunter5));
        Quest quest14 = new Quest("evil_afoot", 7, Duration.ofMinutes(23), "rajang", arena3,
                Arrays.asList(hunter3, hunter4, hunter10, hunter2));
        Quest specialQuest = new Quest("serpent_goddess_of_thunder", 7, Duration.ofMinutes(39), "serpent_narwa", specialArena,
                Arrays.asList(hunter10, hunter5, hunter7, hunter6));
        questRepository.saveAll(
                Arrays.asList(quest1, quest2, quest3, quest4, quest5, quest6, quest7,
                        quest8, quest9, quest10, quest11, quest12, quest13, quest14, specialQuest));

    }
}
