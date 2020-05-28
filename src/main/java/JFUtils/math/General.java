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
     * @return distance between the points
     */
    public static double distance(Point2D a, Point2D b){
        double out = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
        return out;
    }
    /**
     * Returns the distance between points a and b
     * @param a 3D point a
     * @param b 3D point b
     * @return distance between the points
     */
    public static double distance(Point3D a, Point3D b){
        double out = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2));
        return out;
    }
    //math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2 + (z1 - z2) ** 2)
    
    
    public static Point3D average(Point3D a, Point3D b, int id){
        double x = (a.x + b.x) / 2D;
        double y = (a.y + b.y) / 2D;
        double z = (a.z + b.z) / 2D;
        Point3D out = new Point3D(x, y, z);
        out.identifier = id;
        return out;
    }

    /**
     *
     * @param x value to map
     * @param in_min original min value
     * @param in_max original max value
     * @param out_min returned min value
     * @param out_max returned min value
     * @return mapped value
     */
    public static long map(long x, long in_min, long in_max, long out_min, long out_max)
    {
      return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
}
