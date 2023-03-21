import java.util.*;
public class MultiDimensional {
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    /*int [][]arr=new int[3][3];
        System.out.println("length of arr is "+arr.length);
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++){
            System.out.println("enter the value of   arr["+i+"]"+"["+j+"]");
            arr[i][j]=s.nextInt();
        }
    }
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }*/
    int [][]arr={
        {1,2,3,4},
        {5,6},
        {7,8,9}
    };
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
    }
}
}
