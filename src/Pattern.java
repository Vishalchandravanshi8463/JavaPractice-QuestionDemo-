
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the row ");
        n = sc.nextInt();

        int m;
        System.out.println("enter the column ");
        m = sc.nextInt();
        //problem 1   
        //***
        //***
        /*   for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("* ");
            }System.out.println("");
        }*/
        //problem 2 
        //*****
        //*   *
        //*****
        /*for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=m;j++){
             if(i==1||j==1||i==n||j==m)
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            
         }
                System.out.println("");
     }*/
        //problem 3 
        //*
        //**
        //***
        /*   for(int i=0;i<n;i++)
     {
         for(int j=0;j<=i;j++)
         {
             System.out.print("* ");
         }System.out.println("");
     }*/
        //problem 4
        //****
        //***
        //**
        //*
        /* for(int i=n;i>=1;i--)
  {
      for(int j=1;j<=i;j++){
          System.out.print("* ");
      }System.out.println("");
  }*/

        //problem 5
        //    *
        //   **
        //  ***
        // ****
      /*  for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println("");
        }*/
      
      //problem no 6
      //1
      //1 2
      //1 2 3
      //1 2 3 4
     /* for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j);
          }
          System.out.println(" ");
      }*/
     
     //problem no 7
     //1 2 3 4 5
     //1 2 3 4
     //1 2 3
     //1 2
     //1
   /*  for(int i=n;i>0;i--)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(j+" ");
         }
         System.out.println(" ");
     }*/
   
   
   //problem 8
   //1
   //2 3 
   //4 5 6 
   //7 8 9 10

  
    }

}
