/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFUtils.math;

/**
 *
 * @author Elias Eskelinen (Jonnelafin)
 */
public class Conversions {

    /**
     * Converts degrees to radians
     * @param degrees degrees to convert
     * @return input in radians
     */
    public static float toRadians(float degrees){
        return (float) (degrees * (Math.PI /180F));
    }

    /**
     * Converts radians to degrees
     * @param radians radians to convert
     * @return input in degrees
     */
    public static float toDegrees(float radians){
        return (float) (radians * (180F / Math.PI));
    }
    
    /**
     *
     * @param deltaTime execution (delta) time of one cycle or "tick"
     * @return FPS (Frames Per Second)
     */
    public static float toFPS(float deltaTime){
        return (1F/deltaTime) * 1000000000;
    }

    /**
     *
     * @param deltaTime execution (delta) time of one cycle or "tick"
     * @return CPNS (Cycles Per Nanosecond)
     */
    public static float toCPNS(float deltaTime){
        return (1F/deltaTime);
    }
}
