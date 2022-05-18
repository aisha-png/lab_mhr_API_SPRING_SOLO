package com.bnta.mhr_api_solo._1_models;

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
    private Duration completedIn;

    @ManyToOne
    @JoinColumn(name = "arena_id")
    private Arena arena;

    @ManyToMany
    @JoinTable(name = "quests_hunters",
            joinColumns = {@JoinColumn(name = "quest_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "hunter_id", nullable = false)})
//    @JsonIgnoreProperties({"quests"})
    private List<Hunter> hunters;

//    DEFAULT CONSTRUCTOR:
    protected Quest(){}

//    CONSTRUCTOR:

    public Quest(String title, Duration completedIn, Arena arena, List<Hunter> hunters) {
        this.title = title;
        this.completedIn = completedIn;
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

    public Duration getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(Duration completedIn) {
        this.completedIn = completedIn;
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
                ", completedIn=" + completedIn +
                ", arena=" + arena +
                ", hunters=" + hunters +
                '}';
    }
}
