package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {

        public static void main(String[] args)
        {
            Scanner in;
            String sentence = "";
            in = new Scanner(System.in);
            char letter;
            HashMap<Character, Integer> hM = new HashMap<>();
            sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
            sentence.toLowerCase();
            int size = sentence.length();
            for(int i = 0; i < size; i ++)
            {
                if(sentence.charAt(i) > 96 && sentence.charAt(i) < 123)
                {
                    letter = sentence.charAt(i);
                    if (hM.containsKey(letter))
                        hM.put(letter, hM.get(letter) + 1);
                    else
                        hM.put(letter, 1);
                }
            }

            for(Map.Entry<Character, Integer> e : hM.entrySet())
            {
                System.out.println(e.getKey() + ": " + e.getValue() );
            }




        }
    }

