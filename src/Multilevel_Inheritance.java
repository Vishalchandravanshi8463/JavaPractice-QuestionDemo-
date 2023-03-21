import java.util.*;
class Vishal{
    String name ;
    void m1(String m){
        System.out.println("i am class of vishal "+m);
        
        System.out.println("are you ok with me    ");
    }
}
class Anushka extends Vishal{
    void m2(String m11){
        System.out.println("i am anushka which is extend from vishal");
        System.out.println("are you ok with me ");
    }
}
class Singh extends Anushka{
    void m3(String m12){
        System.out.println("i am singh extends from Anushka "+m12);
        System.out.println("now i am anushka singh ");
    }
}
public class Multilevel_Inheritance {
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
     
        Singh v=new Singh();
            v.name="Chandravanshi";
        v.m3(v.name);
        v.m2(v.name);
        v.m1(v.name);
       
    }
}
