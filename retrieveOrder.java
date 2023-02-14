/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Dina Helmi
 */
public class retrieveOrder {
     private String orderno,total,username;
   
    
    public retrieveOrder(String orderno, String total, String username){
     this.orderno=orderno;
       this.total =total;
       this.username=username;
}
    public void setOrderNo(String orderno){
        this.orderno=orderno;
    }
    
    public String getOrderNo (){
        return orderno;
    }
     public void setTotal(String total){
        this.total=total;
    }
    
    public String getTotal(){
        return total;
    }
    public void setUsername(String username){
       this.username=username;
    }
    public String getUsername(){
        return username;
    }
    
    public String toString(){
        String s = "Order No. "+ orderno +"   Total: $"+total+"   Customer ID: " +username;        
        return s;
    } 
}
