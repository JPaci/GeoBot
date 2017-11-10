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
public class GeoObject {
    public String type;
    public String name;
    HashSet<GeoObject> equalities = new HashSet<GeoObject>();
	
    public GeoObject(String object_name, String object_type){
        type = object_type;
        name = object_name;
    }
    public String getName(){
        return(type + " " + name.toUpperCase());
    }
    
    public String toString(){
        return(name);
    }
    
    public void equality(GeoObject inputObj){
    	equalities.add(inputObj);
	equalities.addAll(inputObj.equalities);
	inputObj.equalities.add(this);
	inputObj.equalities.addAll(equalities);
	inputObj.equalities.remove(inputObj.equalities.size() - 1);
    }    
}

