import java.util.*;
public class twenty {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner om=new Scanner(System.in);
        int n=om.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n+1;j++)
            {
System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
}
