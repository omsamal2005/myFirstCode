import java.util.*;
public class twentythree {
    public static void main(String[] args) {
        Scanner mk=new Scanner(System.in);
        int n=mk.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    
}
