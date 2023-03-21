
//import java.util.Scanner;
public class string_14 {

    public static void main(String[] args) {
        String name = "Vishal";
        /* System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        
        String  nonTrimmedString=" vishal ";
        System.out.println(nonTrimmedString);*/

        System.out.println(name);
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace('s', 'p'));
        System.out.println(name.replace("hal", "par"));

        System.out.println(name.startsWith("Vis"));
        System.out.println(name.endsWith("Vishal"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("al"));
          
        System.out.println(name.equals("Vishal"));
        System.out.println(name.equalsIgnoreCase("vishal"));
            
        System.out.println("i am escape sequently \" double \n quote");
    }
}
