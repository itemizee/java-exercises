package exercises.restaurant;



public class Restaurant {
    public static void main(String[] args){

        Menu menu = new Menu("Josh's Lunch");
        MenuItem mi = new MenuItem("Thai Curry", 10, "Thai style coconut curry.  " +
                "Carrots, Kale, and bell peppers.  Served with brown rice.  It's pretty hot", "thai");
        MenuItem mi2 = new MenuItem("Piro aloo dum", 9, "Hot and spicy potato curry." +
                " A classic spicy indian dish.  Served with brown rice", "indian");
        MenuItem mi3 = new MenuItem("Salsa and Avocado", 8, "Josh's favorite snack." +
                " Hot, fresh salsa.  Served with tortilla chips and one sliced avocado", "snack");


        menu.addMenuItem(mi);
        menu.addMenuItem(mi2);
        menu.addMenuItem(mi3);
        String printMenu = menu.printMenu();
        System.out.println(printMenu);

        if(!mi.equals(mi2))
            System.out.println("NOT EQUALS LEL\n");

        menu.removeMenuItem(3);
        printMenu = menu.printMenu();
        System.out.println(printMenu);

        if(mi.isNew())
            System.out.println("MENU ITEM IS NEW!!!\n");

        System.out.println(mi.printMenuItem() + "\n");

        System.out.println(menu.menuLastUpdate() + "\n");

    }
}
