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
public class Point3F implements java.io.Serializable{
    public int identifier;
    public float x;
    public float y;
    public float z;
    public int intX(){
        return Math.round(x);
    }
    public int intY(){
        return Math.round(y);
    }
    public int intZ(){
        return Math.round(z);
    }
    public Point3F(float nx, float ny, float nz){
        this.x = nx;
        this.y = ny;
        this.z = nz;
        Random r = new Random();
        
        this.identifier = (int) (r.nextLong());
    }
    public static Point3F add(Point3F one, Point3F two){
        float nx = one.x + two.x;
        float ny = one.y + two.y;
        float nz = one.z + two.z;
        return(new Point3F(nx, ny, nz));
    }
    public static Point3F subtract(Point3F o, Point3F t){
        return(new Point3F(o.x - t.x, o.y - t.y, o.z - t.z));
    }
    public static Point3F multiply(Point3F one, Point3F two){
        return(new Point3F(one.x * two.x, one.y * two.y, one.z * two.z));
    }
    public static Point3F divide(Point3F one, Point3F two){
        return(new Point3F(one.x / two.x, one.y / two.y, one.z / two.z));
    }
    public String represent(){
        return(this.x + ", " + this.y + ", " + this.z);
    }
    public static Point3F round(Point3F in){
        return(new Point3F(Math.round(in.x), Math.round(in.y), Math.round(in.z)));
    }
    public static Point3F clone(Point3F source){
        return new Point3F(source.x, source.y, source.z);
    }
    public Point3F swapXY(){
        Point3F o = new Point3F(y, x, z);
        o.identifier = this.identifier;
        return o;
    }
    public Point3F swapXY_NewID(){
        Point3F o = new Point3F(y, x, z);
        return o;
    }
    @Override
    public Point3F clone(){
        return new Point3F(x, y, z);
    }
    @Override
    public String toString(){
        return this.represent();
    }
    public Point3D toDVector3(){
        return new Point3D((double)x, (double)y,(double) z);
    }
}