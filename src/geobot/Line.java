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
public class Line extends GeoObject {
    Point[] points;
    
    public Line(Point start_point, Point end_point){
        super(start_point.getSymbol() + end_point.getSymbol(), "Line");
    }
}
