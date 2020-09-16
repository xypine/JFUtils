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

package JFUtils.audio;

import JFUtils.dirs;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author Jonnelafin
 */
public class test extends JFrame{
    public static void main(String[] args) {
        new test();
    }
    public JSlider vol;
    public JSlider pan;
    public test(){
        this.setSize(300, 300);
        this.setTitle("JFUtils Audiotest");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        vol = new JSlider(0, 100, 50);
        pan = new JSlider(-100, 100, 0);
        this.add(vol);
        this.add(pan);
        
        this.setVisible(true);
        
        AudioPlayer t = new AudioPlayer();
        AudioClip l = new AudioClip(new dirs().music + "test.wav");
        t.playSound(l, 1);
        int volume = 100;
        boolean play =true;
        
        t.setLooping(true);
        while (play) {            
            t.setVolume(vol.getValue()/100F);
            t.setPAN(pan.getValue());
        }
        t.setLooping(false);
        //t.playSound(l, volume / 100F);
        //volume = volume - 10;
        //play = false;
//        for(int i : new Range(100)){
//            t.setVolume(1F - (i / 100F));
//            System.out.println(t.getVolume());
//            //System.out.println(1F - (i / 50F));
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        t.setLooping(false);
        //SwingUtilities.invokeLater(() -> {
            // A GUI element to prevent the Clip's daemon Thread
            // from terminating at the end of the main()
        //    JOptionPane.showMessageDialog(null, "Close to exit!");
        //});
    }
}
