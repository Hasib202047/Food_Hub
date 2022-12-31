/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodhub;

/**
 *
 * @author Hasib
 */
public class Mexican_List {
    
    private String food_Item;
    private String Restaurant_Name;
    private int Price;
    private float Avg_rating;
    private String Photo;
    private String ID;

    public Mexican_List(String food_Item, String Restaurant_Name, int Price,float Avg_rating, String Photo,String ID) {
        this.food_Item = food_Item;
        this.Restaurant_Name = Restaurant_Name;
        this.Price =Price;
        this.Avg_rating = Avg_rating;
        this.Photo = Photo;
        this.ID=ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFood_Item() {
        return food_Item;
    }

    public void setFood_Item(String food_Item) {
        this.food_Item = food_Item;
    }

    public String getRestaurant_Name() {
        return Restaurant_Name;
    }

    public void setRestaurant_Name(String Restaurant_Name) {
        this.Restaurant_Name = Restaurant_Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public float getAvg_rating() {
        return Avg_rating;
    }

    public void setAvg_rating(float Avg_rating) {
        this.Avg_rating = Avg_rating;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
}
