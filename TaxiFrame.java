//package servicemanagement;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class TaxiFrame extends Frame
{
	//JButton taxiButton;
	LoginEvent ml = new LoginEvent(this);
	TaxiFrame()
	{
		super("Taxi Frame");
		setLayout(null);
		setBounds(0,0,500,500);
		//taxiButton=new JButton("Request for Texi"); 
		//add(taxiButton);
		
		//taxiButton.setBounds(100,300,250,50);
		
		
		
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String s[])
	{
		TaxiFrame  mf = new TaxiFrame ();
		mf.setVisible(true);
		
	}
	
}