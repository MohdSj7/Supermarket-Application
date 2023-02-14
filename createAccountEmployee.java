package gui;


import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class createAccountEmployee extends javax.swing.JFrame {
	
	Connection c = null;
	Statement stmt = null;
	
	 JPanel panel;

	  static JTextField userText;
	  JPasswordField passwordText ;
	  JTextField firstName1;
	  JTextField lastName1;
	  JTextField email1;
	  JTextField Position1;
	  JRadioButton manager;
		 JRadioButton employee;
		 JRadioButton customer;
		 
		 JTextField address;
		 JLabel address1;
		 JTextField position;
		 JLabel Position;
		 JLabel adress;
		 JTextField  adress1;
		 JTextField  Cpassword1;
		 

    
	public  createAccountEmployee() { 
		
	        setSize(800, 700);
	  
	        JPanel panel = new JPanel();    
	        add(panel);
	      
	  
	        placeComponents(panel);
		
	}
    public static void main(String[] args) {    
		JFrame frame = new createAccountEmployee();


        frame.setVisible(true);
    }

    private  void placeComponents(JPanel panel) {

       
        panel.setLayout(null);
        
      

        
    	
        
        
        
        
        
        
        // Creating JLabel
	
	
	
	
	
	  
	
	
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(50,100,300,25);
        panel.add(userLabel);

         userText = new JTextField(20);
        userText.setBounds(210,100,150,25);
        panel.add(userText);
        
        

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,170,300,25);
        panel.add(passwordLabel);

      
         passwordText = new JPasswordField(20);
        passwordText.setBounds(210,170,150,25);
        panel.add(passwordText);
        
        JLabel Cpassword = new JLabel("Confirm Password");
        Cpassword.setBounds(50,240,300,25);
        panel.add(Cpassword);

      
        Cpassword1 = new JPasswordField(20);
        Cpassword1.setBounds(210,240,150,25);
        panel.add(Cpassword1);
        
        
        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(50,310,300,25);
        panel.add(firstName);

         firstName1 = new JTextField(20);
        firstName1.setBounds(210,310,150,25);
        panel.add(firstName1);
        
        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(50,380,300,25);
        panel.add(lastName);

         lastName1 = new JTextField(20);
        lastName1.setBounds(210,380,150,25);
        panel.add(lastName1);
        
        JLabel email = new JLabel("Email Adress");
        email.setBounds(50,450,300,25);
        panel.add(email);

         email1 = new JTextField(20);
        email1.setBounds(210,450,150,25);
        panel.add(email1);
        
        JLabel adress = new JLabel("Address");
    	adress.setBounds(50,510,300,25);
	    panel.add(adress);

    	 adress1 = new JTextField(20);
    	    adress1.setBounds(210,510,150,25);
    	    panel.add(adress1);
    	    
    	    JLabel Position = new JLabel("Position (Manager / Employee)");
    	    Position.setBounds(50,590,300,25);
    	    panel.add(Position);

        	 position = new JTextField(20);
        	 position.setBounds(310,590,150,25);
        	    panel.add(position);
    	    
    	    JRadioButton customer = new JRadioButton("Customer");
            customer.setBounds(200,30,300,50);
            panel.add(customer);
            customer.addItemListener(e -> { 
            	
           	 if((e.getStateChange() == ItemEvent.SELECTED)) {
        	    	
        	    	
            	    
            	    position.setEditable(false);
            	    
            	    }
            	    
            	    else
            	    	
                	 position.setEditable(true); 
           	
   		});
            
            
            
            
            
            

            JRadioButton employee = new JRadioButton("Employee");
            employee.setBounds(100,30,300,50);
            employee.addItemListener(e -> { 
            	
            	 if((e.getStateChange() == ItemEvent.SELECTED)) {
         	    	
         	    	
             	    
             	    adress1.setEditable(false);
             	    
             	    }
             	    
             	    else
             	    	
                 	    adress1.setEditable(true); 
            	
    		});

            panel.add(employee);

            
            
            ButtonGroup group = new ButtonGroup();
            group.add(customer);
            group.add(employee);
            group.add(manager);
            userLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
            passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
            Cpassword.setFont(new java.awt.Font("Tahoma", 0, 18));
            firstName.setFont(new java.awt.Font("Tahoma", 0, 18));
            lastName.setFont(new java.awt.Font("Tahoma", 0, 18));
            email.setFont(new java.awt.Font("Tahoma", 0, 18));
            adress.setFont(new java.awt.Font("Tahoma", 0, 18));
            Position.setFont(new java.awt.Font("Tahoma", 0, 18));

    	    
    	    
            
    	    
    	    
        // Creating login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(600, 540, 120, 50);
        panel.add(loginButton);
        loginButton.addActionListener(e -> { new LoginPage().setVisible(true);
        dispose();
		});
       
    
        
        JButton creatAccount = new JButton("Create");
        creatAccount.setBounds(600, 450, 120, 50);
        panel.add(creatAccount);
        
        loginButton.setBackground(new java.awt.Color(51, 51, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        creatAccount.setBackground(new java.awt.Color(51, 51, 255));
        creatAccount.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        
        creatAccount.addActionListener(e -> {
        	
        	if(confirm() && customer.isSelected()) {
        		createAccountEmployee();
        	}
        	else if (confirm() && employee.isSelected()) {
        		createAccountEmployee1();
        		
        	}
        	
        	else
        		JOptionPane.showMessageDialog(null, "The passwords do not match");

        	
        	
        
        });
        
     
     
 
    		
    		
    	}

        
        
        

        
       
    
    
    
    
    public boolean verifyFields()
    {
    	String username = userText.getText();
    	String password = String.valueOf(passwordText.getPassword());
    	String password2 = String.valueOf(((JPasswordField) Cpassword1).getPassword());
    	String firstNamex = firstName1.getText();
    	String lastNamex = lastName1.getText();
    	String emailx = email1.getText();
    	String addresx = adress1.getText();
    	
    	if(customer.isSelected()) {
    	
    	if(username.trim().equals("") ||password.trim().equals("")||password2.trim().equals("") ||firstNamex.trim().equals("")||lastNamex.trim().equals("") ||addresx.trim().equals("") ||emailx.trim().equals("")){
    		
    		JOptionPane.showMessageDialog(null, "Please fill all the fields");
    		return false;
    		
    	}  	
    }
    	    		return true;

    }
    
    public boolean verifyFields1()
    {
    	String username = userText.getText();
    	String password = String.valueOf(passwordText.getPassword());
    	String password2 = String.valueOf(((JPasswordField) Cpassword1).getPassword());
    	String firstNamex = firstName1.getText();
    	String lastNamex = lastName1.getText();
    	String emailx = email1.getText();
    	String positionx = position.getText();
    	
    	if(employee.isSelected()) {
    	
    	if(username.trim().equals("") ||password.trim().equals("")||password2.trim().equals("") ||firstNamex.trim().equals("")||lastNamex.trim().equals("") ||positionx.trim().equals("") ||emailx.trim().equals("")){
    		
    		JOptionPane.showMessageDialog(null, "Please fill all the fields");
    		return false;
    		
    	}  	
    }
    	    		return true;

    }
    
    public boolean CheckUserNameC(String userText) {
    	
    	try {
    		Class.forName("org.postgresql.Driver");
    		c= DriverManager.getConnection(
    				"jdbc:postgresql://localhost:5432/postgres",
    				"postgres","tinytots");
    		System.out.println("Connected to the database");
    	} catch (Exception  e) {
    		e.printStackTrace();
    	}
    	
    	PreparedStatement st;
    	ResultSet rs;
    	boolean username_exist = false;
    	
    	
    	try {
    		    	String sql="SELECT * FROM ACCOUNT_C WHERE USERNAME =?";

    		c.setAutoCommit(false);
			stmt = c.createStatement();
    		
    		st= c.prepareStatement(sql);
    		
			st.setString(1, userText);
    		rs=st.executeQuery();
    		
    		if(rs.next()) {
    			username_exist=true;
    			JOptionPane.showMessageDialog(null,"This Username is Taken","Username Failed",2);
    		}
    		
    		
    		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return username_exist;
    	
    }
    

    public boolean CheckUserNameE(String userText) {
    	try {
    		Class.forName("org.postgresql.Driver");
    		c= DriverManager.getConnection(
    				"jdbc:postgresql://localhost:5432/postgres",
    				"postgres","tinytots");
    		System.out.println("Connected to the database");
    	} catch (Exception  e) {
    		e.printStackTrace();
    	}
    	
    	PreparedStatement st;
    	ResultSet rs;
    	boolean username_exist = false;
    	
    	String sql="SELECT * FROM ACCOUNT_E WHERE USERNAME =?";
    	
    	try {
    		
    		c.setAutoCommit(false);
			stmt = c.createStatement();
    		
    		st= c.prepareStatement(sql);
    		
			st.setString(1, userText);
    		rs=st.executeQuery();
    		
    		if(rs.next()) {
    			username_exist=true;
    			JOptionPane.showMessageDialog(null,"This Username is Taken","Username Failed",2);
    		}
    		
    		
    		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return username_exist;

	
}

  
  public boolean confirm() {
    	
    	String pass1=Cpassword1.getText();
    	String pass2=passwordText.getText();
    	

    	if(!pass1.equals(pass2))
    	{
    	
return false ;   		
    	}
    	else 
    		return true;
    }
  
	 	  
	  
  

  private  void createAccountEmployee1() {
	  
	  
	  
	  if(userText.getText().isEmpty() || passwordText.getText().isEmpty() || Cpassword1.getText().isEmpty()|| firstName1.getText().isEmpty() || lastName1.getText().isEmpty() || email1.getText().isEmpty() || position.getText().isEmpty() ) {
  		
  		JOptionPane.showMessageDialog(this, "Missing Info");

  	}
  	else {
  	
  	
ItemModifiication GUI = new ItemModifiication();
GUI.setVisible(true);
GUI.pack();
GUI.setLocationRelativeTo(null);
GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.dispose();

try {
	Class.forName("org.postgresql.Driver");
	c= DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/postgres",
			"postgres","tinytots");
	System.out.println("Connected to the database");
} catch (Exception  e) {
	e.printStackTrace();
}




try {
	
	PreparedStatement ps;
	ps = c.prepareStatement("INSERT INTO ACCOUNT_E (USERNAME,PASSWORD,CONFIRMPASSWORD,FIRSTNAME,LASTNAME,EMAIL,POSITION) VALUES (?,?,?,?,?,?,?)");
	
	
	
	ps.setString(1, userText.getText());
	
	ps.setString(2, String.valueOf(passwordText.getPassword()));
	
	ps.setString(3, String.valueOf(((JPasswordField) Cpassword1).getPassword()));

	ps.setString(4, firstName1.getText());

	ps.setString(5, lastName1.getText());

	ps.setString(6, email1.getText());
	
	ps.setString(7, position.getText());
	
	if(ps.executeUpdate() != 0) {
		JOptionPane.showMessageDialog(null, "created");
		
		
	}
	else JOptionPane.showMessageDialog(null, "wrong");

	
	
}catch(Exception ea) {
	ea.printStackTrace();
	
}
};
  	
  	
  }
	  
	  
  

    
    
    
    private  void createAccountEmployee() {
    	
    	
if(userText.getText().isEmpty() || passwordText.getText().isEmpty() || Cpassword1.getText().isEmpty()|| firstName1.getText().isEmpty() || lastName1.getText().isEmpty() || email1.getText().isEmpty() || adress1.getText().isEmpty() ) {
    		
    		JOptionPane.showMessageDialog(this, "Missing Info");

    	}
    	else {
    	
    	
ShoppingPage GUI = new ShoppingPage();
GUI.setVisible(true);
GUI.pack();
GUI.setLocationRelativeTo(null);
GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.dispose();

try {
	Class.forName("org.postgresql.Driver");
	c= DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/postgres",
			"postgres","tinytots");
	System.out.println("Connected to the database");
} catch (Exception  e) {
	e.printStackTrace();
}




try {
	
	PreparedStatement ps;
	ps = c.prepareStatement("INSERT INTO ACCOUNT_C (USERNAME,PASSWORD,CONFIRMPASSWORD,FIRSTNAME,LASTNAME,EMAIL,ADDRESS) VALUES (?,?,?,?,?,?,?)");
	
	
	
	ps.setString(1, userText.getText());
	
	ps.setString(2, String.valueOf(passwordText.getPassword()));
	
	ps.setString(3, String.valueOf(((JPasswordField) Cpassword1).getPassword()));

	ps.setString(4, firstName1.getText());

	ps.setString(5, lastName1.getText());

	ps.setString(6, email1.getText());
	
	ps.setString(7, adress1.getText());
	
	if(ps.executeUpdate() != 0) {
		JOptionPane.showMessageDialog(null, "created");
		
		
	}
	else JOptionPane.showMessageDialog(null, "wrong");

	
	
}catch(Exception ea) {
	ea.printStackTrace();
	
}
};
    	
    	
    }
    
    	
    	

    }