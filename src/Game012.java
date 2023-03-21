import java.util.*;
import java.util.Scanner;
public class Game012 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for Rock,1 for Paper ,2 for Scissor");
        int userInput =sc.nextInt();
        Random random;
        random = new Random();
        int bound;
        int computerInput;
        computerInput = random.nextInt(3);
        if (userInput==computerInput){
            System.out.println("Draw");
            
        }
        else if(userInput==0&&computerInput==2||userInput==1&&computerInput==0
                ||userInput==2&&computerInput==1)
        {
            System.out.println("you win");
        }
        else{
            System.out.println("computer win");
        }
        System.out.println("computerChoice"+computerInput);
    }
}
