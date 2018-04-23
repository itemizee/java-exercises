package exercises.shapes;

public class AbstractEntity {
    public static int nextID = 1;
    public int ID;

    public AbstractEntity(){
        ID = nextID;
        nextID++;
    }

    public int getID(){
        return ID;
    }
}
