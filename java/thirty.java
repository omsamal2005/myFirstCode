import java.util.*;
public class thirty {
    public static void main(String[] args) {
        System.out.println("Enter the iterations");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

    }
    
}
}