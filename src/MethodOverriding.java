class A{
    public int  meth1(){
        return 2;
    }
    public void meth2(){
        System.out.println("I am a meth2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am a meth2 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
         A a=new A();
         B b=new B();
    a.meth2();
    b.meth2();
    }
   
}
