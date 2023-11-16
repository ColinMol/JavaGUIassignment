package EV;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
import javax.swing.JTextArea;
import java.awt.Font;

public class searchGUI {
	private static JTextField textField;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void searchscreen() throws IOException{
	      JFrame frame = new JFrame("search");
	      frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
	     
	      frame.getContentPane().setLayout(null);
	      
	      JButton btnNewButton = new JButton("BACK");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) 
	      	{
	      		menuGUI menug = new menuGUI();
	      		menug.main(null);
	      	}
	      });
	      btnNewButton.setBounds(434, 11, 89, 23);
	      frame.getContentPane().add(btnNewButton);
	      
	      textField = new JTextField();
	      textField.setBounds(186, 74, 162, 20);
	      frame.getContentPane().add(textField);
	      textField.setColumns(10);
	      
	      JLabel lblNewLabel = new JLabel("Search :");
	      lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	      lblNewLabel.setBounds(93, 67, 83, 34);
	      frame.getContentPane().add(lblNewLabel);
	      
	      JButton btnNewButton_1 = new JButton("Go");
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) 
	      	{
	      		File file = new File("C:\\Users\\colin\\Documents\\review.txt");
	      	    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	      	    while (sc.hasNextLine()) 
	      	    {
	      	        String fileline = sc.nextLine().toLowerCase();
	      	        if (fileline.contains(textField.getText().toLowerCase())) 
	      	        {
	      	            System.out.println(fileline);
	      	            
	      	        }
	      	    }
	      	    
	      	}
	      
		});
	      btnNewButton_1.setBounds(215, 130, 89, 23);
	      frame.getContentPane().add(btnNewButton_1);
	      
	      frame.setSize(560,398);
	      frame.setVisible(true);
	   
	}
	}

