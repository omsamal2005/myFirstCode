import java.util.*;
public class multiply {
    public static int multIPLY(int a,int b){
    int into=a*b;
    return into;
    }
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int m=sv.nextInt();
        int mul=multIPLY(n,m);
        System.out.println(mul);
    }

    
}