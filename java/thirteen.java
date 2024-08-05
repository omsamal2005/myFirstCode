import java.util.*;
public class thirteen {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nr=new Scanner(System.in);
        int n=nr.nextInt();
        int j=nr.nextInt();
        for(int i=1;i<j;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }

    }
    
}
