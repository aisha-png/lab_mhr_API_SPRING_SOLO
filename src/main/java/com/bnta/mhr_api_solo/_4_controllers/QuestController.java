package com.bnta.mhr_api_solo._4_controllers;

import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._1_models.Quest;
import com.bnta.mhr_api_solo._2_repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("quests")
public class QuestController {

    @Autowired
    QuestRepository questRepository;

//    TODO: INDEX
    @GetMapping //localhost:8080/quests
    public ResponseEntity<List<Quest>> getQuests(){
        return new ResponseEntity<>(questRepository.findAll(), HttpStatus.OK);
    }

//    TODO: SHOW ROUTE
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Quest>> getQuest(@PathVariable Long id){
        return new ResponseEntity<>(questRepository.findById(id), HttpStatus.OK);
    }

//    TODO: CREATE/POST
    @PostMapping
    public ResponseEntity<Quest> createQuest(@RequestBody Quest newQuest){
        questRepository.save(newQuest);
        return new ResponseEntity<>(newQuest, HttpStatus.CREATED);
    }

//    TODO: DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> removeQuest(@PathVariable Long id){
        questRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
    }



}
