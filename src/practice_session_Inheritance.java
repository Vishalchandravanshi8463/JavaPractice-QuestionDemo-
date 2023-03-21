
class Circle1{
      public int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
      
    Circle1(int r){
        System.out.println("i am circle parametrized constructor  with the value of r "+r);
      this.r=r;
  }
  
    public double Area(){
        System.out.println("i am a area of Circle class  with  r" +r);
        return Math.PI*this.r*this.r;
    }
    public double Perimeter(){
        System.out.println("i am a perimeter of Circle class with r  "+r);
        return 2*Math.PI*r;
    }
}
class Cylinder extends Circle1{
   public  Cylinder(int r,int h){
       
       super(r);
       System.out.println("i am cylinder pArametrized constructor with the value of r amd h  "+r+" "+h);
       this.h=h;
   }
    public int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    public double volume(){
        System.out.println("i am a volume of Cylinder class  with r "+r);
         return Math.PI*this.r*this.r*this.h;
    }
     public double area(){
         System.out.println("i am a area of Cylinder class  with r "+r+" "+h);
        return 2*Math.PI*r*h+(2*Math.PI*r*r);
    }
}
// PROBLEM 2 
/*
class Rectangle2 {
    int l,b;
   public Rectangle2(int l,int b){
       
    this.l=l;
    this .b=b;
       System.out.println("i am a constructor of class Rectangle "+l+"  "+b);
} 
}
class Cuboid extends Rectangle2{
    int h;
    Cuboid(int l,int b,int h){
        super(l,b);
        System.out.println("i am a  constructor of class Cuboid with "+l+" "+b+" "+h);
    }
    
}*/
public class practice_session_Inheritance {
    public static void main(String[] args) {
        //problem 1
      Circle1 objc=new Circle1(12);
     Cylinder objv=new Cylinder(6,4);
        System.out.println(objv.area());
        System.out.println(objv.volume());
        objv.setH(5);
        objc.setR(10);
        System.out.println("i am SET R "+objc.getR());
        System.out.println("i am SET H "+objv.getH());
        System.out.println("now  i am run with Circle object ");
       
        System.out.println(objc.Area());
        System.out.println(objc.Perimeter());
    // objv.volume();
     //objv.area();
     
     //problem 2
     //Cuboid c=new Cuboid(4,6,5);
        /*System.out.println("now i am another object ");
     Rectangle2 re=new Rectangle2(4,7);*/
     
    }
}
