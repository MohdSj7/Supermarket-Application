/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.ItemModifiication.produc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

/**
 *
 * @author Dina Helmi
 */
public class ShoppingPage extends javax.swing.JFrame {
      String input,input2,message,message2,result,s,message3;
      Items name;
      int price, total,t,order,size;
      static JCheckBox checkbox;
      static JTextField Quantity;
      int y=2,a;
      static JLabel totaldollar;
      static JList list;
      static ArrayList<itemRetrieve> array = new ArrayList<itemRetrieve>();
     
      Connection c = null;
	Statement stmt = null;
   
    public ShoppingPage(){
        order++;
              initComponents();
              totaldollar = new JLabel ();
              itemtextarea.setText(produc.printName());
              try{
              retrieve();
              }catch (ClassNotFoundException ex) {
              Logger.getLogger(ShoppingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
              s="";
              for(int i=0;i<array.size();i++){
                  s= array.get(i).toString();
                  shoptextarea.append(s +"\n");
                  size++;
              }
              t=0;
              for(int i=0;i<array.size();i++){
                  t += Integer.valueOf(array.get(i).getTotal());
              }
              
              JLabel totalamount = new JLabel ("Total: ");
        totalamount.setForeground(Color.black);
       totalamount.setSize(200,100);
       totalamount.setLocation(8,250);
        cart.add(totalamount, BorderLayout.SOUTH);
        message3="$"+t;
             totaldollar.setText(message3);
        totaldollar.setSize(200,100);
        totaldollar.setLocation(150, 250);
        cart.add(totaldollar, BorderLayout.SOUTH);
              cart.validate();
              array.clear();
              total=t;
              t=0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckOut = new javax.swing.JButton();
        layoutpanel = new javax.swing.JPanel();
        shoppingcartpanel = new javax.swing.JPanel();
        shoppingcart = new javax.swing.JLabel();
        cart = new javax.swing.JPanel();
        itemlabel = new javax.swing.JLabel();
        priceitem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        shoptextarea = new javax.swing.JTextArea();
        AddtoCart = new javax.swing.JButton();
        itemspanel = new javax.swing.JPanel();
        textfield = new javax.swing.JTextField();
        searchItem = new javax.swing.JButton();
        LogOut1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtextarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CheckOut.setBackground(new java.awt.Color(0, 153, 255));
        CheckOut.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        CheckOut.setForeground(new java.awt.Color(255, 255, 255));
        CheckOut.setText("Checkout");
        CheckOut.setBorderPainted(false);
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });

        layoutpanel.setBackground(new java.awt.Color(255, 255, 255));

        shoppingcartpanel.setBackground(new java.awt.Color(204, 204, 204));

        shoppingcart.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        shoppingcart.setText("Shopping Cart");

        cart.setBackground(new java.awt.Color(255, 255, 255));

        itemlabel.setText("Items:");

        priceitem.setText("Price:");

        shoptextarea.setColumns(20);
        shoptextarea.setRows(5);
        jScrollPane2.setViewportView(shoptextarea);

        javax.swing.GroupLayout cartLayout = new javax.swing.GroupLayout(cart);
        cart.setLayout(cartLayout);
        cartLayout.setHorizontalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cartLayout.createSequentialGroup()
                        .addComponent(itemlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceitem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        cartLayout.setVerticalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemlabel)
                    .addComponent(priceitem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout shoppingcartpanelLayout = new javax.swing.GroupLayout(shoppingcartpanel);
        shoppingcartpanel.setLayout(shoppingcartpanelLayout);
        shoppingcartpanelLayout.setHorizontalGroup(
            shoppingcartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingcartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shoppingcartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shoppingcart, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        shoppingcartpanelLayout.setVerticalGroup(
            shoppingcartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingcartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shoppingcart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AddtoCart.setBackground(new java.awt.Color(0, 153, 255));
        AddtoCart.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        AddtoCart.setForeground(new java.awt.Color(255, 255, 255));
        AddtoCart.setText("Add to Cart");
        AddtoCart.setBorderPainted(false);
        AddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoCartActionPerformed(evt);
            }
        });

        itemspanel.setBackground(new java.awt.Color(204, 204, 204));
        itemspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout itemspanelLayout = new javax.swing.GroupLayout(itemspanel);
        itemspanel.setLayout(itemspanelLayout);
        itemspanelLayout.setHorizontalGroup(
            itemspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        itemspanelLayout.setVerticalGroup(
            itemspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        searchItem.setBackground(new java.awt.Color(0, 153, 255));
        searchItem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        searchItem.setForeground(new java.awt.Color(255, 255, 255));
        searchItem.setBorderPainted(false);
        searchItem.setLabel("Search Item");
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layoutpanelLayout = new javax.swing.GroupLayout(layoutpanel);
        layoutpanel.setLayout(layoutpanelLayout);
        layoutpanelLayout.setHorizontalGroup(
            layoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutpanelLayout.createSequentialGroup()
                .addGroup(layoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layoutpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layoutpanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layoutpanelLayout.createSequentialGroup()
                                .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchItem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(shoppingcartpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        layoutpanelLayout.setVerticalGroup(
            layoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoppingcartpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layoutpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        LogOut1.setBackground(new java.awt.Color(0, 153, 255));
        LogOut1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LogOut1.setForeground(new java.awt.Color(255, 255, 255));
        LogOut1.setText("Logout ->");
        LogOut1.setBorderPainted(false);
        LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut1ActionPerformed(evt);
            }
        });

        itemtextarea.setColumns(20);
        itemtextarea.setRows(5);
        jScrollPane1.setViewportView(itemtextarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(CheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(layoutpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(layoutpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
         input = textfield.getText();
        for(int i=0;i<produc.size();i++){
            a=0;
        if(input.equalsIgnoreCase(produc.getItemName(i))){
            a=1;
            name =produc.getElement(i);
            checkbox= new JCheckBox(produc.getItemName(i));
       checkbox.setSize(120, 100);
       checkbox.setLocation(20,50);
        itemspanel.add(checkbox, BorderLayout.SOUTH);
        itemspanel.validate();
        itemspanel.repaint();
        checkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(checkbox.isSelected()){
        JOptionPane.showMessageDialog(null, "Enter Quantity");
        Quantity = new JTextField ("");
        Quantity.setSize(100,25);
        Quantity.setLocation(180, 90);
        itemspanel.add(Quantity, BorderLayout.SOUTH);
        itemspanel.validate();
        itemspanel.repaint();
        
    }
            }
        });
        break;
        }
        }
        if(a==0){
        JOptionPane.showMessageDialog(null, "Item Not Found");
        }
       
    }//GEN-LAST:event_searchItemActionPerformed


    
    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
       order++;
        try {
	Class.forName("org.postgresql.Driver");
	c = DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/postgres",
			"postgres","tinytots");
	System.out.println("Connected to the database");
} catch (Exception  e) {
	e.printStackTrace();
}
  try {
      PreparedStatement ps;
	ps = c.prepareStatement("INSERT INTO ORDER_CONF(ORDERNO,TOTAL,USERNAME) VALUES (?,?,?)");
	
	ps.setInt(1, order);

	ps.setInt(2, total);

	ps.setString(3, LoginPage.usernameField.getText());
        
	if(ps.executeUpdate() != 0) {
		JOptionPane.showMessageDialog(null, "Your Order for " +size+ " items ($" + total+ ") was completed successfully");
	}}catch(Exception ea) {
	ea.printStackTrace();
	    
}
  try{
             PreparedStatement pstml; 
                        pstml = c.prepareStatement("DELETE FROM ORDER_ITEMS WHERE username = ?");
                pstml.setString(1, LoginPage.usernameField.getText());
                pstml.executeUpdate();

  } catch(Exception ea) {
	ea.printStackTrace();
}
  
  shoptextarea.removeAll();
  shoptextarea.validate();
  clearTotal();
    }//GEN-LAST:event_CheckOutActionPerformed

    private void AddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoCartActionPerformed
        input2= Quantity.getText();
        price = name.getPrice()* Integer.parseInt(input2);
       message=input +" x" + input2+"\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t $"+price+"\n";
         JLabel label = new JLabel(message);
       label.setForeground(Color.black);
       label.setSize(200,100);
       label.setLocation(5,y);
        shoptextarea.add(label, BorderLayout.SOUTH);
        y+=20;
        total+=price;
        message2 = "$"+total;
        JLabel totalamount = new JLabel ("Total: ");
        totalamount.setForeground(Color.black);
       totalamount.setSize(200,100);
       totalamount.setLocation(8,500);
        shoptextarea.add(totalamount, BorderLayout.SOUTH);
        totaldollar.setText(message2);
        totaldollar.validate();
        cart.add(totaldollar, BorderLayout.SOUTH);
        cart.validate();
        cart.repaint();
        itemspanel.remove(checkbox);
        itemspanel.remove(Quantity);
        itemspanel.validate();
        itemspanel.repaint();  
        size++;
        
        try {
	Class.forName("org.postgresql.Driver");
	c = DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/postgres",
			"postgres","tinytots");
	System.out.println("Connected to the database");
} catch (Exception  e) {
	e.printStackTrace();
}
        

try {
	
	PreparedStatement ps;
	ps = c.prepareStatement("INSERT INTO ORDER_ITEMS(ITEM,PRICE,QUANTITY,TOTAL,USERNAME) VALUES (?,?,?,?,?)");
	
	ps.setString(1, name.getName());

	ps.setInt(2, name.getPrice());

	ps.setInt(3, Integer.parseInt(input2));
        
        ps.setInt(4, (price));
        
        if(LoginPage.usernameField.getText()!=null){
         ps.setString(5, LoginPage.usernameField.getText());
           }else{
          ps.setString(5, createAccountEmployee.userText.getText());
        }
	
	if(ps.executeUpdate() != 0) {
		JOptionPane.showMessageDialog(null, "Added to Shopping Cart");
		
		
	}}catch(Exception ea) {
	ea.printStackTrace();
	
}

    }//GEN-LAST:event_AddtoCartActionPerformed

    private void LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut1ActionPerformed
dispose();
new LoginPage().setVisible(true);
    }//GEN-LAST:event_LogOut1ActionPerformed

   private void clearTotal(){
       totaldollar.setText("");
   }
   public void retrieve() throws ClassNotFoundException{    
        String query = "select * from ORDER_ITEMS where username = ?";
        try {
           Class.forName("org.postgresql.Driver");
	   c = DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/postgres",
			"postgres","tinytots");

                PreparedStatement pstmt = c.prepareStatement(query);
                                 
             pstmt.setString(1, LoginPage.usernameField.getText());
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()) {
                    array.add(new itemRetrieve(rs.getString("item"),rs.getString("price"),rs.getString("quantity"),rs.getString("total")));
                }
                c.close();
            } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
     
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShoppingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoCart;
    private javax.swing.JButton CheckOut;
    private javax.swing.JButton LogOut1;
    private javax.swing.JPanel cart;
    private javax.swing.JLabel itemlabel;
    private javax.swing.JPanel itemspanel;
    private javax.swing.JTextArea itemtextarea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel layoutpanel;
    private javax.swing.JLabel priceitem;
    private javax.swing.JButton searchItem;
    private javax.swing.JLabel shoppingcart;
    private javax.swing.JPanel shoppingcartpanel;
    private javax.swing.JTextArea shoptextarea;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables
}
