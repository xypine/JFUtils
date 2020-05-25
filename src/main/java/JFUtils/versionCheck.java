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
 * @author Elias Eskelinen (Jonnelafin)
 */
public class versionCheck {
    public static double version = 3.45;
    public static void throwException(String yourprogram, double needed){
        String clink = "https://github.com/jonnelafin/JFUtils/releases";
        String link = "<a href='"+clink+"'>"+clink+"</a>";
        String msg = yourprogram + " depends on JFUtils version [" + needed + "], but version [" + version + "] is being used, please download the required version from: ";
        quickTools.alert("version check failed","<html>" +  msg + link + "</html>");
        throw new UnsupportedClassVersionError(msg + clink);
    }
    public static void throwException(double needed){
        throwException("this program", needed);
    }
}
