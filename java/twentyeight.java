import java.util.*;
public class twentyeight {
    public static void main(String[] args) {
        System.out.println("Enter the iterations");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int number=1;
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println(" ");
        }
    }
    
}
