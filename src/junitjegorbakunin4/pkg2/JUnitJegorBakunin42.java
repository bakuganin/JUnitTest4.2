/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitjegorbakunin4.pkg2;

/**
 *
 * @author Jegor Bakunin
 */

public class JUnitJegorBakunin42 {
    public static double[] solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return new double[]{(-b + Math.sqrt(d)) / 2 / a, (-b * Math.sqrt(d)) / 2 / a};
        }   else if (d == 0) {
            return new double[]{-b / 2 / a};
        } else {
            return null;
        }
    }
}