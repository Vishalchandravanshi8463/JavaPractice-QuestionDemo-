import java.util.Random;
import java.util.Scanner;

 class Game{
     
    public int number;
    public int inputnumber;
    public int numberGuesse=0;

   /* public int getNumberGuesses() {
        return numberGuesse;
   
    }
    public void setNumberGuesse(int numberGuesses) {
        this.numberGuesse = numberGuesses;
    }*/
     Game(){
        Random rand =new Random();
        
        this .number =rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the number ");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
      
    }
    boolean isCorrect(){
        numberGuesse++;
        if(inputnumber==number){
             System.out.format("you gess the correct number %d \n you guess it in %d attempt ",number,numberGuesse
       );
            return true;
           
        }
        else if(inputnumber<number){
            System.out.println("too less ");
        }
         else if(inputnumber>number){
            System.out.println("too high ");
        }
        return false;
    }
}
public class Practice_session_43_OOPS {
    
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
        
        g.takeUserInput();
         b=g.isCorrect();
      //  System.out.println(b);
        }
    }
}
