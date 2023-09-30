/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turtles.shoppingcart.patelbros;

/**
 *
 * @author sarah
 */
public class WebAutomation {
    private int id;
    private float price;
    private String name;
    private int loc;

    public WebAutomation(int id, float price, String name, int loc) {
        this.id = id;
        this.price = price;
       
        this.name = name;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "WebAutomation{" + "id=" + id + ", price=" + price + ", name=" + name + ", loc=" + loc + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }
    
    public String GetFullPrice(){ 
        float tax = this.price * 0.13f;
        float fullprice = this.price * tax;
        return "" + fullprice;
    }
    
}
