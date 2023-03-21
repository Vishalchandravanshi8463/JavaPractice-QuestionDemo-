import java.util.*;
public class Array {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner s=new Scanner(System.in);
      /*  for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the value of arr["+i+"]");
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        */
        
       String []st=new String[5];
        System.out.println("enter the string ");
       for(int i=0;i<st.length;i++)
       {
           st[i]=s.nextLine();
       }
        System.out.println(Arrays .toString(st));
    }
}  
