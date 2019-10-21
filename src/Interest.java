import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        System.out.print("Please input a monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        float acc = input.nextFloat();
        for (int i = 1; i <= 12; i++) {
            acc *= (1 + 0.0047);
            System.out.println("After " + i + " month(s), the value in the account becomes:" + acc);
        }
    }
}
