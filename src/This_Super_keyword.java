
class ekClass{
    int a;
    ekClass(int v){
      this.  a=v;                             //this is used to reference
    }

    public int getA() {
        return a;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends ekClass{
    Doclass(int c){
        super(c);
        System.out.println("i am a constructor ");
    }
}
public class This_Super_keyword {
    public static void main(String[] args) {
        ekClass ek=new ekClass(5);
        Doclass d=new Doclass(10);
        System.out.println(ek.getA());
    }
}
