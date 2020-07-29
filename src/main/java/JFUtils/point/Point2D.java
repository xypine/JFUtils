/*
 * The MIT License
 *
 * Copyright 2019 Elias Eskelinen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package JFUtils.point;

import java.util.Random;

/**
 *
 * @author Elias Eskelinen (Jonnelafin)
 */
public class Point2D extends Point2Int implements java.io.Serializable{
    
    public int identifier;
    public double x;
    public double y;
    public int intX(){
        return (int) Math.round(x);
    }
    public int intY(){
        return (int) Math.round(y);
    }

    /**
     * A simple 2D point with an identifier
     * @param nx x value of the point
     * @param ny y value of the point
     */
    public Point2D(double nx, double ny){
        super((int) nx, (int) ny);
        create(nx, ny);
    }

    public Point2D() {
        super((int) 0, (int) 0);
        create(0, 0);
    }
    
    public Point2D(int both){
        super((int) both, (int) both);
        create(both, both);
    }
    
    protected void create(double nx, double ny){
        this.x = nx;
        this.y = ny;
        Random r = new Random();
        
        this.identifier = (int) (r.nextLong());
    }
    
    public static Point2D add(Point2D one, Point2D two){
        double nx = one.x + two.x;
        double ny = one.y + two.y;
        return(new Point2D(nx, ny));
    }
    public static Point2D subtract(Point2D o, Point2D t){
        return(new Point2D(o.x - t.x, o.y - t.y));
    }
    public static Point2D multiply(Point2D one, Point2D two){
        return(new Point2D(one.x * two.x, one.y * two.y));
    }
    public static Point2D divide(Point2D one, Point2D two){
        return(new Point2D(one.x / two.x, one.y / two.y));
    }
    @Override
    public String represent(){
        return(this.x + ", " + this.y);
    }
    public static Point2D round(Point2D in){
        return(new Point2D(Math.round(in.x), Math.round(in.y)));
    }
    public static Point2D clone(Point2D source){
        return new Point2D(source.x, source.y);
    }
    @Override
    public Point2D clone(){
        return new Point2D(x, y);
    }
    @Override
    public String toString(){
        return this.represent();
    }
}