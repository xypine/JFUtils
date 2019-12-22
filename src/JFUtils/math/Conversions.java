/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFUtils.math;

/**
 *
 * @author Elias Eskelinen (Jonnelafin) <elias.eskelinen@protonmail.com>
 */
public class Conversions {
    public static float toRadians(float degrees){
        return (float) (degrees * (Math.PI /180F));
    }
    public static float toDegrees(float radians){
        return (float) (radians * (180F / Math.PI));
    }
}
