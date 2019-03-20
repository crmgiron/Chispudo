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
public class Cards {
    
    private String color;
    private String n;
    private int numb;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "color=" + color + ", numero letras =" + n + ", numb=" + numb;
    }
    

    
}
