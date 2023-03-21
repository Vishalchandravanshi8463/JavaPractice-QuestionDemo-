
public class Recursion34 {
    static int factorial(int n)
    {
        //factorial(n)=n*P(n-1)*...
        if(n==0||n==1)
        {
            return 1;
        }
        else 
        {
            return n*factorial(n-1);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("the factorial of 5 is "+factorial(5));
        System.out.println("the factorial of 4 is "+factorial(4));

    }
}
