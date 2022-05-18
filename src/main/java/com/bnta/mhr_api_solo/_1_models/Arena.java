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




}
