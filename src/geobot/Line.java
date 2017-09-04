/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;


import java.util.HashSet;
/**
 *
 * @author Joseph
 */
public class Line extends GeoObject {
    
    public Point[] points;
    HashSet<Point> collinear_points = new HashSet<Point>();
    
    public Line(Point start_point, Point end_point){
        super(start_point.toString() + end_point.toString(), "Line");
        Point[] points  = new Point[2];
        collinear_points.add(start_point);
        collinear_points.add(end_point);
        System.out.println(collinear_points == null);
    }    
    public void addCollinearPoint(Point p){
        collinear_points.add(p);
               
    }
    
    public Point[] getCollinearPoints(){
        int count;
        count = 0;
        Point[] return_points = new Point[collinear_points.size()];
        
        for(Point p : collinear_points){
            return_points[count] = p;
            count++;
        }
        return(return_points);
        }
        
    }

