package com.bnta.mhr_api_solo._1_models;

import java.util.ArrayList;
import java.util.List;

public class Hunter {

    private Long id;

    private String name;

    private String weapon;

    private String buddyType;

    private List<Quest> quests;

//    DEFAULT CONSTRUCTOR:
    protected Hunter (){}

//    CONSTRUCTOR:
    public Hunter(String name, String weapon, String buddyType) {
        this.name = name;
        this.weapon = weapon;
        this.buddyType = buddyType;
        this.quests = new ArrayList<>();
    }

//    GETTERS & SETTERS:


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getBuddyType() {
        return buddyType;
    }

    public void setBuddyType(String buddyType) {
        this.buddyType = buddyType;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }
}
