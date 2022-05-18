package com.bnta.mhr_api_solo._1_models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "arenas")
public class Arena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String location;

    @Column
    private String monster;

    @OneToMany(mappedBy = "arena")
//    @JsonIgnoreProperties({"arenas"})
    private List<Quest> quests;

//    DEFAULT CONSTRUCTOR:
    protected Arena(){}

//    CONSTRUCTOR:

    public Arena(String location, String monster) {
        this.location = location;
        this.monster = monster;
        this.quests = new ArrayList<>();
    }

//    GETTERS & SETTERS:

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
                ", location='" + location + '\'' +
                ", monster='" + monster + '\'' +
                ", quests=" + quests +
                '}';
    }
}
