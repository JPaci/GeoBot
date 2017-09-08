package geobot;

import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class GeoStatement {
    public String type;
    public GeoStatement[] premises;
    
    public GeoStatement(String given_type, GeoStatement[] premise){
        type = given_type;
        premises = premise;
    }
    
    public void process(){
        
    }
    
    public String toString(){
        return(type);
    }
    
    
}
