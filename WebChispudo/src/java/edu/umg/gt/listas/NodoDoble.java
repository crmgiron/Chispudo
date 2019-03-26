/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.gt.listas;

/**
 *
 * @author Rosy Perez
 */
public class NodoDoble {
    

    private Object dato;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble(Object dato){
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public Object getDato(){
        return dato;
    }

    public void setDato(Object dato){
        this.dato=dato;
    }

    public NodoDoble getSig(){
        return this.sig;
    }

    public void setSig(NodoDoble sig){
        this.sig=sig;
    }
    
}
