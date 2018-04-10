package exercises;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class gradebookHashMap {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hM = new HashMap<>();
        String name;
        int id;
        Scanner in = new Scanner(System.in);
        do{
            name = in.nextLine();
            if(!name.equals("")) {
                id = in.nextInt();
                hM.put(id, name);
                in.nextLine();
            }

        }while(!name.equals(""));

        for (Map.Entry<Integer, String> h : hM.entrySet()) {
            System.out.println(h.getValue() + " (" + h.getKey()  + ")");
        }
    }
}
