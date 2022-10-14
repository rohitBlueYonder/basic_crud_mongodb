package com.example.crud.mongoDB.crudOperations.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "User")
public class User {


    @Id
    private int id;
    private String name;
    private int age;
    private String privileges;
    private List<Integer> finished;
    private List<String> badges;

//    name: 'Steve',
//    age: 46,
//    phone: { personal: '929-884-8752', work: '555-456-456', ext: '1109' },
//    privileges: 'admin',
//    favorites: { artist: 'Rembrandt', food: 'kroketten' },
//    finished: [ 25 ],
//    badges: [ 'red', 'blue' ],
//    points: [ { points: 12, bonus: 5 }, { points: 40, bonus: 0 } ] }


    public User() {
    }

    public User(int id, String name, int age, String privileges, List<Integer> finished, List<String> badges) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.privileges = privileges;
        this.finished = finished;
        this.badges = badges;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public List<Integer> getFinished() {
        return finished;
    }

    public void setFinished(List<Integer> finished) {
        this.finished = finished;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", privileges='" + privileges + '\'' +
                ", finished=" + finished +
                ", badges=" + badges +
                '}';
    }
}
