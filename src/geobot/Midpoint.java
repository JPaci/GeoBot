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
public class Midpoint extends GeoStatement{
    public Point point;
    public Line line;
    
    public Midpoint(Point p, Line l, GeoStatement[] causes){
        super("Midpoint", causes);
        point = p;
        line = l;    
        
    }
    
    public String toString(){
        return(point + " is the midpoint of " + line + ". Reason: " + premises[0]);
    }
    
    public void process(GeoBot problem){
        GeoStatement thisarr[] = {this};
        PointOnLine pol = new PointOnLine(point, line, thisarr);
        problem.addStatement(pol); // A mid BC implies A on BC
        
    }
    
}
