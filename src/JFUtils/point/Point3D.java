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
public class Point3D implements java.io.Serializable{
    public int identifier;
    public double x;
    public double y;
    public double z;
    public int intX(){
        return (int) Math.round(x);
    }
    public int intY(){
        return (int) Math.round(y);
    }
    public int intZ(){
        return (int) Math.round(z);
    }
    public Point3D(double nx, double ny, double nz){
        this.x = nx;
        this.y = ny;
        this.z = nz;
        Random r = new Random();
        
        this.identifier = (int) (r.nextLong());
    }
    public static Point3D add(Point3D one, Point3D two){
        double nx = one.x + two.x;
        double ny = one.y + two.y;
        double nz = one.z + two.z;
        return(new Point3D(nx, ny, nz));
    }
    public static Point3D subtract(Point3D o, Point3D t){
        return(new Point3D(o.x - t.x, o.y - t.y, o.z - t.z));
    }
    public static Point3D multiply(Point3D one, Point3D two){
        return(new Point3D(one.x * two.x, one.y * two.y, one.z * two.z));
    }
    public static Point3D divide(Point3D one, Point3D two){
        return(new Point3D(one.x / two.x, one.y / two.y, one.z / two.z));
    }
    public String represent(){
        return(this.x + ", " + this.y + ", " + this.z);
    }
    public static Point3D round(Point3D in){
        return(new Point3D(Math.round(in.x), Math.round(in.y), Math.round(in.z)));
    }
    public static Point3D clone(Point3D source){
        return new Point3D(source.x, source.y, source.z);
    }
    public Point3D swapXY(){
        Point3D o = new Point3D(y, x, z);
        o.identifier = this.identifier;
        return o;
    }
    public Point3D swapXY_NewID(){
        Point3D o = new Point3D(y, x, z);
        return o;
    }
    @Override
    public Point3D clone(){
        return new Point3D(x, y, z);
    }
    @Override
    public String toString(){
        return this.represent();
    }
    public Point3F toFVector3(){
        return new Point3F((float)x, (float)y,(float) z);
    }
}