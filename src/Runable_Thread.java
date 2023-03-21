
  class MyThreadRunnable implements Runnable{
        public void run(){
            int i=0;
            while(i<500){
            System.out.println("i am thread1 not a threat1 ");
            i++;
        }
        }
    }
  class MyThreadRunnable2 implements Runnable{
        public void run(){
            int v=0;
            while(v<10)
            {
            System.out.println("i am thread2 not a threat2 ");
            v++;
            }
        }
    }
  
public class Runable_Thread {
    
  
    public static void main(String[] args) {
        MyThreadRunnable th1=new MyThreadRunnable();
        Thread gun1=new Thread (th1);
        
        MyThreadRunnable2 th2=new MyThreadRunnable2();
        Thread gun2=new Thread (th2);
        gun1.start();
        gun2.start();
    }
}
