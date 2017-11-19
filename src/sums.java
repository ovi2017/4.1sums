import java.util.Scanner;

public class sums {
    public static void main(String [] args) {
        int n, x, sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = keyboard.nextInt();

        for(x = 0; n <= n; x++){
            if((n%2) == 1){
                sum += x;
            }
        }

        System.out.print("Sum of all odd numbers is "
                + n + " = " + sum);
    }
}