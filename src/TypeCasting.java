
public class TypeCasting {
    
    public static void main(String[] args) {
        //implicit typecasting 
        //small data type to higher data type 
        short a=20;
        int b=a;
        System.out.println(a+" "+b);
        
        //explicit typecasting 
        //higher to lower 
        int c=3423;
        long d=(long)c;
        System.out.println(d);
    }
}
