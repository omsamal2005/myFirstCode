import java.util.*;
public class prime{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        int i=0;
        for(int j=1;j<=n;j++)
        {
            if(n%j==0)
            i++;
        }
        if(i==2)
        {
            System.out.println(n+"Prime number");
        }
        
    }
}