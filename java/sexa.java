import java.util.*;
public class sexa {
    public static int calsub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nv=new Scanner(System.in);
        int n1=nv.nextInt();
        int n2=nv.nextInt();
        int diff=calsub(n1,n2);
        System.out.println(diff);

    }
}



    
        
    
