/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.IntStream;
import com.github.javafaker.Faker;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 *
 * @author cretu
 */
public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        var nodes = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Intersection(faker.superhero().name()))
                .toArray(Intersection[]::new);

//        System.out.println(faker.superhero().name());
        //String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
//        for(var i : nodes)
//            System.out.println(i);
//          System.out.println(nodes[1]);       
        Street street1 = new Street(faker.address().streetAddress(), 3, nodes[0], nodes[1]);
        Street street2 = new Street(faker.address().streetAddress(), 2, nodes[1], nodes[2]);
        Street street3 = new Street(faker.address().streetAddress(), 5, nodes[0], nodes[2]);

        HashSet<Intersection> intersections = new HashSet<>();
        intersections.add(nodes[0]);
        intersections.add(nodes[1]);
        intersections.add(nodes[2]);

//        for (Intersection i : intersections) {
//            System.out.println(i);
//        }
        LinkedList<Street> streets = new LinkedList<>();
        streets.add(street1);
        streets.add(street2);
        Collections.sort(streets);

        HashMap<Street, Integer> joinedStreets = new HashMap<>();
        joinedStreets.put(street1, 2);
        joinedStreets.put(street2, 3);
        joinedStreets.put(street3, 4);
        City city = new City("Iasi", intersections, streets, joinedStreets);
        System.out.println(city.toString());
        city.printStreets(1);

    }
}
