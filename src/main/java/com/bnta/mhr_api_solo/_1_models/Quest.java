package com.bnta.mhr_api_solo._1_models;

import java.time.Duration;
import java.util.List;

public class Quest {

    private Long id;

    private String title;

    private Duration completedIn;

    private String monster;

    private List<Hunter> hunters;

//    DEFAULT CONSTRUCTOR:
    protected Quest(){}

//    CONSTRUCTOR:

    public Quest(String title, Duration completedIn, String monster, List<Hunter> hunters) {
        this.title = title;
        this.completedIn = completedIn;
        this.monster = monster;
        this.hunters = hunters;
    }

//    GETTERS & SETTERS:

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(Duration completedIn) {
        this.completedIn = completedIn;
    }

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public List<Hunter> getHunters() {
        return hunters;
    }

    public void setHunters(List<Hunter> hunters) {
        this.hunters = hunters;
    }
}
