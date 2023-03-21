/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
public class SachinBhaisab {
   

    private int c = 1;
    private int a = 2;
    
    public int one (int a, int b) {
    
        c = a * 2;
        a = 3 + b;
        b = b + 1;

        System.out.println("One: " + a + "," + b + "," + c);
        return b;
    }

    public int two (int a, int b) {
    
        c = one (b, a);
        this.a = a + 1;
        System.out.println("Two: " + a + "," + b + "," + c);
        return a;
   }
   
    public static void main(String[ ] args) {
    
        SachinBhaisab s = new SachinBhaisab();
        int a = 4; 
        int b = 5;

        b = s.two (a, b);
        System.out.println("Main: " + s.a + "," + b + "," + s.c);
   }

}
