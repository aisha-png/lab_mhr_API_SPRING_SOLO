package com.bnta.mhr_api_solo._1_models;

import java.util.List;

public class Arena {

    private Long id;

    private String name;

    private String monster;

    private List<Quest> quests;

//    DEFAULT CONSTRUCTOR:
    protected Arena(){}

//    CONSTRUCTOR:

    public Arena(String name, String monster, List<Quest> quests) {
        this.name = name;
        this.monster = monster;
        this.quests = quests;
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

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    @Override
    public String toString() {
        return "Arena{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monster='" + monster + '\'' +
                ", quests=" + quests +
                '}';
    }
}
