package geobot;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class PointOnLine extends GeoStatement {
    public Point point;
    public Line line;
    
    public PointOnLine(Point p, Line l, GeoStatement[] causes){
        super("Point on line", causes);
        point= p;
        line = l;
      
    }
    
    public void process(){
        for(Point p : line.getCollinearPoints()){
            if(p.equals(point)){
                return;
            }
        }
        line.addCollinearPoint(point);
    }
    public String toString(){
        return(point + " is on " + line + ". Reason: " + premises[0]);
    }
    
}
