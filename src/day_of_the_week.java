import java.util.Scanner;

public class day_of_the_week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting the input data from user
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        // Check if the month is either 1 or 2
        if (m == 1 || m == 2) {
            m += 12;
            year -= 1;
        }

        int j = year / 100;
        int k = year % 100;
        int h = (q + (26/10*(m + 1)) + k + (k / 4) + (j / 4) + 5*j ) % 7;
        System.out.println(q + " - " + m + " - " + k + " - " + j + " - " + h);
        switch (h) {
            case 0:
                System.out.println("Day of the week is Sunday");
                break;
            case 1:
                System.out.println("Day of the week is Monday");
                break;
            case 2:
                System.out.println("Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day of the week is Thursday");
                break;
            case 5:
                System.out.println("Day of the week is Friday");
                break;
            case 6:
                System.out.println("Day of the week is Saturday");
                break;
        }

    }
}
