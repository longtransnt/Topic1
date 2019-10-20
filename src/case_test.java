import java.util.Scanner;
public class case_test {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        switch (s1) {
            case "10": /* Match -> Execution starts here */
                System.out.println("Ten");
                break;
            case "20":
                System.out.println("Twenty");
                break;
            default:
                System.out.println("No-match"); /* Execution ends here */
                break;
        }
    }
}
