
class Base{
    int x;
      

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Drived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
public class Inheritance {
    
    public static void main(String[] args) {
        Base b=new Base();
        
        b.setX(4);
        
        
        System.out.println( b.getX());
        
         Drived c=new Drived();
           c.setX(4);
        
        
        System.out.println( c.getX());
        
         c.setY(5);
         System.out.println(c.getY());
         
       
                
                
               
    }
}
