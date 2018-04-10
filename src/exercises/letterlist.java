package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class letterlist {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> aL = new ArrayList<>();
        String s, word;

        do{
            s = in.nextLine();
            if(!s.equals("")) {
                aL.add(s);
            }
        }while(!s.equals(""));

        for(int i = 0; i < aL.size(); i++)
        {
            word = aL.get(i);
            if(word.length() == 5)
                System.out.println(word);
        }
    }
}
