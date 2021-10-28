/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitjegorbakunin4.pkg2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jegor Bakunin
 */
public class JUnitJegorBakunin42Test {
    @Test
     /* квадратное уравнение не имеет решения */
    public void testNoSolutions() {
        assertNull("нет решений",
                JUnitJegorBakunin42.solve(1, 1, 1));
    }
    @Test
    /* квадратное уравнение имеет только одно решение */
    public void testOneSolution() {
        assertArrayEquals("одно решение",
                new double[]{1},
                JUnitJegorBakunin42.solve(1, -2, 1), 0.001);
    }
    
    @Test
    /* квадратное уравнение имеет два решения */ 
    public void testTwoSolutions() {
        assertArrayEquals("Два решения",
                new double[]{-1, 3},
                JUnitJegorBakunin42.solve(-1, 2, 3), 0.001);
    }
}
