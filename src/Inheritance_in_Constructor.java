
class Base1 {

    Base1() {
        System.out.println("i am a constructor of Base1 ");

    }

    Base1(int a) {
        System.out.println("i am a constructor with value a as " + a);

    }
   
}

class Derived1 extends Base1 {

    Derived1() {
       // super(0);           //this super keyword for run a overloaded constructor 
        
        System.out.println("I am a constructor of class Derived1");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am an overloaded constructor of class derived"+x+y);
    }
  

}
class ChildDerived{
    
    ChildDerived(){
    System.out.println("i am a childDerived class constructor ");
   
}
    ChildDerived(int x,int y,int z){
        System.out.println("i am a childDerived class constructor with value y as a "+y);
    }
}

public class Inheritance_in_Constructor {

    public static void main(String[] args) {

        //  Base1 B=new Base1();
        //  B.
      //  Derived1 D = new Derived1(24,78);
         ChildDerived cd=new ChildDerived();
    ChildDerived dc=new ChildDerived(12,14,54);
    
    }
}
