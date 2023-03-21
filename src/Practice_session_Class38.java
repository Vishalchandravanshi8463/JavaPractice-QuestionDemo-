import java.util.Scanner;
  /*class Employee1{
      int salary;
      String name;
      Scanner sc=new Scanner(System.in);
      
      public int getSalary(){
          return salary;
      }
      public void setName
(String n){
         // System.out.println("enter your name");
         // name=sc.nextString();
         name=n;
         
      }
      public String getName(){
          return name;
      }
      
    
}
public class Practice_session_Class38 {
    
    public static void main(String[] args) {
        
        Employee1 vishal=new Employee1();
        vishal.salary=50000;
        vishal.name="vishal chandravanshi";
         System.out.println("my name is "+vishal.getName());
         
        System.out.println("my salary is "+vishal.getSalary());
       // vishal.setName();
       
        
        
        
       // vishal.name="chandravanshi";
        
    }
  
    
}*/

/*class Cellphone{
    public void ringing(){
        System.out.println("Ringing   ...  .. ");
        
    }
     public void vibrating(){
        System.out.println("vibrating   ...  .. ");
        
    }
}*/


class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
       return  4*side;
    }
    
}

class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
       return  2*(l+b);
    }

    void getLengthHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

class Circle{
    int r;
    int b;

    Circle(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public float area(){
        return 3.14f*r*r ;
    }
    public float perimeter(){
       return  2*3.14f*r;
    }
    
}
public class Practice_session_Class38 {
    public static void main(String[] args) {
        
       /* Cellphone vivo=new Cellphone();
        vivo.ringing();
        vivo.vibrating();*/
       
        Square s=new Square();
        s.side=2;
        System.out.println(  s.area());
        System.out.println( s.perimeter());
        
        System.out.println("i am rectangle ");
        Rectangle r=new Rectangle();
        r.l=3;
        r.b=5;
       System.out.println(  r.area());
        System.out.println( r.perimeter());
        
        System.out.println("i am circle ");
        Circle c=new Circle(1);
        c.r=3;
        
       System.out.println(  c.area());
        System.out.println( c.perimeter());
        
    }
}