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
public class PointOnLine extends GeoStatement {
    public Point point;
    public Line line;
    
    public PointOnLine(Point p, Line l){
        super("Point on line");
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
    
}
