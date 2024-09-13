package bank.mngment.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    // form number
    long random;
    
     JTextField nameTextField, pinTextField, dobTextField, fatherNameTextField, emailTextField, addressTextField, cityTextField, stateTextField;
     JButton next;
     JRadioButton male, female, other, married, unmarried;
     JDateChooser dateChooser;
     
    SignupOne(){
        
       setLayout(null);
        
       Random ran = new Random();
       random = Math.abs(ran.nextLong() % 9000L + 1000L);
        
       //Label form number
       JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
       formno.setFont(new Font("Raleway", Font.BOLD, 38));
       formno.setBounds(140, 20, 600, 40);
       add(formno);
       
       // label personal detail page one
       JLabel personalDetail = new JLabel("Page 1: Personal Details");
       personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
       personalDetail.setBounds(290, 80, 400, 30);
       add(personalDetail);
       
       // name label
       JLabel name = new JLabel("Name:");
       name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 140, 100, 30);
       add(name);
       
       // name text field 
       nameTextField = new JTextField();
       nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       nameTextField.setBounds(300, 140, 400, 30);
       add(nameTextField);

       // fathers name label
       JLabel fname = new JLabel("Father Name:");
       fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 200, 30);
       add(fname);
       
       // father name text field 
       fatherNameTextField = new JTextField();
       fatherNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       fatherNameTextField.setBounds(300, 190, 400, 30);
       add(fatherNameTextField);
       
       // Date of birth label
       JLabel DOB = new JLabel("Date of Birth:");
       DOB.setFont(new Font("Raleway", Font.BOLD, 20));
       DOB.setBounds(100, 240, 200, 30);
       add(DOB);
       
      
       // Date of birth Clander
       dateChooser = new JDateChooser();
       dateChooser.setBounds(300, 240, 400, 30);
       //RGB Coloring
       dateChooser.setForeground(new Color(105, 105, 105));
       add(dateChooser);
       
       // Gender label
       JLabel gender = new JLabel("Gender:");
       gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 290, 200, 30);
       add(gender);
       
       // male radion button
       male = new JRadioButton("Male");
       male.setBounds(300, 290, 60, 30);
       male.setBackground(Color.WHITE);
       add(male);
       
       // Female radion button
       female = new JRadioButton("Female");
       female.setBounds(450, 290, 120, 30);
       female.setBackground(Color.WHITE);
       add(female);
       
       /*group button makes sure that only one of the radion button
        is seleted not both.*/
       
       //gender group button
       ButtonGroup genderGroup = new ButtonGroup();
       genderGroup.add(male);
       genderGroup.add(female);
       
      
       // Eamil label
       JLabel eamil = new JLabel("Eamil Address:");
       eamil.setFont(new Font("Raleway", Font.BOLD, 20));
       eamil.setBounds(100, 340, 200, 30);
       add(eamil);
       
       // Email  text field 
       emailTextField = new JTextField();
       emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       emailTextField.setBounds(300, 340, 400, 30);
       add(emailTextField);
       
       // marital label
       JLabel marital = new JLabel("Marital Status:");
       marital.setFont(new Font("Raleway", Font.BOLD, 20));
       marital.setBounds(100, 390, 200, 30);
       add(marital);
       
       // married radion button
       married = new JRadioButton("Married");
       married.setBounds(300, 390, 100, 30);
       married.setBackground(Color.WHITE);
       add(married);
       
       // unmarried radion button
       unmarried = new JRadioButton("Unmarried");
       unmarried.setBounds(450, 390, 100, 30);
       unmarried.setBackground(Color.WHITE);
       add(unmarried);
       
       //other radion button
       other = new JRadioButton("Other");
       other.setBounds(630, 390, 100, 30);
       other.setBackground(Color.WHITE);
       add(other);
       
       /*group button makes sure that only one of the radion button
        is seleted not both.*/
       
       //marital group button
       ButtonGroup maritalGroup = new ButtonGroup();
       maritalGroup.add(married);
       maritalGroup.add(unmarried);
       maritalGroup.add(other);
       
       //address label
       JLabel address = new JLabel("Address:");
       address.setFont(new Font("Raleway", Font.BOLD, 20));
       address.setBounds(100, 440, 200, 30);
       add(address);
       
        // address  text field 
       addressTextField  = new JTextField();
       addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       addressTextField.setBounds(300, 440, 400, 30);
       add(addressTextField);
       
       //City label
       JLabel city = new JLabel("City:");
       city.setFont(new Font("Raleway", Font.BOLD, 20));
       city.setBounds(100, 490, 200, 30);
       add(city);
       
       // City text field 
       cityTextField  = new JTextField();
       cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       cityTextField.setBounds(300, 490, 400, 30);
       add(cityTextField);
       
       // state label
       JLabel state = new JLabel("State:");
       state.setFont(new Font("Raleway", Font.BOLD, 20));
       state.setBounds(100, 540, 200, 30);
       add(state);
       
       // state text field 
       stateTextField  = new JTextField();
       stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       stateTextField.setBounds(300, 540, 400, 30);
       add(stateTextField);
       
       //pincode label
       JLabel pincode = new JLabel("Pin Code:");
       pincode.setFont(new Font("Raleway", Font.BOLD, 20));
       pincode.setBounds(100, 590, 200, 30);
       add(pincode);
       
       // pin text field 
       pinTextField  = new JTextField();
       pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       pinTextField.setBounds(300, 590, 400, 30);
       add(pinTextField);
       
       //Button
       next = new JButton("Next");
       next.setBackground(Color.BLACK);//Button color
       next.setForeground(Color.WHITE);// text color
       next.setFont(new Font("Raleway", Font.BOLD, 14));
       next.setBounds(620, 660, 80, 30);//where we wante it
       // on clicking on next 
       next.addActionListener(this);
       add(next);
       
       //Fram
       getContentPane().setBackground(Color.WHITE);
       
       setSize(850, 800); 
       setLocation(350, 10);
       setVisible(true);
    }
    // overring
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText(); // get a value in text field
        String fname =  nameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        // choossing bettween the raidon button
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
        String martial = null;
        if(married.isSelected()){
            martial = "Married";
        } else if (unmarried.isSelected()){
            martial = "Unmarried";
        } else if (other.isSelected()){
            martial = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
         String pin = pinTextField.getText();
        String state = stateTextField.getText();
        
        
        // run time error are possbile
        
        try {
            if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                // step 4 DML mysql query
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"', '"+email+"','"+martial+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query); // query will run in mysqul
                 
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new SignupOne();
    }
    
}
