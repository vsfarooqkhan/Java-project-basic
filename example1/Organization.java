package example1;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import java.util.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

public class Organization extends JFrame {

    public static void main(String args[])
    {
        new Organization();
        
    }
    public Organization()
    {
        this.setSize(650,400);
        
        this.setTitle("Cloud Storage");
        
        JPanel thePanel = new JPanel();
       System.out.println("\n");
        thePanel.setLayout(new FlowLayout(FlowLayout.LEFT,70,20));        

      JButton button1=new JButton();
        button1.setText("Organization1");
      button1.setSize(200,200);
        thePanel.add(button1);
       
        
        JButton button2=new JButton();
      button2.setText("Organization 2");
      thePanel.add(button2);
      System.out.println("\n");
      
      JButton button3=new JButton();
      button3.setText("Organization 3");
      thePanel.add(button3);
      
       

      
      this.add(thePanel);
      
        this.setVisible(true);
    }
}
