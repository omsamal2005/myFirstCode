import java.util.*;
public class thirtyone {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        int rem=n%10;
        int quot=n/10;
        int q2= quot/100;
        int rem2=quot%100;
        int rem3=rem2%10;
        int r=rem2/10;
        System.out.println(remrem3+r+q2);
    }

    
}
