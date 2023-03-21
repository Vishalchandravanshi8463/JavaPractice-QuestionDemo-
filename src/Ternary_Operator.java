import java.util.*;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner (System.in);
        System.out.println("enter the value ");
        a=s.nextInt();
        String m=(a%2==0)?"even":"odd";
        System.out.println("a is "+m);
        char p;
        System.out.println("enter the operator ");
        p=s.next().charAt(0);
        int  vi=('+'==p)?(5+5):(6-6);
        System.out.println("value is "+vi);
        
    }

   
}
