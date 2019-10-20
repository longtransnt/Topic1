import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an number: ");
        int n = input.nextInt();
        // Divisible check
        if (n % 5 == 0) {
            if (n % 6 == 0) {
                System.out.println(n + " is divisible by both 5 and 6");
            }
            else System.out.println(n + " is divisible by 5 or 6, but not both");
        }
        else if (n % 6 == 0) {
            System.out.println(n + " is divisible by  5 or 6, but not both");
        }
        else System.out.println(n + " is not divisible by either 5 or 6");
    }
}
