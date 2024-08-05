import java.util.*;
public class radius {
    public static void radius(int r)
    {
        double circum=2*(3.14)*r;
        System.out.println(circum);

        return;
    }
public static void main(String[] args) {
    System.out.println("Enter the radius");
    Scanner nv=new Scanner(System.in);
    int n=nv.nextInt();
    radius(n);
    
}

}