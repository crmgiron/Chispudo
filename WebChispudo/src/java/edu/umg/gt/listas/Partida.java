package edu.umg.gt.listas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosy Perez
 */
public class Partida {
    
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void repartirMazo(PilaPlayer p1, PilaPlayer p2, PilaPlayer p3, PilaMazo p){
        
        while(!p.estaVacia()){
            if(!p.estaVacia()){
                p1.agregarCima(p.eliminarCima());
            }
            if(!p.estaVacia()){
                p2.agregarCima(p.eliminarCima());
            }
            if(!p.estaVacia()){
                p3.agregarCima(p.eliminarCima());
            }
        }
        
    }
    
    public void turno(PilaPlayer p1, PilaMazo p){
        
        p.agregarCima(p1.eliminarCima());
        
        Cards a = (Cards) p.ConsultarCima();
        if(a.getNumb()==contador){
            
        }
        contador++;
    }
}
