/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;

import java.util.Scanner;

public class GeoBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @Will I guess if you want to start making input parsing you could.
         * 
         * I just have some code here to test how points and lines are working.
         * 
         */
         
        GeoObject Zed = new GeoObject("Pinochet 3000", "Helicpoter");
        System.out.println(Zed.getName());
        
        Point A = new Point("A");
        System.out.println(A.getName());
        
        Point B = new Point("B");
        System.out.println(B.getName());
        
        Point C = new Point("C");
        
        Line AB = new Line(A, B);
        System.out.println(AB.getName());
        
        PointOnLine Pol = new PointOnLine(C, AB);
        Pol.process();
        System.out.println(AB.getCollinearPoints()[0]);
        
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
    

