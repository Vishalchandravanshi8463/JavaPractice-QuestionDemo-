import java.util.*;
public class Arraylistv {
    


    public static void main(String[] args) {
        
    
    Scanner s=new Scanner (System.in);
    ArrayList<String> lis=new ArrayList<String>(); 
    lis.add("Vishal");
    lis.add("Anushka");
    lis.add("Chandravanshi");
        System.out.println(lis);
        lis.set(0,"Rani");
        System.out.println(lis);
        lis.remove(1);
        System.out.println(lis);
        for(int i=5;i<7;i++)
        {
            lis.add(s.nextLine());
        }
        System.out.println("_________________");
        for(int i=0;i<4;i++)
        {
            System.out.println(lis.get(i));
        }
}
}
