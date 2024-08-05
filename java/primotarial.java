   
import java.util.*;
public class primotarial {
    public static int primer(int n)
    {
    int count=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("prime number");
    }
    else
    {
        System.out.println("not prime number");
    }
    return n;
        
        

        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        int prime=primer(n);
        System.out.println(prime);
    }
        
    

    
    
    }

    
