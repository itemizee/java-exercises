package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class evensum {
    public static void main(String[] args)
    {
        ArrayList<Integer> aL = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int input, sum = 0;

        System.out.println("enter 10 integers");
        for(int i = 0; i < 10; i++)
        {
            input = in.nextInt();
            aL.add(input);
        }

        for(int i = 0; i < aL.size(); i++)
        {
            input = aL.get(i);
            if(input % 2 == 0)
                sum += input;
        }

        System.out.println(sum);

    }
}
