/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;

/**
 *
 * @author Joseph
 */
public class Equality extends GeoStatement{
    public GeoObject term_one;
    public GeoObject term_two;
    
    public Equality(GeoObject term_1, GeoObject term_2, GeoStatement[] causes){
        super("Equality", causes);
        term_one = term_1;
        term_two = term_2;        
        
    }
    
    public String toString(){
        return(term_one + " = " + term_two + " Reason:" + premises[0]);
    }
    
    public void process(){
        
    }
    
}
