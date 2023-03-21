
abstract class Animal1 {

    Animal1() {
        System.out.println("i am Animal");
    }

    abstract void sound();

    void move() {
        System.out.println("i am moving here and there ");
    }

}

class Cat extends Animal1 {

    public static void run() {
        System.out.println("i am runing in the ground ");
    }

    void sound() {
        System.out.println("meuu meuu ");
    }
}

class Dog1 extends Animal1 {

    Dog1() {
        System.out.println("i am dog what can i help you ");
    }

    void sound() {
        System.out.println("i am barking bhoo bhoo");
    }
}

public class Abstrac_Class_IN_T_AND_P {

    public static void main(String[] args) {
        Animal1 A = new Cat();
        A.move();
        A.sound();
          Animal1 B = new   Dog1();
          B.sound();
    }
}
