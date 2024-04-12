package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class Restaurant {
    public static void main (String [] args) {
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> mainCourses = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        MenuItem spinachArtichoke = new MenuItem("Spinach Artichoke Dip", 12.50, "A creamy savory dip served with pita chips.", "appetizer", LocalDate.of(2009, Month.JANUARY, 8));
        MenuItem cheeseCurds = new MenuItem("Cheese Curds", 8.00, "Crispy, cheesy bundles of joy.", "appetizer", LocalDate.of(2010, Month.JUNE, 14));
        MenuItem mozzarellaSticks = new MenuItem("Mozzarella Sticks", 9.00, "Crispy, cheesy, longer bundles of joy.", "appetizer", LocalDate.of(2023, Month.NOVEMBER, 30));
        appetizers.add(spinachArtichoke);
        appetizers.add(cheeseCurds);
        appetizers.add(mozzarellaSticks);

        MenuItem smashBurger = new MenuItem("Smash Burger", 8.50, "Juicy smash burger, just like Steak & Shake.", "main course", LocalDate.of(2012, Month.AUGUST, 18));
        MenuItem chickenParmesan = new MenuItem("Chicken Parmesan", 10.00, "Baked chicken in a red sauce and mozzarella.", "main course", LocalDate.of(2020, Month.SEPTEMBER, 12));
        MenuItem shrimpScampi  = new MenuItem("Shrimp Scampi", 12.50, "Shrimp, pasta, and vegetables in an oil-based sauce.", "main course", LocalDate.of(2024, Month.OCTOBER, 2));
        mainCourses.add(smashBurger);
        mainCourses.add(chickenParmesan);
        mainCourses.add(shrimpScampi);

        MenuItem tiramisu = new MenuItem("Tiramisu", 6.50, "Light, coffee-flavored dessert.", "dessert", LocalDate.of(2005, Month.JULY, 17));
        MenuItem cake = new MenuItem("Yellow Cake with Chocolate Frosting", 5.00, "Our world famous yellow cake and chocolate frosting.", "dessert", LocalDate.of(2002, Month.MAY, 1));
        desserts.add(tiramisu);
        desserts.add(cake);

        tiramisu.printMenuItem();

        Menu officialMenu = new Menu(appetizers, mainCourses, desserts);

        officialMenu.printMenu();
    }
}
