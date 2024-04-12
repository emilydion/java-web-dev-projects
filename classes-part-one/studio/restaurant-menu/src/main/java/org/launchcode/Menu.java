package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;


public class Menu {
    public ArrayList<MenuItem> appetizers = new ArrayList<>();
    public ArrayList<MenuItem> mainCourses = new ArrayList<>();
    public ArrayList<MenuItem> desserts = new ArrayList<>();
    ArrayList<ArrayList> categories = new ArrayList<>();

//    private LocalDate lastUpdated = new LocalDate();
//
//    public LocalDate getLastUpdated() {
//        return lastUpdated;
//    }
//
//    public void setLastUpdated(LocalDate lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }

    public Menu (ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts) {
        this.appetizers = appetizers;
        this.mainCourses = mainCourses;
        this.desserts = desserts;
    }
    public void printLastUpdated() {

    }

    public void printMenu() {
        System.out.println("Appetizers:");
        for (MenuItem appetizer : appetizers) {
            appetizer.printMenuItem();
        }

        System.out.println("\nMain Courses:");
        for (MenuItem mainDish : mainCourses) {
            mainDish.printMenuItem();
        }

        System.out.println("\nDesserts:");
        for (MenuItem dessert : desserts) {
            dessert.printMenuItem();
        }
    }

    public void addMenuItem() {

    }

    public void removeMenuItem(String name, String category) {
        categories.add(appetizers);
        categories.add(mainCourses);
        categories.add(desserts);

        if (category.equals())
    }


}
