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
public class Products {
    private ArrayList<Items> products;
    public Products(){
         products = new ArrayList<Items>();
          products.add(new Items("Apple", 2, 10));
       products.add(new Items("Strawberry", 3, 10));
       products.add(new Items("Chocolate", 1, 10));
       products.add(new Items("Peach", 2, 10));
       products.add(new Items("Water", 1, 10));
       products.add(new Items("Milk", 3, 10));
       products.add(new Items("Yoghurt", 4, 10));
       products.add(new Items("Orange", 1, 10));
    }
 
    public ArrayList<Items> Add(String name, int price, int quantity){
        Items itemn = new Items(name, price, quantity);
        products.add(itemn);
        return products;
    }
    public ArrayList<Items> Remove(String name, int price, int quantity){
        Items itemn = new Items(name, price, quantity);
        for(int i=0; i< products.size();i++){
            if(products.get(i).getName().equalsIgnoreCase(itemn.getName())&& products.get(i).getPrice()==itemn.getPrice()&& products.get(i).getQuantity()==itemn.getQuantity()){
                products.remove(i);
            }
    }
        return products;
    }
    public void setItem(String item,String modification){
       for(int i=0;i<products.size();i++){
           if(item==products.get(i).getName()){
               products.get(i).setName(modification);
           }   
    }
    }
    public void setItemInt(String item, int price, int quantity, int modification){
       for(int i=0;i<products.size();i++){
           if(price==products.get(i).getPrice()){
               products.get(i).setPrice(modification);
           }
           if(quantity==products.get(i).getQuantity()){
               products.get(i).setQuantity(modification);
           }
    }
    }
    
    public Items getElement(int i){
        return products.get(i);
    }
  
    
    public String getItemName(int i){
        return products.get(i).getName();
    }
    public int size(){
        return products.size();
    }
    public String print(){
        String s="";
        for(int i=0; i<products.size();i++){
            s =products.get(i).toString();
        }
        return s;
    }
    public String printAll(){
        String s="";
        for(int i=0; i<products.size();i++){
            s +=products.get(i).toString();
        }
        return s;
    }
    public String printName(){
        String s="";
        for(int i=0; i<products.size();i++){
            s +=products.get(i).getName() +"\n";
        }
        return s;
    }
   
}
