import java.util.*;
public class twentyfive {
    public static void main(String[] args) {
        System.out.println("Enter the iteration");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
