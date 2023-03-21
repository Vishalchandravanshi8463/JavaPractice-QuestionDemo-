import java.util.*;

//by vishal chandravanshi
class Student {
    String name;
    void method1 (){
        System.out.println("i am learning ");
    }
}
class Study extends Student {
    void method2(){
    System.out.println("i am "+name+" "+"study well");
    }
}
public class Inheritance_in_TNP {
    public static void main(String[] args) {
        Study s= new Study();
        s.name="Anushka";
        s.method2();
        s.method1();
    }
}
