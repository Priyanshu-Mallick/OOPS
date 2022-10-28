
// GCD of 2 numbers
import java.util.*;

public class GCD {
    public static void main(String[] args) {
        int num1, num2, gcd = 1;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter first number");
            num1 = in.nextInt();
            System.out.println("Enter second number");
            num2 = in.nextInt();
        }
        for (int i = 1; i <= num1 && i <= num2; ++i) {

            // check if i perfectly divides both num1 and num2
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

    }
}
