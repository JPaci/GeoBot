/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
        
public class GeoBot {
    
    
    
    public ArrayList<GeoObject> objects = new ArrayList<>();
    
    
    
    public void addObject(GeoObject o){
        objects.add(o);
    }
    
    public void applyProperties(){
        
    }

    
    public static void main(String[] args) {
        System.out.println("Input an operation");
	     Scanner input = new Scanner(System.in);
	     String in = input.nextLine();
	     String[] procArray = new String[in.length()];
	     procArray = in.split(" ");
	     List<String> inputList = Arrays.asList(procArray);
	     System.out.println(inputList);
	     if(inputList.indexOf("=") != -1){
	    	 
	     }

        
        
        
        /*
        * @Paci I'll start by copy-pasting in my processing code so you can see it
        * It's WIP so the only part that's complete is the cutting up of the string
        */
        
        
        }
        
    }
    

    
