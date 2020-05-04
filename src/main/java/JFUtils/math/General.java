/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFUtils.math;

import JFUtils.point.Point2D;
import JFUtils.point.Point3D;

/**
 *
 * @author Elias Eskelinen (Jonnelafin)
 */
public class General {

    /**
     * Returns the distance between points a and b
     * @param a 2D point a
     * @param b 2D point b
     * @return distance
     */
    public static double distance(Point2D a, Point2D b){
        double out = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.x - b.x, 2));
        return out;
    }
    public static Point3D average(Point3D a, Point3D b, int id){
        double x = (a.x + b.x) / 2D;
        double y = (a.y + b.y) / 2D;
        double z = (a.z + b.z) / 2D;
        Point3D out = new Point3D(x, y, z);
        out.identifier = id;
        return out;
    }
}
