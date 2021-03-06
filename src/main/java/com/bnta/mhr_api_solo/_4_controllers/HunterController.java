package com.bnta.mhr_api_solo._4_controllers;

import com.bnta.mhr_api_solo._1_models.Hunter;
import com.bnta.mhr_api_solo._2_repositories.HunterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hunters")
public class HunterController {

    @Autowired
    HunterRepository hunterRepository;

//    TODO: INDEX
//    @GetMapping //localhost:8080/hunters
//    public ResponseEntity<List<Hunter>> getHunters(){
//        return new ResponseEntity<>(hunterRepository.findAll(), HttpStatus.OK);
//    }

//    @GetMapping //localhost:8080/hunters?username=mad_dog
//    public ResponseEntity<List<Hunter>> getHunterUserName(
//            @RequestParam(required = false, name = "username") String userName){
//        if (userName != null){
//            return new ResponseEntity<>(hunterRepository.findHunterByUserName(userName), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(hunterRepository.findAll(), HttpStatus.OK);
//    }
    @GetMapping //localhost:8080/hunters?username=mad_dog
    public ResponseEntity<List<Hunter>> getHunterUserName(
            @RequestParam(required = false, name = "username") String userName,
            @RequestParam(required = false, name = "weapon") String weapon,
            @RequestParam(required = false, name = "buddytype") String buddyType){
        if (userName != null){
            return new ResponseEntity<>(hunterRepository.findHunterByUserName(userName), HttpStatus.OK);
        }
        if (weapon != null){
            return new ResponseEntity<>(hunterRepository.findHunterByWeapon(weapon), HttpStatus.OK);
        }
        if (buddyType != null){
            return new ResponseEntity<>(hunterRepository.findHuntersByBuddyType(buddyType), HttpStatus.OK);
        }
        return new ResponseEntity<>(hunterRepository.findAll(), HttpStatus.OK);
    }

//    TODO: SHOW ROUTE
    @GetMapping(value = "/{id}")//localhost:8080/hunters/10
    public ResponseEntity<Optional<Hunter>> getHunter(@PathVariable Long id){
        return new ResponseEntity<>(hunterRepository.findById(id), HttpStatus.OK);
    }

//    TODO: CREATE/POST
    @PostMapping
    public ResponseEntity<Hunter> createHunter(@RequestBody Hunter newHunter){
        hunterRepository.save(newHunter);
        return new ResponseEntity<>(newHunter, HttpStatus.CREATED);
    }

//    TODO: DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> removeHunter(@PathVariable("id") Long id){
        hunterRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
