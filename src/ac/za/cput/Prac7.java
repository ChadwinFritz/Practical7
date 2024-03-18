/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.cput;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Chadwin fritz
 */
public class Prac7 {
    private JLabel lblTitle;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblNationality;
    private JLabel lblPensioner;
    
    private JTextField txtFirstName;
    private JTextField txtLastName;
    
    private JComboBox comboBox;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    
    private Font ft;
    
    public Prac7() {
    
        lblTitle = new JLabel("Title: ");
        comboBox = new JComboBox();
        
        lblFirstName = new JLabel("First Name: ");
        txtFirstName = new JTextField(15);
        
        lblLastName = new JLabel("Last Name: ");
        txtLastName = new JTextField(15);
        
        lblNationality = new JLabel("Nationality: ");
        radioButton = new JRadioButton();
        
        lblPensioner = new JLabel("Pensioner: ");
        checkBox = new JCheckBox();
        
        ft = new Font("Ariel", Font.PLAIN, 24);
        
}
    public void setPrac7() {
         this.setLayout(new GridLayout(4, 3));
            lblTitle.setFont(ft);
            lblFirstName.setFont(ft);
            lblLastName.setFont(ft);
            lblNationality.setFont(ft);
            lblPensioner.setFont(ft);
            txtFirstName.setFont(ft);
            
    }
}
