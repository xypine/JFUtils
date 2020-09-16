/*
 * The MIT License
 *
 * Copyright 2020 Elias.
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

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Jonnelafin
 */
public class AudioPlayer {
    private float volume = 100;
    public synchronized float getVolume(){
        return volume;
    }
    public synchronized void setVolume(float val){
        this.volume = val;
    }
    private float pan = 0;
    public synchronized float getPAN(){
        return pan;
    }
    public synchronized void setPAN(float val){
        this.pan = val;
    }
    
    private boolean loop = false;
    public synchronized boolean isLooping(){
        return loop;
    }
    public synchronized void setLooping(boolean val){
        this.loop = val;
    }
    
    public synchronized void setClip(Clip p){
        this.playingClip = p;
    }
    public Clip playingClip;
    public synchronized Clip getClip(){
        return playingClip;
    }
    public synchronized void playSound(AudioClip sfx, float Vol){
        //this.playingClip = sfx;
        Clip clip;
        try {
            clip = AudioSystem.getClip();
             setClip(clip);
             //setVol(getVolume(), clip);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
        setVolume(Vol);
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    AudioInputStream stream = sfx.getAudioStream();
                    Clip clip = AudioSystem.getClip();
                    setClip(clip);
                    //playingClip = 
                    clip.open(stream);
                    int p = 1;
                    setVol(getVolume(), clip);
                    setPAN(getPAN(), clip);
                            clip.start();
                    while(true){
                        setVol(getVolume(), clip);
                        setPAN(getPAN(), clip);
                        if( (isLooping() || p < 1)){
                            
                            clip.loop(1);
                            p = p + 1;
                        }
                        else{
                            break;
                        }
                        Thread.sleep(10);
                    }
                    System.out.println("Shutting down used audiosystem...");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }; thread.start();
    }
    public static synchronized void setVol(double Vol, Clip clip){
        FloatControl gain = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        float dB = (float) (Math.log(Vol) / Math.log(10) * 20);
        gain.setValue(dB);
    }
    public static synchronized void setPAN(double PAN, Clip clip){
        try {
            FloatControl gain = (FloatControl) clip.getControl(FloatControl.Type.PAN);
            gain.setValue((float) PAN);
        } catch (Exception e) {
            System.out.println("PAN not supported");
            e.printStackTrace();
        }
    }
}
