
class Animal{
    public Animal(){
        System.out.println("i am animal .");
    }
}
class Dog extends Animal{
    public void barking(){
        System.out.println("i am barking ");
    }
}


public class Inheritance_Animal {
    public static void main(String[] args) {
     //   Animal A=new Animal();
        Dog D=new Dog();
       // D.barking();
    }
    
}
