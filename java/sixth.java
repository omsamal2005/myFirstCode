import java.util.*;
 
public class sixth {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner om= new Scanner(System.in);
        int num=om.nextInt();
        int num1=om.nextInt();
        if(num==num1)
        {
            System.out.println("Equal");

        }
        else{
            if(num>num1)
            {
                System.out.println(num+"is greater than"+num1);
            }
            else{
                System.out.println(num+"is less than"+num1);
            }
            
        }

    }
    
}
