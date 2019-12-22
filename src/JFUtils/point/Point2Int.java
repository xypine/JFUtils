/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFUtils.point;

import JFUtils.point.Point2D;

/**
 *
 * @author Jonnelafin
 */
public class Point2Int implements java.io.Serializable{
    public float x;
    public float y;
    public Point2Int(float nx, float ny){
        this.x = nx;
        this.y = ny;
    }
    public static Point2Int add(Point2Int one, Point2Int two){
        float nx = one.x + two.x;
        float ny = one.y + two.y;
        return(new Point2Int(nx, ny));
    }
    public static Point2Int subtract(Point2Int o, Point2Int t){
        return(new Point2Int(o.x - t.x, o.y - t.y));
    }
    public static Point2Int multiply(Point2Int one, Point2Int two){
        return(new Point2Int(one.x * two.x, one.y * two.y));
    }
    public static Point2Int divide(Point2Int one, Point2Int two){
        return(new Point2Int(one.x / two.x, one.y / two.y));
    }
    public String represent(){
        return(this.x + ", " + this.y);
    }
    public static Point2Int round(Point2Int in){
        return(new Point2Int(Math.round(in.x), Math.round(in.y)));
    }
    public static Point2Int norm(int x, int y){
        return new Point2Int(x/(x^2 + y^2)^(1/2), y/(x^2 + y^2)^(1/2));
    }
    public static Point2D[] dir(){
            Point2D[] dirs = new Point2D[8];
            dirs[0] = new Point2D(0.0,1.0);
            dirs[1] = new Point2D(1.0,1.0);
            dirs[2] = new Point2D(1.0,0.0);
            dirs[3] = new Point2D(-1.0,-1.0);
            dirs[4] = new Point2D(0,-1.0);
            dirs[5] = new Point2D(-1.0,-1.0);
            dirs[6] = new Point2D(-1.0,0);
            dirs[7] = new Point2D(-1.0,1);
            return dirs;
    }
}
class Vector3{
    public float x;
    public float y;
    public float z;
    public Vector3(float nx, float ny, float nz){
        this.x = nx;
        this.y = ny;
        this.z = nz;
    }
}
