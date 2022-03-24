/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author cretu
 */
public class Street implements Comparable<Street> {

    private String name;
    private int length;
    private Intersection intersectionA;
    private Intersection intersectionB;
    LinkedList<Street> streets = new LinkedList<>();

    public LinkedList<Street> getStreets() {
        return streets;
    }

    public void setStreets(LinkedList<Street> streets) {
        this.streets = streets;
    }

    public Street(String name, int length, Intersection intersectionA, Intersection intersectionB) {
        this.name = name;
        this.length = length;
        this.intersectionA = intersectionA;
        this.intersectionB = intersectionB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Intersection getIntersectionA() {
        return intersectionA;
    }

    public void setIntersectionA(Intersection intersectionA) {
        this.intersectionA = intersectionA;
    }

    public Intersection getIntersectionB() {
        return intersectionB;
    }

    public void setIntersectionB(Intersection intersectionB) {
        this.intersectionB = intersectionB;
    }

    public int getHashKeySize(String name, HashMap<Street, Integer> streetHashMap) {
        int value = 0;
        for (Map.Entry<Street, Integer> entry : streetHashMap.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                value = entry.getValue();
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "Street{" + "name=" + name + ", length=" + length + ", intersectionA=" + intersectionA + ", intersectionB=" + intersectionB + '}';
    }

    @Override
    public int compareTo(Street o) {
        return this.length - o.length;
    }

}
