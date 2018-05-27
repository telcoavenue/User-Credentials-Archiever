


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

// imported classes space ........ 



public class passwordGEN extends JFrame
{
	
	            	private JComboBox jcb1;	
      	private  JComboBox jcb2;
	
	private String [] random ;
	
	
	 private JButton result;
	
					private JCheckBox   	numCB;
					private JCheckBox   	LCCD;
					private JCheckBox    UCCD;
					private JCheckBox    SCCD;
					
					private JTextField   TF;
					private JTextField  TF1;
	
	
	private int arithmoi=0;
	private int lcl=0;
	private int ucl=0;
	private int ss=0;
	
	private String [] dynamicARRAY;
	
	private String  [] numbers={"0","1","2","3","4","5","6","7","8","9"};
	
	
	private String  [] numbers1={"1","2","3","4","5"};
	
	
	
	private String [] lowerCASEletters={"q","w","e","r","t","y","u","i","o","p",
		"a","s","d","f","g","h","j","k","l",
		"z","x","c","v","b","n","m"};
		
		
		
		private String [] upperCASEletters={"Q","W","E","R","T","Y","U","I","O","P",
		"A","S","D","F","G","H","J","K","L",
		"Z","X","C","V","B","N","M"};

		
		
		private String [] symbols={"`","~","!","@","#","$","%","^","&","*","(",")","-","_","+","&","=",
		"{","[","}","]",";",":","<",",",">",".","|","\n","?","/"};	
		
		
		
	//	private String [] finalCHOICE={"0","1","2","3","4","5","6","7","8","9",
	//		"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m",
	//		"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M",
	//		"`","~","!","@","#","$","%","^","&","*","(",")","-","_","+","&","=","{","[","}","]",";",":","<",",",">",".","|","\n","?","/"};
		
		
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
		
		
		
		
	
	public passwordGEN()
	{
		
		//=========================================================================================
		
		
		
		
		
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel passwordNOTICE=new JPanel(); 
		
			JPanel  setPASSWORTlength= new JPanel(); 
		
		JPanel passwordRETURNfield=new JPanel();
		
			JPanel passwordGENERATORbutton= new JPanel(); 
		
		//
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//=========================================================================================

			header.setLayout(new FlowLayout(FlowLayout.LEFT));    
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			passwordNOTICE.setLayout(new FlowLayout(FlowLayout.CENTER));    
			passwordNOTICE.setBackground(Color.GRAY); 
			passwordNOTICE.setBorder(BorderFactory.createLineBorder(Color.RED));
			
			setPASSWORTlength.setLayout(new FlowLayout(FlowLayout.CENTER));    
			setPASSWORTlength.setBackground(Color.WHITE); 
			setPASSWORTlength.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			passwordRETURNfield.setLayout(new FlowLayout(FlowLayout.CENTER));    
			passwordRETURNfield.setBackground(Color.WHITE); 
			passwordRETURNfield.setBorder(BorderFactory.createLineBorder(Color.BLACK));	
		
			passwordGENERATORbutton.setLayout(new FlowLayout(FlowLayout.CENTER));    
			passwordGENERATORbutton.setBackground(Color.WHITE); 
			passwordGENERATORbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		//
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
		//=========================================================================================
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////			
		//
		// Program Menu  
		//    Create the menu bar   
		
       JMenuBar KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
      JMenu  MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	JMenu passwordCOMPLEXITY = new JMenu("Password Properties Menu");
	passwordCOMPLEXITY.setForeground(Color.BLACK);
	passwordCOMPLEXITY.setBackground(Color.WHITE); 
		
	JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		  KBMenuBar.add(passwordCOMPLEXITY);
		 KBMenuBar.add(ABOUT);
		 
		 
					 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	JLabel RESET=new JLabel("RESET Setttings");
	  RESET.setBackground(Color.WHITE);
	   RESET.setForeground(Color.BLACK);
	 RESET.setEnabled(true);
    RESET.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =RESET.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           RESET.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          RESET.setForeground(oldcolor);
         }
      }
      );
	RESET.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	try
	{
					
			
					
	 arithmoi=0;
	 lcl=0;
	 ucl=0;
	 ss=0;
				

					
	numCB.setSelected(false);
	LCCD.setSelected(false);
	UCCD.setSelected(false);
	SCCD.setSelected(false);
					
		
					
	TF1.setText("");
		
					
	  
        jcb1.setSelectedIndex(0);	
        jcb2.setSelectedIndex(0);			




    result.setEnabled(true);



					
					
	} 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 MENU.add(RESET);		 

           				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
	  
	  /*
				
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
	 MENU.add(EXIT);	
	 
	 */
      
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
       passwordCOMPLEXITY.add(new JSeparator());//add a seperator line
      
      				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	JLabel passCompMENU=new JLabel("Password Properties Menu");
	passCompMENU.setEnabled(true);
	passCompMENU.setVisible(true);
	  passCompMENU.setBackground(Color.WHITE);
	   passCompMENU.setForeground(Color.BLACK);
    passCompMENU.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =passCompMENU.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           passCompMENU.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          passCompMENU.setForeground(oldcolor);
         }
      }
      );
	passCompMENU.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	// do nothing ...... 
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 passwordCOMPLEXITY.add(passCompMENU);
      
      
         		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
			
      
      passwordCOMPLEXITY.add(new JSeparator());//add a seperator line
      
      
      
               		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
       numCB=new JCheckBox("add integer numbers( 0 -> 9 )",true);   
	numCB.setEnabled(true);
	numCB.setVisible(true);
	numCB.setSelected(false);
	 numCB.setBackground(Color.WHITE);
	   numCB.setForeground(Color.BLACK);
    numCB.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =numCB.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           numCB.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          numCB.setForeground(oldcolor);
         }
      }
      );
      numCB.addActionListener(
		new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
					
        arithmoi=1;
			
			
			}});
		 passwordCOMPLEXITY.add(numCB);// add jlabel to menu
                         


			
			
			        		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      
      
      	passwordCOMPLEXITY.add(new JSeparator());// add a separator line
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
			
			
			
			
	 LCCD=new JCheckBox("add lower case characters",true);   
	LCCD.setEnabled(true);
	LCCD.setVisible(true);
		LCCD.setSelected(false);
	 LCCD.setBackground(Color.WHITE);
	   LCCD.setForeground(Color.BLACK);
    LCCD.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =LCCD.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           LCCD.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          LCCD.setForeground(oldcolor);
         }
      }
      );
      LCCD.addActionListener(
		new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
					
         
	 lcl=1;
			
			
			}});	
	  passwordCOMPLEXITY.add(LCCD);// add clc1 to menu		
			
			
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      	passwordCOMPLEXITY.add(new JSeparator());// add a separator line
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      
      
      
	 UCCD=new JCheckBox("add upper case characters",true);   
	UCCD.setEnabled(true);
	UCCD.setVisible(true);
		UCCD.setSelected(false);
	 UCCD.setBackground(Color.WHITE);
	   UCCD.setForeground(Color.BLACK);
    UCCD.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =UCCD.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           UCCD.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          UCCD.setForeground(oldcolor);
         }
      }
      );
      UCCD.addActionListener(
		new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
					
			
	 ucl=1;
			
			
			}});
      passwordCOMPLEXITY.add(UCCD);// add clc2 to menu 
      
      
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      	passwordCOMPLEXITY.add(new JSeparator());// add a separator line
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      
      
	 SCCD=new JCheckBox("add special characters",true);   
	SCCD.setEnabled(true);
	SCCD.setVisible(true);
	SCCD.setSelected(false);
	 SCCD.setBackground(Color.WHITE);
	   SCCD.setForeground(Color.BLACK);
    SCCD.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =SCCD.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           SCCD.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          SCCD.setForeground(oldcolor);
         }
      }
      );
      SCCD.addActionListener(
		new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
					
		
	 ss=1;
			
			
			}});
      passwordCOMPLEXITY.add(SCCD);// add clc2 to menu 
      
      
      
      
              		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      
	 passwordCOMPLEXITY.add(new JSeparator());// add a separator line
			
			

        		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
			
			
			
      
 //    ButtonGroup  BG = new ButtonGroup();// add buttongroup
	
	//   BG.add(numCB);// add clc1 to buttongroup
	
	//   BG.add(LCCD);// add clc2 to buttongroup
	
	//   BG.add(UCCD);// add clc2 to buttongroup	

      //    BG.add(SCCD);// add clc2 to buttongroup   
       
       
       
       
		 							 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
      
      
      
      
      		JLabel programAuthor=new JLabel("CREDITS !!!");
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
		 		
	JOptionPane.showMessageDialog(null," \n Game created by: \n Constantinos < tinoC23 /> Constantinou \n @ 10/2016 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programAuthor);
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
			header.add(KBMenuBar);	
		
		      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
        	JLabel message=new JLabel("Password Length Limits : 10 to 50 characters long");
	  message.setBackground(Color.WHITE);
	  message.setForeground(Color.GREEN);			
		message.setFont(f);
      passwordNOTICE.add(message);
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      
      
              	JLabel len=new JLabel("Please add the password desirable length : ");
	  len.setBackground(Color.WHITE);
	  len.setForeground(Color.GREEN);			
		len.setFont(f);
      setPASSWORTlength.add(len);
      
      
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      
      	  jcb1 = new JComboBox(numbers1);
        jcb1.setSelectedIndex(0);	
		jcb1.setFont(f);
      setPASSWORTlength.add(jcb1);
      
      
      
      
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      
            
      
      
      	  jcb2 = new JComboBox(numbers);
        jcb2.setSelectedIndex(0);	
		jcb2.setFont(f);
      setPASSWORTlength.add(jcb2);
      
      
      
      
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    
	    
	    
      
      
            	 TF1=new JTextField("",50);
	  TF1.setBackground(Color.WHITE);
	  TF1.setForeground(Color.BLACK);			
		TF1.setFont(f);
      passwordRETURNfield.add(TF1);
      
      
      
      
      
      
      
                  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      
      
      
      
         result=new JButton("Create Password");
	result.setBackground(Color.WHITE);
	result.setForeground(Color.BLACK);			
	result.setFont(f);
	result.setEnabled(true);
	result.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					

			//	System.out.println(	 arithmoi+" "+lcl+" "+ucl+" "+ss+"\n");


				//  get the values  of the two comboboxes // convert the two values to integers 

				
				String n1 = (String)jcb1.getSelectedItem(); // numbers 1->5
					
					String n2 = (String)jcb2.getSelectedItem(); // numbers 0->9
				
				
				// case n1 == 5 and n2 == 1~>9
				
				
				
				int valid=9999;
				
				
				
				if( n1.equals(numbers1[4]) )
				{
					if(n2.equals(numbers[0]))
					{
						
						valid=0;
						
					}
					else
					{
						
						valid=1;
						
					}
				}
				else
				{
					
					valid=0;
					
				}
			
				
				//////////////////////////////////////////////////////////////////////////////////////////
					
				String  numsum=n1;
				numsum=numsum.concat(n2);
				
				int numS=Integer.parseInt(numsum);
				
					String finalPSWD="";
					
				
				
				//////////////////////////////////////////////////////////////////////////////////////////
				
				switch(valid)
				{
					
					case 0 :
				
					
				// check if any of the checkboxes is selected
				
				
				if(  numCB.isSelected() || LCCD.isSelected() || UCCD.isSelected() || SCCD.isSelected()  )
				{
					

					//  check which jcombobox was selected
					//  get the length of the selected combo boxes , combine them and create the 
					// dynamic array
					// parse the selected combo boxes elements to the dynamic array 
					// create the final password
					// ........ 
					
					//	System.out.println(	 arithmoi+" "+lcl+" "+ucl+" "+ss+"\n");
					
					
					/*
					
						private String  [] numbers={"0","1","2","3","4","5","6","7","8","9"};
	
	
	private String [] lowerCASEletters={"q","w","e","r","t","y","u","i","o","p",
		"a","s","d","f","g","h","j","k","l",
		"z","x","c","v","b","n","m"};
		
		
		
		private String [] upperCASEletters={"Q","W","E","R","T","Y","U","I","O","P",
		"A","S","D","F","G","H","J","K","L",
		"Z","X","C","V","B","N","M"};

		
		
		private String [] symbols={"`","~","!","@","#","$","%","^","&","*","(",")","-","_","+","&","=",
		"{","[","}","]",";",":","<",",",">",".","|","\n","?","/"};	
		
		private String [] dynamicARRAY;
					
					*/
					
					
					int fl=0;
					int j=0;
					int process=0;
					
					
					if(arithmoi == 1)
					{
						
						fl=fl+numbers.length;
					//	process++;
						
					}
					if(lcl == 1)
					{
						
						fl=fl+lowerCASEletters.length;
					//	process++;
						
					}
					if(ucl == 1)
					{
						
						fl=fl+upperCASEletters.length;
					//	process++;
						
					}
					if(ss == 1)
					{
						
						fl=fl+symbols.length;
					//	process++;
						
					}
					
					//
					
					try
					{
					dynamicARRAY=new String[fl];
					}
					catch(Exception e2)
					{
						e2.printStackTrace();
					}
					
					//
					
					// for(int i=0;i<dynamicARRAY.length;i++)
					// {
						
					//	System.out.println(dynamicARRAY.length);
						
					// }
					
					//
					
					for(int i=0;i<1;i++)
					{
						
					if(arithmoi == 1)
					{
						
					
						for( j=0;j<numbers.length;j++)
						{
							
							dynamicARRAY[process]=numbers[j];
						process++;
							
						}
						
					}
					if(lcl == 1)
					{
						
					
						 for( j=0;j<lowerCASEletters.length;j++)
						{
							
							dynamicARRAY[process]=lowerCASEletters[j];
						process++;
							
						}
						
					}
					if(ucl == 1)
					{
						
					
						for( j=0;j<upperCASEletters.length;j++)
						{
							
							dynamicARRAY[process]=upperCASEletters[j];
						process++;
							
						}
						
					}
					if(ss == 1)
					{
						
					    for( j=0;j<symbols.length;j++)
						{
							
							dynamicARRAY[process]=symbols[j];
						process++;
							
						}
						
					}
						
					}
					
				//
					
					for(int i=0;i<dynamicARRAY.length;i++)
					{
						
					//	System.out.println(i+" ::: "+dynamicARRAY[i]);
						
					 }
					
					//
					
					process=0;
					j=0;
					
					random=new String[numS];
					
					//
					
					for(int i=0;i<numS;i++)
					{
						
					
						
						
				int csc = new Random().nextInt((dynamicARRAY.length)-1); // Random integer
					
						
                                random[i] = new String(dynamicARRAY[csc]);
						
						
					}
					
					
					
					//
					
					
					
				
					
					
					for(int i=0;i<numS;i++)
					{
						
					
						
                                finalPSWD=finalPSWD.concat(random[i]);
						
						
						
					}
					
					

					
					//
					
					
					TF1.setText(finalPSWD);
					
					
					//
					
					finalPSWD="";
					numsum="";
					numS=0;
					result.setEnabled(false);
					
					//
					
					
				}
				else
				{
					
					
					
					JOptionPane.showMessageDialog(null," No password property is selected \n Please select a password property !!! ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
					
					//
					
					finalPSWD="";
					numsum="";
					numS=0;
					result.setEnabled(false);
					
					//
					
				}
				
				
				

					
					//
					
					
					break;
					
					case 1 :
						
					//
					
					finalPSWD="";
					numsum="";
					numS=0;
					result.setEnabled(false);
					
					//
							
	JOptionPane.showMessageDialog(null," \nPlease enter a correct length for the password of your choice !!! \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
					//
					
					break;
					
				default : 
					// do nothing ....
				break;
					
				}
				
				
				
				
				
				
			}
		});
          passwordGENERATORbutton.add(result);
      
      
      
      
      
      
                  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      // additional code goes here .... [jpanels] 
		
		box.add(header);
		   box.add(passwordNOTICE);
		   box.add(setPASSWORTlength);
		   box.add(passwordRETURNfield);
		   box.add(passwordGENERATORbutton);
		
		JFrame frame=new JFrame(" < tinoC23 /> password generator .... ");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
      
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}
	
	public static void main(String [] tinoC23)
	{
		
		new passwordGEN();
		
		 System.gc();
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}



