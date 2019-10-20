import java.util.Scanner;

public class circles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to input coordinate values for circles
        System.out.print("Enter circle1's center x-, y- coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y- coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

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
}
