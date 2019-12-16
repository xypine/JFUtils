/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFUtils;

/**
 *
 * @author Elias Eskelinen <elias.eskelinen@protonmail.com>
 */
public class math {
    public static double distance(Point2D a, Point2D b){
        double out = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.x - b.x, 2));
        return out;
    }
}
