





// imported classes area .....




import javax.swing.JComboBox;

import java.util.Arrays;

import javax.swing.JCheckBox;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.StringTokenizer;
import java.lang.Math;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.MissingResourceException;



// imported classes space ........ 






public class archiever extends JFrame
{
	
	
	
	
	//
	
	
	public  JLabel currentPATHdirectory;
	
	
	//
	
	public String FILEname="C:/Temp/";
	
	//
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
	
	//
	
	public archiever()
	{
		
		
		
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel currentDIRECTORY=new JPanel(); 
		
		JPanel fireJButton = new JPanel(); 
		
		JPanel createFILE=new JPanel(); 
		
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//
	
					header.setLayout(new FlowLayout(FlowLayout.LEFT));    
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			currentDIRECTORY.setLayout(new FlowLayout(FlowLayout.CENTER));    
			currentDIRECTORY.setBackground(Color.GRAY); 
			currentDIRECTORY.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			createFILE.setLayout(new GridLayout(6,1,5,5));
		createFILE.setBackground(Color.CYAN);
		createFILE.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
					fireJButton.setLayout(new FlowLayout(FlowLayout.CENTER));    
			fireJButton.setBackground(Color.GRAY); 
			fireJButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			//
			
			
			  JMenuBar KBMenuBar = new JMenuBar();
			
			      JMenu  options = new JMenu("MENU");
		options.setForeground(Color.BLACK);
		options.setBackground(Color.WHITE);
		
		
			JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(options);
		 KBMenuBar.add(ABOUT);
		
		
			
			
			//
			

            
		JLabel	saveTHEcontent=new JLabel("set a new directory path ....");
	  saveTHEcontent.setBackground(Color.WHITE);
	   saveTHEcontent.setForeground(Color.BLACK);
	 saveTHEcontent.setEnabled(true);
    saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =saveTHEcontent.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           saveTHEcontent.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          saveTHEcontent.setForeground(oldcolor);
         }
      }
      );
	saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		
		//
		
		String fN = JOptionPane.showInputDialog(null, "Please enter your preferred directory name \n  ");
		
		//
		
		FILEname=fN;
		
		//
		
		currentPATHdirectory.setText("current directory path is : "+FILEname);
		
		//
		
		
		
		
			//	String[] lines = TA.getText().split("\n"); 
			
                                  /*
		
				for(int i = 0 ; i<lines.length; i++)
				{
                                   System.out.println(lines[i]);
				}
		
				*/
		
		//
		
		
		/*
		  
	
         try 
	{
	
            BufferedWriter out = new BufferedWriter(new FileWriter(FILEname));
          
		
	for(int i=0;i<lines.length;i++)
	    {
		    
            out.write(lines[i]);
		    
		     out.newLine(); 
		    
	    }
	    
            out.close();
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
	
	
			*/	
		
	//
		 		
        }
		
      }
      );
       options.add(new JSeparator());//add a seperator line
	 options.add(saveTHEcontent);	
       options.add(new JSeparator());//add a seperator line

	  
	  
	  //
	  
	  
	  
	  JLabel generateApassword=new JLabel("Generate a password !!!");
	  generateApassword.setBackground(Color.WHITE);
	   generateApassword.setForeground(Color.BLACK);
	 generateApassword.setEnabled(true);
	  generateApassword.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =generateApassword.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           generateApassword.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          generateApassword.setForeground(oldcolor);
         }
      }
      );
	  	generateApassword.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	                passwordGEN pg = new passwordGEN();
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	  	 options.add(generateApassword);	
	options.add(new JSeparator());//add a seperator line
	  

			//
	  
					
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 options.add(EXIT);	
	options.add(new JSeparator());//add a seperator line
      
	  
	  //
	  
	  
	  
	    
      
      		JLabel programAuthor=new JLabel("author ...");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n program created by: \n Constantinos < tinoC23 /> Constantinou \n @ 05/2018 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
	  ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
				
				 //
	  
	  
	    
      
      		JLabel programVsion=new JLabel("program version .....");
	  programVsion.setBackground(Color.WHITE);
	  programVsion.setForeground(Color.BLACK);
	 programVsion.setEnabled(true);
   programVsion.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programVsion.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programVsion.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programVsion.setForeground(oldcolor);
         }
      }
      );
	programVsion.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n user credentials archiever ::: version 1.00 \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programVsion);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
	  
	  //
	  
	  
	  	JLabel technologyUSED=new JLabel("technology used .....");
	  technologyUSED.setBackground(Color.WHITE);
	  technologyUSED.setForeground(Color.BLACK);
	 technologyUSED.setEnabled(true);
   technologyUSED.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =technologyUSED.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           technologyUSED.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         technologyUSED.setForeground(oldcolor);
         }
      }
      );
	technologyUSED.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Program created by using the following technologies : \n 1) Java JDK version 8 \n 2) SciTE text editor version 4 \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(technologyUSED);
	  ABOUT.add(new JSeparator());//add a seperator line
	  
	  
	  //
	  
	  
	  header.add(KBMenuBar);	
	  
	  
	  //
	  
	  
	  
	  
	   currentPATHdirectory=new JLabel("current directory path is : "+FILEname);
	  currentPATHdirectory.setBackground(Color.WHITE);
	  currentPATHdirectory.setForeground(Color.GREEN);			
		currentPATHdirectory.setFont(f);
      currentDIRECTORY.add(currentPATHdirectory);
      
	  
	  
	  //
	  
	  
	  
	  JLabel fnLabel=new JLabel("enter the desired filename, followed by the file extension .txt ( ex. myfile.txt ) : ");
	fnLabel.setHorizontalAlignment(JLabel.CENTER);
	  fnLabel.setBackground(Color.WHITE);
	  fnLabel.setForeground(Color.BLACK);			
		fnLabel.setFont(f);
		createFILE.add(fnLabel);
		
		
		
		JTextField fnTF=new JTextField(" ",45);
	  fnTF.setBackground(Color.WHITE);
	  fnTF.setForeground(Color.BLACK);			
		fnTF.setFont(f);
	  createFILE.add(fnTF);
	  
	  
	  //
	  
	  
	  
	  JLabel unLabel=new JLabel("enter the desired username : ");
	unLabel.setHorizontalAlignment(JLabel.CENTER);
	  unLabel.setBackground(Color.WHITE);
	  unLabel.setForeground(Color.BLACK);			
		unLabel.setFont(f);
		createFILE.add(unLabel);
		
		
		
		JTextField unTF=new JTextField(" ",45);
	  unTF.setBackground(Color.WHITE);
	  unTF.setForeground(Color.BLACK);			
		unTF.setFont(f);
		createFILE.add(unTF);
	  
	  
	  
	  //
	  
	  
	  
	  
	  JLabel pwLabel=new JLabel(" enter the desired password : ");
	pwLabel.setHorizontalAlignment(JLabel.CENTER);
	  pwLabel.setBackground(Color.WHITE);
	  pwLabel.setForeground(Color.BLACK);			
		pwLabel.setFont(f);
		createFILE.add(pwLabel);
		
		
		
		JTextField pwTF=new JTextField(" ",45);
	  pwTF.setBackground(Color.WHITE);
	  pwTF.setForeground(Color.BLACK);			
		pwTF.setFont(f);
	  createFILE.add(pwTF);
	  
	  
	  
	  //
	  
	  
	  
	  
	  JButton createFile=new JButton("create file");
	createFile.setBackground(Color.WHITE);
	createFile.setForeground(Color.BLACK);			
	createFile.setFont(f);
	createFile.setEnabled(true);
	  createFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
		String fileNAME = fnTF.getText();
				
			String usrNAME = unTF.getText();
				
				String usrPSWRD = pwTF.getText();
				
				String sometext=FILEname+fileNAME;
				
				
				File file = new File(sometext);
				
				
				System.out.println(file);

	try
		{
	  if (!file.exists()) 
	{
	     file.createNewFile();
	  }
  }
     catch (IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
		
		
		
		
				
	
	try 
	{
		
		
	
		
	BufferedWriter out = new BufferedWriter(new FileWriter(file));
		    
		
		
		  out.newLine(); 
		
            out.write(" username : "+usrNAME);
		    
		  out.newLine(); 
		
		 out.write(" password : "+usrPSWRD);
		    
	     out.newLine(); 
		
		
		
		
	    
            out.close();
		
		
		
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
		
		
		
				
		fnTF.setText(" ");
				
		 unTF.setText(" ");
				
		pwTF.setText(" ");
			
		
				
				
		}});		
		fireJButton.add(createFile);


		
				
		
	      // 
	  
		
		
		box.add(header);
		   box.add(currentDIRECTORY);
		   box.add(createFILE);
		     box.add(fireJButton);
		
		JFrame frame=new JFrame(" user credentials archiever ..... ");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
		
		
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String [] tinoC23)
	{
		
		new archiever();
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}


