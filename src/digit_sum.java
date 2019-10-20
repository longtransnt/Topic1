import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        System.out.print("Please input an integer within 0 to 1000: ");
        Scanner input = new Scanner(System.in);  // Create new scanner called 'input'
        int num = input.nextInt();
        int sum_of_num = 0;
        while (num != 0) {
            sum_of_num += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits is: " + sum_of_num);
    }
}
