/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvept;

/**
 *
 * @author HELLO
 */
public class SolvePT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PTB1 pt1 = new PTB1(5, 2);
        System.out.println(pt1);
        
        PTB2 pt2 = new PTB2(4, 8, -3);
        System.out.println(pt2);
        
        PTB3 pt3 = new PTB3(5, 7, 12, 86);
        System.out.println(pt3);
        
        PTB3 pt4 = new PTB3(0, 6, 15, 55);
        System.out.println(pt4);
    }
}
