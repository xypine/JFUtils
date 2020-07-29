/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFUtils;

/**
 *
 * @author Arno Elias Eskelinen
 */
public interface InputListener {
    public void handleInput(char c, int ccode, boolean status);
    public void handleMouse(int posx, int posy);
    public void handleMouseExtra(boolean pressed1, boolean pressed2, boolean pressed3, int mouseWheelState);
    public Input returnSource();
}
