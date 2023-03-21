
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
public class Exception_new_new {

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
            System.out.println("array value of ind is " + a[ind]);
            System.out.println("number divided is " + a[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception is occured ");
            System.out.println(e);
        } //        } catch(ArrayOutOfBoundException e) {
        //            System.out.println("arithmetic exception is occured ");
        //            System.out.println(e);
        //        } 
        catch (Exception e) {
            System.out.println("other exception is  ");
            System.out.println(e);
        }

    }

}
