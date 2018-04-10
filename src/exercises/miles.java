package exercises;
import java.util.Scanner;

public class miles {
    public static void main(String[] args)
    {
        Scanner in;
        double miles, gas;

        in = new Scanner(System.in);
        System.out.println("enter miles driven: ");
        miles = in.nextDouble();
        System.out.println("enter gas in gallons consumed");
        gas = in.nextDouble();

        System.out.println("MPG: " + (miles/gas));

    }
}
