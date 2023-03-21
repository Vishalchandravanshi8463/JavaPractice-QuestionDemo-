
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
class myException extends Exception {
//@override

    public String toString() {
        return " to String ";
    }

    public String getMessage() {
        return  "i am getMessage()";
    }
}

public class EXCEPTION_CLASS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        if (a < 9) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
