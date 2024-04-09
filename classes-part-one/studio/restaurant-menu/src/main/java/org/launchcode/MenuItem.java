package org.launchcode;
import java.time.LocalDate;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    public boolean isNew = true;
    private final LocalDate date;

    public MenuItem(String itemName, double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = LocalDate.now();
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
        this.category = category;
    }

    public void printMenuItem() {

    }
}
