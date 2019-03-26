/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.gt.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 *
 * @author Rosy Perez
 */
public class PilaMazo {
    
    private NodoSimple inicio;
    private ArrayList<Cards> cartas;
    private int size;
  
    
    public void ingresarMazo(){
        while(!cartas.isEmpty()){
            agregarCima(cartas.remove(0));
        }
    }
    
    public PilaMazo(){
        inicio = null;
        //cartas = null;
    }
    
    public void IniciarMazo(){
        //this.cartas = new ArrayList<>();
        for (Colors x : Colors.values()) {
            for (Numbers y : Numbers.values()) {
                Cards carta = new Cards();
                carta.setColor(x.toString());
                carta.setN(y.getN());
                carta.setNumb(y.getV());
                cartas.add(carta);
                size++;
            }
        }
        
        Random mezclar = new Random();
        Collections.shuffle(cartas, mezclar);
    }
    

    public boolean estaVacia(){
        return inicio==null;
    }

    public void agregarCima(Object dato){
        //1. crear Nodo
        NodoSimple nuevo = new NodoSimple(dato);
        //2. revisar si la lista no esta vacia
        if(!estaVacia()){
            nuevo.setSig(inicio);//nuevo nodo apunta a inicio
        }
        //3. el nuevo nodo es el inicial de la lista
        inicio = nuevo;
    }

    public Object ConsultarCima(){
        return inicio.getDato();
    }
            
    
    public Object eliminarCima(){
        Object x = inicio.getDato();
        //1.cambiar inicio al segundo nodo
        if(!estaVacia()){ 
            inicio = inicio.getSig();
        }
        return x;//carta al jugador se manda object
    }
    
    public String mostrarDato(NodoSimple nodo){
        if(nodo.getSig()==null){
            return nodo.getDato().toString() + "";
        }
        return nodo.getDato() +" "+ mostrarDato(nodo.getSig());
    } 
    
    public void recorrerPila(){
        NodoSimple temp = inicio;
        while(temp!=null){
            //1.mostrar el dato
            System.out.println(temp.getDato().toString()
            +"/n");
            //2. cambiar el apuntador al siguiente nodo
            temp=temp.getSig();
        }
        
        System.out.println("la lista tiene: "+size+" cartas");
    }
    
    public static void main(String[] args){
        
        PilaMazo l = new PilaMazo();//se inicia el mazo y se revuelven las cartas
        l.ingresarMazo();//las ingresa a la pila
        
        l.recorrerPila();
        
        
        
    }
    
    
}
