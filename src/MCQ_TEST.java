/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.io.*;
public class MCQ_TEST {


    public static void main(String[] args) {
        int Integer=10;
        char String='j';
        System.out.println(Integer+" "+String);
        Child c=new Child();
//        int a=10;b=5;
//        System.out.println(a/b);
          try
          {
              System.out.println("hello");
          }
          catch(Exception e)
          {
              System.out.println("world");
          }
         
        
        
    }
}
 class Parent
    {
        Parent()
        {
            System.out.println("i am vishal");
        }
    }
    class Child extends Parent
    {
        Child()
        {
            System.out.println("i am vicky ");
        }
    }