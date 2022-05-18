package com.bnta.mhr_api_solo._1_models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hunters")
public class Hunter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String weapon;

    @Column
    private String buddyType;

    @ManyToMany(mappedBy = "hunters")
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

    public void addQuest(Quest quest){
        this.quests.add(quest);
    }

    public void removeQuest(Quest quest){
        this.quests.remove(quest);
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", buddyType='" + buddyType + '\'' +
                ", quests=" + quests +
                '}';
    }
}
