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
public class itemRetrieve {

    private String name;
    private String price, quantity,total;
    
    public itemRetrieve(String name, String price, String quantity, String total){
       this.name= name;
       this.price= price;
       this.quantity= quantity;
       this.total =total;
}
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName (){
        return name;
    }
     public void setTotal(String total){
        this.total=total;
    }
    
    public String getTotal(){
        return total;
    }
    public void setPrice(String price){
        this.price=price;
    }
    public String getPrice(){
        return price;
    }
    public void setQuantity(String quantity){
       this.quantity=quantity;
    }
    public String getQuantity(){
        return quantity;
    }
    
    public String toString(){
        String s = name +" x"+ quantity + "\t \t $"+total;        
        return s;
    } 
    
}
