package bank.mngment.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    // form number
    
     JTextField pan,aadhar;
     JButton next;
     JRadioButton syes, sno,eyes, eno;
     JComboBox religion, category, occupation,education, income;
     String formno;
     
    SignupTwo(String formno){
       this.formno = formno;
       setLayout(null);
        
       
        setTitle("NEW APPLICATION FORM - PART 2");
      
       
       // label personal detail page one
       JLabel personalDetail = new JLabel("Page 2: Additional Details");
       personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
       personalDetail.setBounds(290, 80, 400, 30);
       add(personalDetail);
       
      
       
       // Religion JLabel
       JLabel name = new JLabel("Religion:");
       name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 140, 100, 30);
       add(name);
       
       // Religion Dropdown, JComboBox
       String valReligion [] = { "-","Muslim", "Hindu", "Sikh", "Christian", "other"};
       religion = new JComboBox(valReligion);
       religion.setBounds(300, 140, 400, 30);
       religion.setBackground(Color.WHITE);
       add(religion);
       

       // Category JLabel 
       JLabel fname = new JLabel("Category:");
       fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 200, 30);
       add(fname);
       
       //Category Dropdown, JComboBox
       String valcategory[]={"General","OBC", "SC", "ST","Other"};
       category = new JComboBox(valcategory);
       category.setBounds(300, 190, 400, 30);
       category.setBackground(Color.WHITE);
       add(category);
       
       // Income JLabel
       JLabel DOB = new JLabel("Income:");
       DOB.setFont(new Font("Raleway", Font.BOLD, 20));
       DOB.setBounds(100, 240, 200, 30);
       add(DOB);
       
       //Income Dropdown
       String incomeCategory[]={"Null","< 1,50,000", "< 2,50,0000", "5,00,000","Upto 10,00,000"};
       income = new JComboBox(incomeCategory);
       income.setBounds(300, 240, 400, 30);
       income.setBackground(Color.WHITE);
       add(income);
       
       // Educational JLabel
       JLabel gender = new JLabel("Educational");
       gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 290, 200, 30);
       add(gender);
   
       // Qualification label
       JLabel eamil = new JLabel("Qualification:");
       eamil.setFont(new Font("Raleway", Font.BOLD, 20));
       eamil.setBounds(100, 315, 200, 30);
       add(eamil);
       
       //Educationa and Qualification Dropdown, JComboBox
       String educationValues[]={"UnderGraduate","Graduate", "Masters", "Doctors","Other"};
       education = new JComboBox(educationValues);
       education.setBounds(300, 315, 400, 30);
       education.setBackground(Color.WHITE);
       add(education);
      
       
       // Occupation Jlabel
       JLabel marital = new JLabel("Occupation:");
       marital.setFont(new Font("Raleway", Font.BOLD, 20));
       marital.setBounds(100, 390, 200, 30);
       add(marital);
       
       // Occupation Dropdwon, JComboBox
       String occupationValues[]={"Employed","Self-Employed", "Bussiness", "Student","Retired","Other"};
       occupation = new JComboBox(occupationValues);
       occupation.setBounds(300, 390, 400, 30);
       occupation.setBackground(Color.WHITE);
       add(occupation);
       
       
       //Pan JLabel
       JLabel address = new JLabel("Pan Number:");
       address.setFont(new Font("Raleway", Font.BOLD, 20));
       address.setBounds(100, 440, 200, 30);
       add(address);
       
        // pan  text field 
       pan  = new JTextField();
       pan.setFont(new Font("Raleway", Font.BOLD, 14));
       pan.setBounds(300, 440, 400, 30);
       add(pan);
       
       //addhar JLabel
       JLabel city = new JLabel("ID Number:");
       city.setFont(new Font("Raleway", Font.BOLD, 20));
       city.setBounds(100, 490, 200, 30);
       add(city);
       
       // City text field 
       aadhar  = new JTextField();
       aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
       aadhar.setBounds(300, 490, 400, 30);
       add(aadhar);
       
       // Senior Citizen JLabel
       JLabel state = new JLabel("Senior Citizen:");
       state.setFont(new Font("Raleway", Font.BOLD, 20));
       state.setBounds(100, 540, 200, 30);
       add(state);
       
       // Yes Senior Citizen JRadion Button
      syes = new JRadioButton("Yes");
      syes.setBounds(300, 540, 200, 30);
      syes.setBackground(Color.WHITE);//Button color
      add(syes);
      
      // No Senior Citizen JRadion Buttion
      sno = new JRadioButton("No");
      sno.setBounds(500, 540, 200, 30);
      sno.setBackground(Color.WHITE);//Button color
      add(sno);
      
      // Group Button for Yes or no Senior Citizen
      ButtonGroup maritalgroup = new ButtonGroup();
      maritalgroup.add(syes);
      maritalgroup.add(sno);
      
       //Existing AccountJLabel
       JLabel pincode = new JLabel("Existing Account:");
       pincode.setFont(new Font("Raleway", Font.BOLD, 20));
       pincode.setBounds(100, 590, 200, 30);
       add(pincode);
       
        // Yes Existing AccountJ Radion Button
      eyes = new JRadioButton("Yes");
      eyes.setBounds(300, 590, 200, 30);
      eyes.setBackground(Color.WHITE);//Button color
      add(eyes);
      
      // No Existing Account JRadion Buttion
      eno = new JRadioButton("No");
      eno.setBounds(500, 590, 200, 30);
      eno.setBackground(Color.WHITE);//Button color
      add(eno);
      
      // Group Button for Yes or no Senior Citizen
      ButtonGroup emaritalgroup = new ButtonGroup();
      emaritalgroup.add(eyes);
      emaritalgroup.add(eno);
      
       
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
        String sreligion = (String) religion.getSelectedItem(); 
        String scategory =  (String) category.getSelectedItem();
        String sincome =  (String) income.getSelectedItem();
        String seducation= (String) education.getSelectedItem();
        String soccupation= (String) occupation.getSelectedItem();
        
        
        String seniorcitizen = null;
        // choossing bettween the raidon button
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen = "No";
        }
        
       
        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "Yes";
        } else if (eno.isSelected()){
            exisitingaccount = "No";
        } 
        
        String span = pan.getText();
        String saadhar= aadhar.getText();
       
        
        
        // run time error are possbile
        
        try {
            Conn c = new Conn();
            // step 4 mysql query
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"', '"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
            c.s.executeUpdate(query); // query will run in mysqul
            
       
            //Signup3 Object
           setVisible(false);
           new SignupThree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new SignupTwo("");
    }
    
}
