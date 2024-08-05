import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner um=new Scanner(System.in);
        System.out.println("enter the first number");
        float num1=um.nextFloat();
        System.out.println("enter second num");
       float num2=um.nextFloat();
       System.out.println("enter operation");
        char c = um.next().charAt(0);
        switch(c){
            case '+' :
                System.out.println(num1+num2);
                break;
                case '-':
                System.out.println(num1-num2);
                break;
                case '*':
                System.out.println(num1*num2);
                break;
                case '/':
                System.out.println(num1/num2);
                break;
                default:
                System.out.println("error");
            }

            }
            



        }
   