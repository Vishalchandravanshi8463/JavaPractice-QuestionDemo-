
import java.util.*;

public class MoneyNoteCount {

    public static void main(String[] args) {

        System.out.println("enter the money which you want to count the note ");
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int p = v / 2000;
        if (v > 0) {
            System.out.println("2000 note is " + p);
        }
        v -= 2000 * p;
        int hh = v / 1000;
        if (hh > 0) {
            System.out.println("1000 note is " + hh);
        }
        v -= 1000 * hh;
        int f = v / 500;
        if (f > 0) {
            System.out.println("500 note is " + f);
        }
        v -= 500 * f;
        int h = v / 100;
        if (h > 0) {
            System.out.println("100 note is " + h);
        }
        v -= 100 * h;
        int ff = v / 50;
        if (ff > 0) {
            System.out.println("50 note is " + ff);
        }
        v -= 50 * ff;
        int t = v / 10;
        if (t > 0) {
            System.out.println("10 note is " + t);
        }
        v -= 10 * t;
        int five = v / 5;
        if (five > 0) {
            System.out.println("5 note is " + five);
        }
         v -= 5* five;
        int two = v / 2;
        if (two > 0) {
            System.out.println("2 note is " + two);
        }
        
        v -= 2 * two;
        int one = v / 1;
        if (one > 0) {
            System.out.println("1 note is " + one);
        }
        

    }
}
