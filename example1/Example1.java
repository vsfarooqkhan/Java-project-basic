package example1;
import java.awt.Color;
import java.util.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

public class Example1 extends JFrame
{
public static void main(String[] args)
{
new Example1();
}	
public Example1()
{
this.setSize(1000,500);
		
this.setLocationRelativeTo(null);

this.setResizable(false);
this.setTitle("Process data");

JPanel thePanel = new JPanel();

JLabel label1 = new JLabel("From:");

JTextField txtbox3=new JTextField("",15);

JLabel label2=new JLabel("To:");
System.out.println("\n");
JTextField txtbox2 = new JTextField(" ",15);
thePanel.add(label1);
thePanel.add(txtbox3);
System.out.println("\n");

thePanel.add(label2);
thePanel.add(txtbox2);
System.out.println();

JLabel label3 = new JLabel();
	label3.setText("\n Select file to share:");
	thePanel.add(label3);
this.setLocation(200,300);


	
JFileChooser fc = new JFileChooser();
thePanel.add(fc);  
JButton button2 = new JButton();
 button2.setText("Process data");
 
thePanel.add(button2);
 
 	JTextArea txtArea1 = new JTextArea(10,30);  //txtArea1 with 15 height and 30 weight
	txtArea1.setText("The processed data will shown here");
thePanel.add(txtArea1);
 	

	
this.add(thePanel);

this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}