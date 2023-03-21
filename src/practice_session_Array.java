
import java.util.Scanner;

public class practice_session_Array {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      /*  float[] marks = new float[5];
       
        System.out.println("enter the five marks");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextFloat();
        }
        float sum = 0.0f;
        for(float elements:marks)
        {
            System.out.println("i am differnt for loop");
            sum=sum+elements;
        }
        System.out.println("sum is "+sum);
        for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }
        System.out.println("sum is" + sum);*/
      
/*      float []marks={45.7f,65.9f,85f,93f,87f};
      float n;
        System.out.println("enter number you want to check");
        
      n=sc.nextFloat();
      boolean isinarray= false;
      for(int i=0;i<5;i++){
          if(n==marks[i]){
             // System.out.println("number is presrnt in array");
              isinarray=true;
              break;
          }
      }
          if(isinarray)
          {
                            System.out.println("number is presrnt in array");

          }
          else
          {
                            System.out.println("number is not presrnt in array");

          }*/

//question 3
     /*   float sum=0;
        float []marks={45.7f,65.9f,85f,93f,87f};
         for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }
         System.out.println("the average marks is "+sum/marks.length);*/
     
         //question 4  matrix adding 
         
       /*  int [][]mat1={{1,2,3},{4,5,6}};
         int [][]mat2={{7,8,9},{10,11,12}};
         int [][]result={{0,0,0},{0,0,0}};
         
         for(int i=0;i<mat1.length;i++)
         {
             for(int j=0;j<mat1[i].length;j++)
             {
                 System.out.format("setting value for i=%d and j=%d",i,j);
                 result[i][j]=mat1[i][j]+mat2[i][j];
             }
             System.out.println();
         }
           for(int i=0;i<mat1.length;i++)
         {
             for(int j=0;j<mat1[i].length;j++)
             {
                 System.out.print(result[i][j]+" ");
             }System.out.println();
         }*/
       
       //question 5
     
    /*int []arr={3,4,5,6,7,8,55};
  
    int l=arr.length;
      int a=  Math.floorDiv(l,2);
      int temp;
for(int i=0;i<a;i++)
{
    //swap a[i]and a[length-1-i]
temp=arr[i];
arr[i]=arr[l-1-i];
arr[l-1-i]=temp;

}    
for(int elements:arr)
{
    System.out.println(elements);
}
    */
    
   /* int []arr={3,4,5,876,7,8,55};
    int max=0;
    for(int e:arr)
    {
        if(e>max)
        {
            max=e;
        }
    }
        System.out.println("the maximum value in arr is "+max);*/
   
   /*int []arr={3,4,5,1,7,8,55};
   int min=239954495;
   for(int v:arr)
   {
       if(v<min)
       {
           min=v;
       }
   }
        System.out.println("min value is "+min);
   */
   
   int []arr={1,7,8,55,78};
   int v=0;
   boolean issorted=true;
   for(int i=0;i<arr.length-1;i++)
   {
       if(arr[i]>arr[i+1])
       {
           issorted=false;
       break;}
   }
   if(issorted)
   { System.out.println("yes ");}
   else
   {System.out.println("not sorted");}
    }
}
