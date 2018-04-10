package exercises;
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double pi = 3.14, r;

        do {
            System.out.println("enter a radius");
            r = in.nextDouble();
            if(r<=0)
                System.out.println("error: radius must be positive\n");
        }while(r<=0);

        System.out.println("Area of circle with radius " + r + "is: " + (pi*r*r));
    }
}
