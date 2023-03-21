
public class Varargs {
    
     /*static int sum(int ...arr)
    {
        int result =0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to the Varargs tutorial");
        System.out.println("sum is nothing "+sum());
        System.out.println("the sum of 1 , 5 is   "+sum(1,5));
        System.out.println("the sum of 4 ,3 and 5 is "+sum(4,3,5));
                System.out.println("the sum of 4 ,3 and 5 is "+sum(4,3,7,8,5));

    }*/
       static int sum(int x,int ...arr)
    {
        int result =x;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to the Varargs tutorial");
        System.out.println("sum is nothing "+sum(5));
        System.out.println("the sum of 1 , 5 is   "+sum(1,5));
        System.out.println("the sum of 4 ,3 and 5 is "+sum(4,3,5));
                System.out.println("the sum of 4 ,3 and 5 is "+sum(4,3,7,8,5));

    }
}
