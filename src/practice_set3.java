
public class practice_set3 {
    public static void main(String[] args) {
     /*   for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
            System.out.print("*");
            }
            System.out.println("\t");
        }*/
   /*  int i=5;
     while(i>0)
     {
         int j=0;
         while(j<i)
         {
             System.out.print("*");
             j++;
         }
         i--;
         System.out.println("\t");
     }*/
     //practice 2
    /* int n=4;
     int v=0;
     for(int i=0;i<n;i++)
     {
         v=v+(2*i);
     }
        System.out.println(v);*/
   /* int n=99;
    for(int i=1;i<=10;i++)
    {
        System.out.println(n+"*"+i+"="+n*i);
    }*/
   //practice 3
  /*  int n=10;
    for(int i=10;i>0;i--)
    {
        System.out.println(n+"*"+i+"="+n*i);
    }*/
 // int t=5;
  //int s=1;
 // for(int i=1;i<=t;i++)
 // {
 //     s=s*i;
 // }
      //  System.out.println(t+"factorial is "+s);
      
    /*    while(t>0)
        {
            s=s*t;
            t--;
        }
         System.out.println(t+"factorial is "+s);*/
  
    int sum=0;
     int n=8;
    for(int i=1;i<=10;i++)
    {
       // System.out.println(n+"*"+i+"="+n*i);
        sum+=n*i;
    }System.out.println("sum is "+sum);
    }
}
