import java.util.Scanner;

public class sums {
    public static void main(String [] args) {
        int n, i, sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        n = keyboard.nextInt();

        for(i = 0; i <= n; i++){
            if((i%2) == 1){
                sum += i;
            }
        }

        System.out.print("Sum of all odd numbers is "
                + n + " = " + sum);
    }
}