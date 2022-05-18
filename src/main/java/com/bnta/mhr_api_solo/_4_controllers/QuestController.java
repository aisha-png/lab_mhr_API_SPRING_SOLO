package com.bnta.mhr_api_solo._4_controllers;

import com.bnta.mhr_api_solo._1_models.Quest;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quests")
public class QuestController {

    @Autowired
    QuestRepository questRepository;

//    TODO: INDEX
    @GetMapping //localhost:8080/quests
    public ResponseEntity<List<Quest>> getQuest(){
        return new ResponseEntity<>(questRepository.findAll(), HttpStatus.OK);
    }




}
