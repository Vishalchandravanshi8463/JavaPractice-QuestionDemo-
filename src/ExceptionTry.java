
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vishal chandravanshi
 */
public class ExceptionTry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1000;
        System.out.println("enter the value");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("output is " + c);
        } catch (Exception e) {

            System.out.println("somthing wrong ");
            System.out.println(e);
        }
        System.out.println("end of the program");

    }
}
