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
    
    public ArrayList<GeoObject> objects = new ArrayList<GeoObject>();
    public HashSet<GeoStatement> statements = new HashSet<GeoStatement>();
    
    public void addStatement(GeoStatement s){
        statements.add(s);
    }
    
    public void applyProperties(){
        for(GeoStatement s : statements){
            s.process(this);
        }
    }

    
    public static void main(String[] args) {
        
        Point A = new Point("A");
        Point B = new Point("B");
        Point C = new Point("C");
        
        Line AC = new Line(A, C);
        
        
        /*
        * @Paci I'll start by copy-pasting in my processing code so you can see it
        * It's WIP so the only part that's complete is the cutting up of the string
        */
        System.out.println("Input an operation");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        in.replaceAll("\\s", " ");
        int procLength = in.length();
        String[] procArray = new String[procLength];
        procArray = in.split(" ");
        in.replaceAll("\\s", "");
        int mainLength = in.length();
        String[] mainArray = new String[mainLength];
        for(int j = 0; j < mainLength; j++){
           mainArray[j] = procArray[j];
        }
        
        }
        
    }
    

