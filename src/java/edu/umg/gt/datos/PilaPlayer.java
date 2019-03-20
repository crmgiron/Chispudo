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
public class PilaPlayer {
   
    private NodoDoble inicio;
  
    
    public PilaPlayer(){
        inicio=null;
        
    }

    public boolean estaVacia(){
        return inicio==null;
    }

    public void agregarCima(Object dato){
        //1. crear Nodo
        NodoDoble nuevo = new NodoDoble(dato);
        //2. revisar si la lista no esta vacia
        if(!estaVacia()){
            nuevo.setSig(inicio);//nuevo nodo apunta a inicio
            inicio.setAnt(nuevo);//inicio apunta al nuevo
        }
        //3. el nuevo nodo es el inicial de la lista
        inicio = nuevo;
    }

    public Object eliminarCima(){
        Object x = inicio.getDato();
        //1.cambiar inicio al segundo nodo
        if(!estaVacia()){ 
            inicio = inicio.getSig();
            inicio.setAnt(null);
           
        }
        return x;
    }
    
    public String mostrarDato(NodoDoble nodo){
        if(nodo.getSig()==null)
            return nodo.getDato() + " ";
    
        return nodo.getDato() +" "+ mostrarDato(nodo.getSig());
    } 
    
    public void recorrerPila(){//recorre desde el ultimo ingresado al primero
        NodoDoble temp = inicio;
        while(temp!=null){
            //1.mostar el dato
            System.out.print(temp.getDato().toString()
            +" -> ");
            //2. cambiar el apuntador al siguiente nodo
            temp=temp.getSig();
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        
        
        
        PilaPlayer l = new PilaPlayer();
        
        l.agregarCima("uno");
        l.agregarCima("dos");
        l.agregarCima("tres");
        System.out.println("muestra la lista con los 3 elementos");
        System.out.println(l.mostrarDato(l.inicio));
        
        l.eliminarCima();
        
        System.out.println(l.mostrarDato(l.inicio));
        
    }
    
    
}
