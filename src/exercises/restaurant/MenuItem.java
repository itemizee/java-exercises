package exercises.restaurant;

import java.util.Date;

public class MenuItem {
    private static int nextId = 1;
    private String name;
    private int id;
    private double price;
    private String description;
    private String category;
    private final Date dateAdded;

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory)
    {
        name = aName;
        id = nextId; nextId++;
        price = aPrice;
        description = aDescription;
        category = aCategory;
        dateAdded = new Date();
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public Date getDateAdded(){
        return dateAdded;
    }

    public void setPrice(double aPrice){
        price = aPrice;
    }

    public void setDescription(String aDescription){
        description = aDescription;
    }

    public void setCategory(String aCategory){
        category = aCategory;
    }

    public String printMenuItem(){
        String s = "Name: " + name +"\nPrice: " + price + "\nCategory: " + category + "\nDescription: " + description;

        return s;
    }

    public boolean equals(Object o){
        boolean r;

        if(this == o)
            r = true;
        else if(o == null)
            r = false;
        else if(o.getClass() != getClass())
            r = false;
        else {
            MenuItem mi = (MenuItem) o;
            r = mi.getId() == id;
        }

        return r;
    }

    public boolean isNew(){

        Date d = new Date();
        if(d.getTime() - getDateAdded().getTime() > 604800000) //one week in milliseconds
            return false;
        else
            return true;
    }
}
