
import java.util.Scanner;

public class practice_Method35 {

    //problem 1
//}
    /*  static void table(int n){
        for(int i=1;i<=10;i++){
            
        
        System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to print table ");
        int n;
        n=sc.nextInt();
        table(n);*/
//pronlem 2
    /* static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }System.out.println("");
        }
    }
 public static void main(String[] args) {
     System.out.println("enter the number you want to print *");
   Scanner sc=new Scanner(System.in);
   int n;
   n=sc.nextInt();
     pattern(n);*/
    
    //problem 3          sum n natural number 
 /*   static int sum(int n){
        if(n==1){
            return 1;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number you want to calculate sum ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("sum is  "+sum(n));*/
    
    //problem 4 print the pattern 
    
    /*static void pattern(int n){
        for(int i=0;i<n;i++)
        {
            for (int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
       public static void main(String[] args) {
        System.out.println("enter the number you want to calculate sum ");
        Scanner sc = new Scanner(System.in);
         int n;
        n = sc.nextInt();
        pattern (n);*/
    
    //problem 5  print fibonacci series 
    //static int fibonacci(int n){
       /* if(n==1)
        {
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
       /*if(n==1||n==2)
       {
           return n-1;
       }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
     public static void main(String[] args) {
        System.out.println("enter the number you want to calculate sum ");
        Scanner sc = new Scanner(System.in);
         int n;
        n = sc.nextInt();
        int v=fibonacci(n);
         System.out.println("nth series is "+v);*/
    
    
    //problem 6  Vishal chandravanshi   pattern with recursion 
   
    
 /*   static void pattern(int n){
        if(n>0){
            pattern(n-1);
        for(int i=0;i<n;i++)
        {
          
                System.out.print("* ");
        }
            System.out.println("");
        }
    }
       public static void main(String[] args) {
        System.out.println("enter the number you want to calculate sum ");
        Scanner sc = new Scanner(System.in);
         int n;
        n = sc.nextInt();
        pattern (n);*/
    
    //problem 7 convert celsius to farenite
    static float infer(float n){
        return n*1.8f+32f;
    }
    public static void main(String[] args) {
        System.out.println("enter the celsius");
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.println(n+" in fahrenheit is "+infer(n));
    
     }
}
