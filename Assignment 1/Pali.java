
// 1. Check Palindrum or not
import java.util.Scanner;

public class Pali {
    public static void main(String args[]) 
    {
        int x,number, y,temp=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number: ");
        number=in.nextInt();
        y = number;
        while(number!=0)
        {
            x=number%10;
            temp=temp*10+x;
            number=number/10;
        }
        if(temp==y)
        {  
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("not Palindrome");
        }
    }
}
