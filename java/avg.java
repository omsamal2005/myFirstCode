import java.util.*;
public class avg 
{
    public static void avG(int n,int m,int r)
    {

    
    float num=(n+m+r)/2;
    System.out.println(num);
    return;
}
public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner nj=new Scanner(System.in);
    int a=nj.nextInt();
    int b=nj.nextInt();
    int c=nj.nextInt();
avG(a,b,c);
}
}