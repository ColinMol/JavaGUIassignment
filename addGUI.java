package EV;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addGUI {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void addscreen() throws IOException{
	      JFrame frame = new JFrame("Review");
	      
	      JLabel label = new JLabel("Movie name : ", SwingConstants.LEFT);
	      label.setBounds(23, 8, 67, 14);
	      JTextField name = new JTextField(20);
	      name.setBounds(134, 5, 166, 20);
	      name.setText("Avengers");
	      JTextField desc = new JTextField(20);
	      desc.setBounds(134, 36, 166, 20);
	      desc.setText("action");
	      JTextField review = new JTextField(500);
	      review.setBounds(134, 75, 171, 70);
	      review.setText("An instant classic and Family friendly");
	      JTextField rating = new JTextField(500);
	      rating.setBounds(134, 156, 171, 20);
	      rating.setText("88%");
	     
	      frame.getContentPane().setLayout(null);
	      frame.getContentPane().add(label);
	      frame.getContentPane().add(name);
	      frame.getContentPane().add(desc);
	      frame.getContentPane().add(review);
	      frame.getContentPane().add(rating);
	      
	      JLabel label2 = new JLabel("Genre : ", SwingConstants.LEFT);
	      label2.setBounds(23, 33, 39, 14);
	      frame.getContentPane().add(label2);
	      
	      JLabel label3 = new JLabel("Comments : ", SwingConstants.LEFT);
	      label3.setBounds(23, 78, 60, 14);
	      frame.getContentPane().add(label3);
	      
	      JLabel label4 = new JLabel("Rating : ", SwingConstants.LEFT);
	      label4.setBounds(23, 156, 39, 14);
	      frame.getContentPane().add(label4);
	      
	      JButton butsave = new JButton("Save");
	      butsave.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) 
	      	{	
	      		try
	      	    {
	      	        FileWriter fw = new FileWriter("C:\\Users\\colin\\Documents\\review.txt",true);
	      	     
	      	        fw.append("\n Title: " + name.getText());
	      	        fw.append("\n Genre: " + desc.getText());
	      	        fw.append("\n comments: " + review.getText());
	      	        fw.append("\n rating: " + rating.getText());
	      	        fw.append("\n \n");
	      	        
	      	        fw.flush(); // empty buffer in the file
	      	        fw.close(); // close the file to allow opening by others applications
	      	        System.out.println("Success");
	      	    }
	      	    catch(IOException ioException)
	      	    {
	      	        ioException.printStackTrace();
	      	    }
	      	}
	      });
	      
	      	
	      	
	      butsave.setBounds(424, 155, 89, 23);
	      frame.getContentPane().add(butsave);
	      
	      JButton btnNewButton = new JButton("BACK");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) 
	      	{
	      		menuGUI menug = new menuGUI();
	      		menug.main(null);
	      	}
	      });
	      btnNewButton.setBounds(424, 4, 89, 23);
	      frame.getContentPane().add(btnNewButton);
	      
	      frame.setSize(550,250);
	      frame.setVisible(true);
	   
	}
	}

