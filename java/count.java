import java.util.*;
public class count {
    public static void count(int n){
        int positivecount=0;
        int negativecount=0;
        int equalcount=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the number");
            Scanner nv=new Scanner(System.in);
            int m=nv.nextInt();
            if(m<0)
            {
            negativecount++;
            }
            else if(m==0)
            {
                equalcount++;
            }
            else
            {
positivecount++;
            }
        }
        System.out.println(negativecount);
        System.out.println(equalcount);
        System.out.println(positivecount);
        return;

        }
        public static void main(String[] args) {
            System.out.println("Enter the number");
            Scanner nb=new Scanner(System.in);
            int n=nb.nextInt();
            count(n);
        }
    }
    

