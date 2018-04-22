package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private static Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(String aName)
    {
        name = aName;
        lastUpdated = new Date();
    }

    public String getName(){
        return name;
    }

    private Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void setName(String aName){
        name = aName;
        lastUpdated = new Date();
    }

    public void addMenuItem(MenuItem aMenuItem){
        menuItems.add(aMenuItem);
    }

    public void removeMenuItem(int ID){

        for(MenuItem mi : menuItems)
            if(mi.getId() == ID) {
                menuItems.remove(mi);
                break;
            }

    }


    public String menuLastUpdate(){
        String s = "Menu was last updated: ";
        Date d = new Date();
        s += (d.getTime() - getLastUpdated().getTime()) / 86400000;
        s += " days ago";

        return s;
    }

    public String printMenu(){
        String s = name + ": \n\n";

        for(MenuItem mi : menuItems)
        {
            s += mi.printMenuItem() + "\n\n";
        }

        return s;
    }
}
