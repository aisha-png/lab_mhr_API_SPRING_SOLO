package com.bnta.mhr_api_solo._4_controllers;

import com.bnta.mhr_api_solo._1_models.Arena;
import com.bnta.mhr_api_solo._1_models.Quest;
import com.bnta.mhr_api_solo._2_repositories.ArenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("arenas")
public class ArenaController {

    @Autowired
    ArenaRepository arenaRepository;

//    TODO: INDEX
//    @GetMapping//localhost:8080/arenas
//    public ResponseEntity<List<Arena>> getArenas(){
//        return new ResponseEntity<>(arenaRepository.findAll(), HttpStatus.OK);
//    }
    @GetMapping
    public ResponseEntity<List<Arena>> getArenaByLocation(
            @RequestParam(required = false, name = "location") String location){
        if(location != null) {
            return new ResponseEntity<>(arenaRepository.findArenaByLocation(location), HttpStatus.OK);
        }
        return new ResponseEntity<>(arenaRepository.findAll(), HttpStatus.OK);
    }

//    TODO: SHOW ROUTE
    @GetMapping("/{id}")//localhost:8080/arenas/1
    public ResponseEntity<Optional<Arena>> getArena(@PathVariable Long id){
        return new ResponseEntity<>(arenaRepository.findById(id), HttpStatus.OK);
    }

//    TODO: CREATE/POST
    @PostMapping
    public ResponseEntity<Arena> createArena(@RequestBody Arena newArena){
        arenaRepository.save(newArena);
        return new ResponseEntity<>(newArena, HttpStatus.CREATED);
    }

//    TODO: DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> removeArena(@PathVariable Long id){
        arenaRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
    }
}
