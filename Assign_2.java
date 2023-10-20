
//Assignment 2.....declare two numbers and one operator as a character. e.g. '+'

package DAY_1;
import java.util.*;
public class Assign_2 {

		public static void main(String args[])
		{
		 Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no :");
        int a = sc.nextInt();
        System.out.println("enter the second no :");
        int b = sc.nextInt();
        System.out.println("enter the operation sub = '-' ; add = ' + ' ; divide = '/' ; mod = '%'   ");
        char operator=sc.next().charAt(0);
        switch (operator)
        {
            case ('+') :
                int add=a+b;
                System.out.println("add = " +add);
                break;
            case ( '-'):
                int sub= a-b;
                System.out.println("sub = " +sub);
                break;
            case ( '/'):
                int divide = a/b;
                System.out.println("divide = " +divide);
                break;
            case ('%'):
                int mod= a%b;
                System.out.println("mod = " +mod);
                break;
	    default:
		System.out.println("not valid");
        }


        }
    }

