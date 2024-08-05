import java.util.*;
public class eligibility {
    public static void eligible(int n)
    {
        if(n<18)
        {
            System.out.println("not eligible");
        }
        else
        {
            System.out.println("eligible");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner nh=new Scanner(System.in);
        int n=nh.nextInt();
        eligible(n);
    }
}