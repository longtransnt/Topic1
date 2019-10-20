import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            System.out.print("What program do you want to run? ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    helloWorld();
                    break;
                case 2:
                    java();
                    break;
                case 3:
                    convertCeltoFah();
                    break;
                case 4:
                    sumOfDigits();
                    break;
                case 5:
                    monthlySaving();
                    break;
                case 6:
                    ascendingIntegers();
                    break;
                case 7:
                    divisible();
                    break;
                case 8:
                    dayOfTheWeek();
                    break;
                case 9:
                    circles();
                    break;
                default:
                    break;
            }
        } while (1 <= choice && choice <= 9);
        System.out.println("Goodbye. See you again!");
    }

    public static void printMenu() {
        System.out.println("**************** MENU *****************");
        System.out.println("    1: Hello World");
        System.out.println("    2: Java");
        System.out.println("    3: Celsius to Fahrenheit");
        System.out.println("    4: Sum of Digits");
        System.out.println("    5: Annual Saving");
        System.out.println("    6: Ascending Order");
        System.out.println("    7: Divisible by 5 and 6");
        System.out.println("    8: Day of the Week");
        System.out.println("    9: Circle Overlap");
        System.out.println("Other: Exit");
        System.out.println("***************************************");
    }

    public static void circles() {

        // Ask user to input coordinate values for circles
        System.out.print("Enter circle1's center x-, y- coordinates, and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.print("Enter circle2's center x-, y- coordinates, and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        // Calculate the distance between two center of circles
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        // Compare the distance of it to radius
        if (distance <= Math.abs(r1 - r2)) {
            System.out.print("Circle2 is inside Circle1");
        }
        else if (distance <= (r1 + r2)) {
            System.out.print("Circle2 overlaps Circle1");
        }
    }

    public static void dayOfTheWeek() {
        // Getting the input data from user
        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = scanner.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = scanner.nextInt();

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

    public static void divisible() {
        System.out.print("Please input an number: ");
        int n = scanner.nextInt();
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

    public static void monthlySaving(){
        int saving;
        double balance = 0;
        System.out.print("Enter the monthly saving amount: ");
        saving = scanner.nextInt();
        System.out.println("Month\tBalance");
        for (int i = 1; i <= 12; i++) {
            balance = (saving + balance) * (1 + 0.00417);
            System.out.println(i + "\t\t$" + String.format("%.3f", balance));
        }
    }

    public static void convertCeltoFah() {
        System.out.print("Enter Celsius degree: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The equivalence in Fahrenheit degree is " + fahrenheit);
    }

    public static void sumOfDigits() {
        int num;
        do {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();
        } while (num < 0);

        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of digits is " + sum);

    }

    public static void ascendingIntegers() {
        int[] intArray = new int[3];
        System.out.print("Please input 3 integers: ");
        intArray[0] = scanner.nextInt();
        intArray[1] = scanner.nextInt();
        intArray[2] = scanner.nextInt();

        // Bubble Sort
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (intArray[j] > intArray[j + 1]) {
                    // Change place
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        // Print out result
        System.out.print("Integers in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + "\t");
        }
        System.out.println();
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static void java() {
        System.out.println("     J\t" + "   A   \t" + "V     V\t" + "   A   \t");
        System.out.println("     J\t" + "  A A  \t" + " V   V \t" + "  A A  \t");
        System.out.println("J    J\t" + " AAAAA \t" + "  V V  \t" + " AAAAA \t");
        System.out.println(" J  J \t" + "A     A\t" + "   V   \t" + "A     A\t");
    }
}
