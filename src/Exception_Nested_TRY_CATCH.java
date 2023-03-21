
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vishal chandravanshi
 */
public class Exception_Nested_TRY_CATCH {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        System.out.println("enter the ind nu ");
        int ind = sc.nextInt();
        System.out.println("enter the number ");
        int number = sc.nextInt();
        try {
            System.out.println("welcome to 1 try");
            try {
                System.out.println("ind lets see" + a[ind] / number);

            } catch (ArithmeticException e) {
                System.out.println("arithmetic Exception occur ");
                System.out.println("no problem plz try again with valid number ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException exception occur ");
            System.out.println("level 2 ");
        }

    }
}
