package com.bnta.mhr_api_solo._4_controllers;

import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hunters")
public class HunterController {

    @Autowired
    HunterRepository hunterRepository;

    @GetMapping //localhost:8080/hunters
    public ResponseEntity<List<Hunter>> getHunters(){
        return new ResponseEntity<>(hunterRepository.findAll(), HttpStatus.OK);
    }

//    TODO: SHOW ROUTE
    @GetMapping("/{id}")//localhost:8080/hunters/1
    public ResponseEntity<Optional<Hunter>> getHunter(@PathVariable Long id){
        return new ResponseEntity<>(hunterRepository.findById(id), HttpStatus.OK);
    }


}
