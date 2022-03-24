/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.HashSet;

/**
 *
 * @author cretu
 */
public class Intersection {

    private String name;
    private HashSet<Intersection> intersections = new HashSet<>();

    public Intersection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Intersection{" + "name=" + name + '}';
    }

}
