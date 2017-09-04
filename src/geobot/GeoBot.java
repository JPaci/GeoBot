/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;


public class GeoBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @Will I guess if you want to start making input parsing you could.
         * 
         * I just have some code here to test how points are working.
         * 
         */
        
        
        GeoObject Zed = new GeoObject("Pinochet 3000", "Helicpoter");
        System.out.println(Zed.getName());
        
        Point A = new Point("A");
        System.out.println(A.getName());
        
        Point B = new Point("B");
        System.out.println(B.getName());
        
        Line AB = new Line(A, B);
        System.out.println(AB.getName());
        
    }
    
}
