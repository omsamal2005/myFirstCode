import java.util.*;
public class lagna {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a>=18)
        {
System.out.println("Adult citizen");
        }
        else
        {
            System.out.println("below age");
        }
        System.out.println("THe teenageis"+a);


    }
}
