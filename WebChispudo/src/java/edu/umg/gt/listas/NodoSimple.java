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
public class NodoSimple {
    
    private Object dato;
    private NodoSimple sig;

    public NodoSimple(Object dato){
        this.dato = dato;
        this.sig = null;
    }

    public Object getDato(){
        return dato;
    }

    public void setDato(Object dato){
        this.dato=dato;
    }

    public NodoSimple getSig(){
        return this.sig;
    }

    public void setSig(NodoSimple sig){
        this.sig=sig;
    }
    
}
