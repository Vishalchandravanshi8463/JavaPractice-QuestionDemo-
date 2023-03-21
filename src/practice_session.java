
import java.util.Scanner;

public class practice_session {

    public static void main(String[] args) {
        //problem 1
        String name = "VISHAL CHANDRAVANSHI ";
                System.out.println("what is the result "+name);

      
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text = "To lower case    ";
        text = text.replace(" ", "_");
        System.out.println(text);
        
        //problem 3
        String letter="Dear <|name|>, thanks a lot";
        letter=  letter .replace("<|name|>","vishal");// letter .replace("<|name|>","vishal");   not change because string never change 
                System.out.println(letter);//now its work 
                
                //problem 4
 
                String myString ="this string contains  double and triple   spaces";
                System.out.println(myString.indexOf("  "));
                                System.out.println(myString.indexOf("   "));
                                
                                //problem 5

                                String myletter="Dear Vishal,\n \t this java course is nice .\n \t thanks!";
                                System.out.println(myletter);
                                
    }

}
