package EV;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class lookGUI {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void lookscreen() throws IOException{
	      JFrame frame = new JFrame("All reviews");
	     
	      frame.getContentPane().setLayout(null);
	      		try {
	      	        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\colin\\\\Documents\\\\review.txt"));
	      	        String str;
	      	        while ((str = br.readLine()) != null) 
	      	        {
	      	        	
	      	            System.out.println(str);
	      	                    
	      	        }
	      	        br.close();
	      	    } 
	      	    catch (IOException ioe) {}
	      
	      JButton butback = new JButton("BACK");
	      butback.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) 
	      	{
	      		menuGUI menug = new menuGUI();
	      		menug.main(null);
	      		
	      	}
	      });
	      
	      	
	      	
	      butback.setBounds(107, 41, 100, 31);
	      frame.getContentPane().add(butback);
	      
	      frame.setSize(343,171);
	      frame.setVisible(true);
	      
	      
	   
	}
	}

