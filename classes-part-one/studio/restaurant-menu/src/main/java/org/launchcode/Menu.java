package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;


public class Menu {
    public ArrayList<MenuItem> appetizers = new ArrayList<>();
    public ArrayList<MenuItem> mainCourses = new ArrayList<>();
    public ArrayList<MenuItem> desserts = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void printLastUpdated() {

    }

    public void printMenuCategory() {

    }

    public void addMenuItem() {

    }
}
