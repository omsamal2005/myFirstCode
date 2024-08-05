import java.util.*;
public class eighteen {
    public static void main(String[] args) {
        Scanner nv=new Scanner(System.in);
        int n=nv.nextInt();
        while(n!=0)
        {
            
            int j=nv.nextInt();
            if(j>=90)
            {
                System.out.println("This is good");
            }
            else 
            {
                if(89>=j&&j<=60)
                System.out.println("This is also good");
                else

    System.out.println("This is good as well");


            }

        }
    }
}
