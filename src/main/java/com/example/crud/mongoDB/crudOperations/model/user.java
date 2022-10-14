package com.example.crud.mongoDB.crudOperations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class user {


    @Id
    private int id;

    private String name;
    private int age;

    private String privileges;

    private int[] finished;
    private String[] badges;



//    name: 'Steve',
//    age: 46,
//    phone: { personal: '929-884-8752', work: '555-456-456', ext: '1109' },
//    privileges: 'admin',
//    favorites: { artist: 'Rembrandt', food: 'kroketten' },
//    finished: [ 25 ],
//    badges: [ 'red', 'blue' ],
//    points: [ { points: 12, bonus: 5 }, { points: 40, bonus: 0 } ] }


}
