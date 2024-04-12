package org.launchcode;
import java.time.LocalDate;
import java.time.Month;
import java.text.DecimalFormat;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    public boolean isNew;
    private LocalDate date;

    public MenuItem(String itemName, double price, String description, String category, LocalDate date) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = date;
        this.isNew = determineIsNew();
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        if (category.equals("appetizer") || category.equals("main course") || category.equals("dessert")) {
            this.category = category;
        } else {
            this.category = "Undefined";
        }
    }

    public boolean determineIsNew() {
        LocalDate compareDate = LocalDate.of(2023, Month.JUNE, 30);
        isNew = this.date.isAfter(compareDate);
        return isNew;
    }

    public void printMenuItem() {
        DecimalFormat priceFormat = new DecimalFormat("#.00");
        if (isNew) {
            System.out.println("NEW!");
        }
        System.out.println(itemName + " ($" + priceFormat.format(price) + ")");
        System.out.println(description + "\n");
    }
}
