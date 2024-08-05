import java.util.*;
public class tor {
     static int FacTor(int n)
    {
        int num=1;
        if(n==0)
        {
            System.out.println(num);
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                num=num*i;
                System.out.println(num);
            }
        }
        
        return num;

    }
    public static void main(String[] args) {
        System.out.println("Enter the factorial");
        Scanner gh=new Scanner(System.in);
        int a=gh.nextInt();
        int r=FacTor(a);
        System.out.println(r);

    }
    
}
