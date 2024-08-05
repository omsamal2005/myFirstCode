import java.util.*;
public class fac {
public static void fac(int n){
    int num=1;
    if(n==0)
    {
        System.out.println(num);
    }
    else{
    for(int i=n;i>=1;i--)
    {
        num=num*i;
        
    }
   
}
return ;
} 
public static void main(String[] args) {
    System.out.println("Enter the number ");
    Scanner ng=new Scanner(System.in);
    int a=ng.nextInt();
 fac(a);
    
}

}
    

