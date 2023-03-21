
import java.util.Scanner;

public class Switch_18 {

    public static void main(String[] args) {
       


        int button;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1 for addition ");
        System.out.println("2 for subtraction ");
        System.out.println("3 for multiplication ");
        System.out.println("4 for divide ");
        
        button= sc.nextInt();
         System.out.println("enter the number you want to perform action");
        int a=sc.nextInt();
        int b=sc.nextInt();
       switch(button){
            
            case 1:
               
                System.out.println("addition is "+(a+b));
                break;
            case 2:
                
                System.out.println("subtraction is  "+(a-b));
                break;
            case 3:
                System.out.println("multiplication is "+a*b);
                break;
                case 4:
                System.out.println("divide  is "+a/b);
                break;
            default:
                System.out.println("click right button ");
                break;

        }
    }}
//        System.out.println("enter your character");
//        String s="vishal";
//        
//        switch (s) {
//            case "harry":
//                System.out.println("you are going to became a adult");
//                break;
//            case "shubham":
//                System.out.println("you are going to join a job ");
//                break;
//            case "vishal":
//                System.out.println("you are going to get retired ");
//                break;
//            default:
//                System.out.println("enjoy your life ");
//                break;
//
//        }
//        /*   if(age>20)
//        {
//            System.out.println("you are experienced");
//            
//        }
//        else if(age>15)
//        {
//            System.out.println("you are semi experienced");
//            
//        }
//        else {
//            System.out.println("you are not");
//        }*/
   // }
//}
