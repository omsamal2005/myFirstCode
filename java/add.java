import java.util.*;
public class add {
    public static int addNum(int a,int b)
    {
       int  sum=a+b;
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int add= addNum(x,y);
        System.out.println(add);
    }
}
