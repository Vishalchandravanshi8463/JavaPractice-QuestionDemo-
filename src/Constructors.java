class MyMainEmployee{
    private int id;
    private String name;
    
    
    public MyMainEmployee(String myname,int i){
        id=i;
        name =myname;
        
    }
     public MyMainEmployee(){
        id=76;
        name ="your name here ";
        
    }
      public MyMainEmployee(String myy){
        id=76;
        name = myy;
        
    }
     
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
   
   public void setId(int i){
       id=i;
   }
   public int getId(){
       return id;
   }
}
public class Constructors {
    public static void main(String[] args) {
        //MyMainEmployee vishal=new MyMainEmployee("vishal",95);
              // MyMainEmployee vishal=new MyMainEmployee();
  MyMainEmployee vishal=new MyMainEmployee("rahul");
               
       // vishal.setName("vishal chandravanshi");
        System.out.println("my name is "+vishal.getName());
       //vishal.setId(97);
        System.out.println("my id is "+vishal.getId());
        
    }

  
    
}
