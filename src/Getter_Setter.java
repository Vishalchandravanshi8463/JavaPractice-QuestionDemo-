class MyEmployee{
    private int id;
    private String name;
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
public class Getter_Setter {
    public static void main(String[] args) {
        MyEmployee vishal=new MyEmployee();
        vishal.setName("vishal");
        System.out.println(vishal.getName());
        vishal.setId(505);
        System.out.println(vishal.getId());
    }
}
