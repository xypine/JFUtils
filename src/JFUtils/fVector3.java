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

package JFUtils;

/**
 *
 * @author Jonnelafin
 */
public class fVector3 implements java.io.Serializable{
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
    public fVector3(float nx, float ny, float nz){
        this.x = nx;
        this.y = ny;
        this.z = nz;
        this.identifier = (int) (Math.random() * 10000);
    }
    public static fVector3 add(fVector3 one, fVector3 two){
        float nx = one.x + two.x;
        float ny = one.y + two.y;
        float nz = one.z + two.z;
        return(new fVector3(nx, ny, nz));
    }
    public static fVector3 subtract(fVector3 o, fVector3 t){
        return(new fVector3(o.x - t.x, o.y - t.y, o.z - t.z));
    }
    public static fVector3 multiply(fVector3 one, fVector3 two){
        return(new fVector3(one.x * two.x, one.y * two.y, one.z * two.z));
    }
    public static fVector3 divide(fVector3 one, fVector3 two){
        return(new fVector3(one.x / two.x, one.y / two.y, one.z / two.z));
    }
    public String represent(){
        return(this.x + ", " + this.y + ", " + this.z);
    }
    public static fVector3 round(fVector3 in){
        return(new fVector3(Math.round(in.x), Math.round(in.y), Math.round(in.z)));
    }
    public static fVector3 clone(fVector3 source){
        return new fVector3(source.x, source.y, source.z);
    }
    public fVector3 swapXY(){
        fVector3 o = new fVector3(y, x, z);
        o.identifier = this.identifier;
        return o;
    }
    public fVector3 swapXY_NewID(){
        fVector3 o = new fVector3(y, x, z);
        return o;
    }
    @Override
    public fVector3 clone(){
        return new fVector3(x, y, z);
    }
    @Override
    public String toString(){
        return this.represent();
    }
    public dVector3 toDVector3(){
        return new dVector3((double)x, (double)y,(double) z);
    }
}