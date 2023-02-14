package gui;

import gui.ShoppingPage;
import gui.createAccountEmployee;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField; 

import javax.swing.JOptionPane;

public class LoginPage extends  javax.swing.JFrame{
	   private javax.swing.JButton exitjframButton;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JPasswordField passwordField;
	    private javax.swing.JLabel passwordJlabel;
	    public static javax.swing.JTextField usernameField;
	    private javax.swing.JLabel usernameJlabel;
	public LoginPage() {
		
		  
	        setSize(860, 560);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      
	        JPanel panel = new JPanel();    
	        
	        add(panel);
	     
	        placeComponents(panel);		
	}
	
	  JPasswordField password;
	   JTextField username;
	
		 public static void main(String[] args) {
			 
		JFrame frame = new LoginPage();
			 
			 
        frame.setVisible(true);
        
        
        
		 }

		    private  void placeComponents(JPanel panel) {
		    	
		    	panel.setBackground(Color.GRAY);
		    	
		    
	      


	            jButton2 = new javax.swing.JButton();
	            jButton3 = new javax.swing.JButton();
	            passwordField = new javax.swing.JPasswordField();
	            usernameField = new javax.swing.JTextField();
	            usernameJlabel = new javax.swing.JLabel();
	            passwordJlabel = new javax.swing.JLabel();
	            exitjframButton = new javax.swing.JButton(); 
	            JRadioButton employee = new JRadioButton("Employee");
		          employee.setBounds(350,100,100,25);
		          add(employee);

		    	JRadioButton Mmnager = new JRadioButton("Manager");
		    	Mmnager.setBounds(150,100,100,25);
	          add(Mmnager);
	            JRadioButton customer = new JRadioButton("Customer");
	            customer.setBounds(250,100,100,25);
	            add(customer);
	            
	            ButtonGroup group = new ButtonGroup();
	            group.add(customer);
	            group.add(employee);
	            group.add(Mmnager);

	            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	            jButton2.setBackground(new java.awt.Color(51, 51, 255));
	            jButton2.setText("Login");
	            jButton3.setBackground(new java.awt.Color(51, 51, 255));
	            jButton3.setText("Create an Account");
	            jButton2.addActionListener(e -> {if (customer.isSelected()) {loginButton();}
	            
	            if (Mmnager.isSelected()) loginButton1();
                    if (customer.isSelected()) loginButton();
	            if (employee.isSelected()) loginButton2();
	            
	            });
                    
	            jButton3.addActionListener(e -> {new createAccountEmployee().setVisible(true);
				dispose();
	            });
                    
	            
	            
        
	            usernameJlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	            usernameJlabel.setText("User Name");

	            passwordJlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	            passwordJlabel.setText("Password");

	            exitjframButton.setBackground(new java.awt.Color(255, 51, 51));
	            exitjframButton.setText("Exit");
	              
            
        	
   
        
	    
	     
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(76, 76, 76)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(passwordJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(exitjframButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(109, 109, 109)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
	                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(172, 172, 172))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addComponent(exitjframButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(usernameJlabel))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(passwordJlabel))
	                .addGap(176, 176, 176)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(83, 83, 83))
	        );

	        pack();
       
      
        	
	        jButton2.setBackground(new java.awt.Color(51, 51, 255));
	        jButton3.setBackground(new java.awt.Color(51, 51, 255));
		    
	        usernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

	        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		    
        }
		    
		    
		  
		    
		    
	
		    
		    
		    
		    
		    
		    
		    
  private  void loginButton() {
	  
		    	String sql = "select * from ACCOUNT_C where username = ? and password = ?";
		    		Connection c = null;
		    			Statement stmt = null;
		    	try {
		    			
		    			Class.forName("org.postgresql.Driver");
		    			c= DriverManager.getConnection(
		    					"jdbc:postgresql://localhost:5432/postgres",
		    					"postgres","tinytots");
		    			PreparedStatement pstmt = c.prepareStatement(sql);
		    
		    			pstmt.setString(1, usernameField.getText());
		    			pstmt.setString(2, new String(passwordField.getPassword()));
		    			
		    			ResultSet rs = pstmt.executeQuery();
		    			
		    			if(rs.next())
		    			{
		    				JOptionPane.showMessageDialog(null, "Welcome "+ usernameField.getText(),"Successful Login", JOptionPane.PLAIN_MESSAGE);
		    				dispose();
                                                new ShoppingPage().setVisible(true);
		    				
		    			}
		    			else {
		    				JOptionPane.showMessageDialog(null, "Invalid","UnSuccessful Login", JOptionPane.PLAIN_MESSAGE);
		    				
		    			}
		    			c.close();
        
		    	}
		    	catch(Exception e ) {
		    		
		    		JOptionPane.showMessageDialog(null,e);
		    		e.printStackTrace();
		    	}
  }

 private  void loginButton1() {
	  
  	String sql = "select * from ACCOUNT_E where username = ? and password = ? and position = 'manager'";
  		Connection c = null;
  			Statement stmt = null;
  	try {
  			
  			Class.forName("org.postgresql.Driver");
  			c= DriverManager.getConnection(
  					"jdbc:postgresql://localhost:5432/postgres",
  					"postgres","tinytots");
  			PreparedStatement pstmt = c.prepareStatement(sql);
  
  			pstmt.setString(1, usernameField.getText());
  			pstmt.setString(2, new String(passwordField.getPassword()));
  			
  			ResultSet rs = pstmt.executeQuery();
  			
  			if(rs.next())
  			{
  				JOptionPane.showMessageDialog(null, "Welcome "+ usernameField.getText(),"Successful Login", JOptionPane.PLAIN_MESSAGE);
  				new GuiFormManager().setVisible(true);
  				dispose();
  				
  				
  			}
  			else {
  				JOptionPane.showMessageDialog(null, "Invalid","UnSuccessful Login", JOptionPane.PLAIN_MESSAGE);
  				
  			}
  			c.close();

  	}
  	catch(Exception e ) {
  		
  		JOptionPane.showMessageDialog(null,e);
  		e.printStackTrace();
  	}
  }
  	private  void loginButton2() {
  	  
  	  	String sql = "select * from ACCOUNT_E where username = ? and password = ? and position = 'Employee'";
  	  		Connection c = null;
  	  			Statement stmt = null;
  	  	try {
  	  			
  	  			Class.forName("org.postgresql.Driver");
  	  			c= DriverManager.getConnection(
  	  					"jdbc:postgresql://localhost:5432/postgres",
  	  					"postgres","tinytots");
  	  			PreparedStatement pstmt = c.prepareStatement(sql);
  	  
  	  			pstmt.setString(1, usernameField.getText());
  	  			pstmt.setString(2, new String(passwordField.getPassword()));
  	  			
  	  			ResultSet rs = pstmt.executeQuery();
  	  			
  	  			if(rs.next())
  	  			{
  	  				JOptionPane.showMessageDialog(null, "Welcome "+ usernameField.getText(),"Successful Login", JOptionPane.PLAIN_MESSAGE);
  	  			         new GuiForm().setVisible(true);
  	  				dispose();
  	  				
  	  				
  	  			}
  	  			else {
  	  				JOptionPane.showMessageDialog(null, "Invalid","UnSuccessful Login", JOptionPane.PLAIN_MESSAGE);
  	  				
  	  			}
  	  			c.close();

  	  	}
  	  	catch(Exception e ) {
  	  		
  	  		JOptionPane.showMessageDialog(null,e);
  	  		e.printStackTrace();
  	  	}
  	
}
  
	  
	  
	  
	  
  }