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
    
    public void process(GeoBot problem){
        Point[] line_points = line.getCollinearPoints();
        Line line_one = new Line(line_points[0], point);
        Line line_two = new Line(point, line_points[1]);
        problem.addObject(line_one);
        problem.addObject(line_two);
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
