class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
                System.out.println("my salary is "+salary);

    }
    public int getSalary(){
        return salary;
    }
}
public class Oops_Custom_Class {
    public static void main(String[] args) {
        System.out.println("this is our custom class ");
        
        Employee vishal=new Employee();
        vishal.id =102;
        vishal.name="vishal";
        vishal.salary=50000;
        
      //  System.out.println(vishal.id);
       // System.out.println(vishal.name);
        System.out.println("i am method of class employee");
        vishal.printDetails();
        
        Employee john=new Employee();
        john.id=103;
        john.name="john singh";
        john.salary=30000;
        int salary=john.getSalary();
        System.out.println(salary);
        john.printDetails();
        
    }
    
}
