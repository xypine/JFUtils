/*
 * The MIT License
 *
 * Copyright 2020 Elias Eskelinen.
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
public class Point2F extends Point2Int implements java.io.Serializable{
    
    public int identifier;
    public float x;
    public float y;
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
    public Point2F(float nx, float ny){
        super((int) nx, (int) ny);
        this.x = nx;
        this.y = ny;
        Random r = new Random();
        
        this.identifier = (int) (r.nextLong());
    }
    public static Point2F add(Point2F one, Point2F two){
        float nx = one.x + two.x;
        float ny = one.y + two.y;
        return(new Point2F(nx, ny));
    }
    public static Point2F subtract(Point2F o, Point2F t){
        return(new Point2F(o.x - t.x, o.y - t.y));
    }
    public static Point2F multiply(Point2F one, Point2F two){
        return(new Point2F(one.x * two.x, one.y * two.y));
    }
    public static Point2F divide(Point2F one, Point2F two){
        return(new Point2F(one.x / two.x, one.y / two.y));
    }
    @Override
    public String represent(){
        return(this.x + ", " + this.y);
    }
    public static Point2F round(Point2F in){
        return(new Point2F(Math.round(in.x), Math.round(in.y)));
    }
    public static Point2F clone(Point2F source){
        return new Point2F(source.x, source.y);
    }
    @Override
    public Point2F clone(){
        return new Point2F(x, y);
    }
    @Override
    public String toString(){
        return this.represent();
    }
}