/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;

/**
 *
 * @author Dina Helmi
 */
public class Items {
    private String name;
    private int price, quantity;
    
    public Items(String name, int price, int quantity){
       this.name= name;
       this.price= price;
       this.quantity= quantity;
}
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName (){
        return name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
       this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    
    
    public String toString(){
        return String.format("Name: %s, Price: $%s, Quantity Available: %s \n", name, price, quantity);
    }
    
    
    
}
