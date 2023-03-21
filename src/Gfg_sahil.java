import java .util.*;

public class Gfg_sahil {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int count=0;
        int c=0;
         for(int i=0;i<n;i++)
    {
        count=0;
        for(int j=i;j<n;j++)
        {
            count+=arr[j];
            c+=j;
           // System.out.print(count+" ");
        }
       
        
    }
         System.out.println(c);
    }
}
