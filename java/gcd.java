import java.util.*;
public class gcd {
   public static void gcd(int m,int n)
    {
        int hcf=0;
        for(int i=1;i<=m && i<=n;i++)
        {
            if(m%i==0 && n%i==0)
            {
                hcf=i;
                
               
            }

        }
        System.out.println(hcf);

        
    
       
    
    }
    

    


    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner nv= new Scanner(System.in);
        int n=nv.nextInt();
        int m=nv.nextInt();
        gcd(m, n);
    }


}