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
    public GeoStatement thisarr[] = {this};
    
    public Midpoint(Point p, Line l, GeoStatement[] causes){
        super("Midpoint", causes);
        point = p;
        line = l;    
        
    }
    
    public String toString(){
        return(point + " is the midpoint of " + line + ". Reason: " + premises[0]);
    }
    
    public void process(GeoBot problem){
        Point[] line_points = line.getCollinearPoints();
        Line line_one = new Line(line_points[0], point);
        Line line_two = new Line(point, line_points[1]);
        problem.addObject(line_one);
        problem.addObject(line_two);
        PointOnLine pol = new PointOnLine(point, line, thisarr);
        Equality equ = new Equality(line_one, line_two, thisarr);
        problem.addStatement(pol); // A mid BC implies A on BC
        problem.addStatement(equ); // A mid BC implies BA = AC
        
    }
    
}
