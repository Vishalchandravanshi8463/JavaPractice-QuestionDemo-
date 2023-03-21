
import java.util.*;
public class Kartik_Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 10 digit ISBN code ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length != 10) {
            System.out.println("Illegal ");
        } else {
            long sum=0l;
            for (int i = 0; i < 10; i++) {
                sum+=arr[i]*(i+1);
            }
            System.out.println(sum  );
            if(sum%11==0)
            {
                System.out.println("Legal ");
            }
            else
                System.out.println("no ");
        }
    }
}
