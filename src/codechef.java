import java.util.*;
public class codechef {
    public static void main(String[] args) {
        
    			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    String p="";
		    vishal(s,p,n);
		}
	}
	static void vishal(String s,String t,int n)
	{
	    int pp=n;
	    for(int i=0;i<n;i++)
	    {
	        
	        if(s.charAt(0)=='0')
	        {
	            t='0'+t;
	        }
	        else if(s.charAt(0)=='1')
	        {
	            t=t+'1';
	        }
	        if(s.charAt(n-1)=='1')
	        {
	            t='1'+t;
	        }
	        else if(s.charAt(n-1)=='0')
	        {
	            t=t+'0';
	        }
	        s = s.substring(1, s.length() - 1);
                	n=n-2; 
                        i=0;
	    }
            System.out.println(t);
	}
}
