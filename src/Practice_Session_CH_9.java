
import java.util.Scanner;

/*class Cylinder {

    float r;
    float h;

    public Cylinder(int radius, int height) {
        this.r = radius;
        this.h = height;
    }

    public void setData(float i, float j) {
        r = i;
        h = j;
    }

    public void getData() {
        System.out.println("radius is " + r);
        System.out.println("height is " + h);
    }

    public float Area() {
        return (2 * 3.14f * r * h + 2 * 3.14f * r * r);
    }

    public float volume() {
        return (3.14f * r * r * h);
    }
}*/

class Rectangle1 {

    private int length;
    private int height;

    public Rectangle1() {
        this.length = 4;
        this.height = 5;

    }

     public void getLengthHeight1() {
        System.out.println("length and height is "+length+height );
    }

}

public class Practice_Session_CH_9 {

    public static void main(String[] args) {
     /*   float m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the h and r ");
        m = sc.nextFloat();
        n = sc.nextFloat();
        Cylinder vishal = new Cylinder(4, 7);
        // vishal.setData(m, n);
        // vishal.getData();

        System.out.println("area of cylinder is " + vishal.Area());
        System.out.println("volune of cylinder is " + vishal.volume());
*/
        Rectangle1 r = new Rectangle1();
        r.getLengthHeight1();

    }
}
