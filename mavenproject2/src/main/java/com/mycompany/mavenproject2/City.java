/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import java.util.stream.Stream;

/**
 *
 * @author cretu
 */
public class City {

    private String name;
    private HashSet<Intersection> intersections = new HashSet<>();
    private LinkedList<Street> streets = new LinkedList<>();
    private HashMap<Street, Integer> joinedStreets = new HashMap<>();

    public City(String name, HashSet<Intersection> intersections, LinkedList<Street> streets, HashMap<Street, Integer> joinedStreets) {
        this.name = name;
        this.intersections = intersections;
        this.streets = streets;
        this.joinedStreets = joinedStreets;
    }

    public String getName() {
        return name;
    }

    public Map<Street, Integer> getJoinedStreets() {
        return joinedStreets;
    }

    public void setJoinedStreets(Street street, int value) {
        joinedStreets.put(street, value);
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(HashSet<Intersection> intersections) {
        this.intersections = intersections;
    }

    public LinkedList<Street> getStreets() {
        return streets;
    }

    public void setStreets(LinkedList<Street> streets) {
        this.streets = streets;
    }

    public void printStreets(int length) {
        LinkedList<Street> streets2 = new LinkedList<>();
        Stream<Street> stream = streets.stream();
        stream.filter(street -> street.getLength() > length).forEach(e -> streets2.add(e));
        stream = streets2.stream();
        stream.filter(street -> street.getHashKeySize(street.getName(), joinedStreets) >= 3).
                forEach(street -> System.out.println(street.getName() + "-" + street.getLength() + " -> " + street.getHashKeySize(street.getName(), joinedStreets)));

    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + "," + streets.toString() + '}';
    }

}
