/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.gt.datos;

/**
 *
 * @author Rosy Perez
 */
public enum Numbers {
    ZERO("0", 0),
    ONE("1", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9);

    private final String n;
    private final int v;

    private Numbers(String n, int v) {
        this.n = n;
        this.v = v;
    }

    public String getN() {
        return n;
    }

    public int getV() {
        return v;
    }
    
}
