import java.util.*;
public class compare {
    public static void compare(int n,int m)
    {
        if(n>m)
        {
            System.out.println(n+"is greater than"+m);
        }
        else
        {
            System.out.println(n+"is less to"+m);
        }
     return;
    }

    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        int m=nv.nextInt();
        compare(n,m);

    }
}
