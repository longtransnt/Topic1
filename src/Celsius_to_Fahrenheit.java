import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner named 'input'
        System.out.print("Please input a Celsius temperature: ");
        double c1 = input.nextFloat();
        double f1 =  (9.0 / 5) * c1 + 32;
        String fahrenheit =  String.format("%.2f", f1);  // Format the float to 2 decimal places
        System.out.println(c1 + " Celsius is equal " + fahrenheit + " in Fahrenheit");
    }
}
