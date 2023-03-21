
class Threadv extends Thread {

    public void thread1() {
        int i = 0;
        while (i < 20) {
            System.out.println("i am threading of chatting ");
            System.out.println("i am learning new things ");
            i++;
        }
    }
}

class Threading extends Thread {

 //   @Override
    public void thread2() {
        int i = 0;
        while (i < 20) {
            System.out.println("i am not allow procrastination ");
            System.out.println("i am enthiusiastic and curios");
            i++;
        }
    }
}

public class Threading_ {

    public static void main(String[] args) {
        Threadv T = new Threadv();
        Threading Th = new Threading();
        T.start();
        Th.start();
    }
}
