package exercises;
import java.util.Scanner;


public class alice {
    public static void main(String[] args)
    {
        Scanner in;
        double length, height;

        in = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        length = in.nextDouble();
        System.out.println("Enter height of rectangle");
        height = in.nextDouble();

        System.out.println("Area of R: " + (length*height));
    }
}
