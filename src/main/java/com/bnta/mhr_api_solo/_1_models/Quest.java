package com.bnta.mhr_api_solo._1_models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Entity
@Table(name = "quests")
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private int level;

    @Column
    private Duration completedIn;

    @Column(name = "large_monster")
    private String monster;

    @ManyToOne
    @JoinColumn(name = "arena_id")
    @JsonIgnoreProperties({"quests"})
    private Arena arena;

    @ManyToMany
    @JoinTable(name = "quests_hunters",
            joinColumns = {@JoinColumn(name = "quest_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "hunter_id", nullable = false)})
    @JsonIgnoreProperties({"quests"})
    private List<Hunter> hunters;

//    DEFAULT CONSTRUCTOR:
    protected Quest(){}

//    CONSTRUCTOR:

    public Quest(String title, int level, Duration completedIn, String monster, Arena arena, List<Hunter> hunters) {
        this.title = title;
        this.level = level;
        this.completedIn = completedIn;
        this.monster = monster;
        this.arena = arena;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public List<Hunter> getHunters() {
        return hunters;
    }

    public void setHunters(List<Hunter> hunters) {
        this.hunters = hunters;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", level=" + level +
                ", completedIn=" + completedIn +
                ", monster='" + monster + '\'' +
                ", arena=" + arena +
                ", hunters=" + hunters +
                '}';
    }
}
