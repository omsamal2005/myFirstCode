import java.util.*;
public class raise {
    public static void power(int x,int n)
    {
        int p=1;
        if(n==0)
        {
            System.out.println(1);
        }
        else{
        for(int i=1;i<=n;i++ )
        {
            p*=x;
        }
        System.out.println(p);
    }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner nb=new Scanner(System.in);
        int n=nb.nextInt();
        int m=nb.nextInt();
        power(n,m);
    }
}
