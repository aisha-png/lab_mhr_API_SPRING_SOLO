package com.bnta.mhr_api_solo._1_models;

import java.util.Stack;
import java.util.stream.Collectors;

public class Monster {

    private Long id;

    private String name;

    private String type;

    public Monster(){}

    public Monster(Long id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
