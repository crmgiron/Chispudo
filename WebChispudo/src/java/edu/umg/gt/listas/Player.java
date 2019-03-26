/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.gt.listas;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Rosy Perez
 */
public class Player implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String id;
    
    private String name;

    private String ip;

    public Player(String name, String ip) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.ip = ip;		
    }

    public String getId(){
            return id;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getIp() {
            return ip;
    }

    public void setIp(String ip) {
            this.ip = ip;
    } 

    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((ip == null) ? 0 : ip.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
    }

    @Override
    public boolean equals(Object obj) {
            if (this == obj)
                    return true;
            if (obj == null)
                    return false;
            if (!(obj instanceof Player))
                    return false;
            Player other = (Player) obj;
            if (ip == null) {
                    if (other.ip != null)
                            return false;
            } else if (!ip.equals(other.ip))
                    return false;
            if (name == null) {
                    if (other.name != null)
                            return false;
            } else if (!name.equals(other.name))
                    return false;
            return true;
    }

    @Override
    public String toString() {
            return name;
    }

    
}
