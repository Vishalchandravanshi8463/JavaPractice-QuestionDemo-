
class phone{
    public void greet(){
        System.out.println("good morning phone user");
    }
    public void on(){
        System.out.println("turning on simple phone ");
    }
}
class SmartPhone extends phone{
    public void namaste(){
        System.out.println("apka swagat hai");
    }
    @Override
    public void on(){
       
        System.out.println("turning on smartphone  ");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        
    
    phone ob=new SmartPhone();
    ob.greet();
    ob.on();
   // ob.namaste();
    ob.on();
}
}
    
