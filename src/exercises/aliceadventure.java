package exercises;
import java.util.Scanner;

public class aliceadventure {
    public static void main(String[] args)
    {
        Scanner in;
        String sentence = "";
        String searchTerm;
        int size;
        boolean found = false;

        in = new Scanner(System.in);

        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("enter search term");
        searchTerm = in.nextLine();

        size = sentence.length() - searchTerm.length();
        sentence = sentence.toLowerCase();
        searchTerm = searchTerm.toLowerCase();
        for(int i = 0; !found && i < size; i++)
        {
            int length = searchTerm.length();
            found = true;
            for(int j = 0; found && j < length; j++)
            {
                if(sentence.charAt(i+j) != searchTerm.charAt(j))
                    found = false;
            }
        }

        System.out.println(found);
    }
}
