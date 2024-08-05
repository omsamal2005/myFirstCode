import java.util.*;
public class odd {
    public static void oddfun(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n==1)
            {
                System.out.println(n+"odd");
            }
           else  if(i%2!=0)
            
            {

                System.out.println(i+"is a odd number") ;
                sum=sum+i;
            }
            else 
            {
                System.out.println(" not a odd number");
            }
            
        }
        System.out.println(sum);
        return ; 
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nv=new Scanner(System.in);
        int j=nv.nextInt();
    oddfun(j);
        
    }
    
}
