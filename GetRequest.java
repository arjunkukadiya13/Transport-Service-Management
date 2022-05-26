//package servicemanagement;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class GetRequest extends JFrame
{
	
	JButton forTaxi,forTrack;
	
	Label choice;
	LoginEvent ml = new LoginEvent(this);
	GetRequest()
	{
		super("Taxi Frame");
		setLayout(null);
		setBounds(0,0,500,500);
		forTaxi = new JButton("Taxi");
		forTrack = new JButton("Truck");
		
		choice = new Label("What you want");
	
		
		add(choice);
		add(forTaxi);
		add(forTrack);
		
		
		
		forTaxi.setBounds(100,150,150,50);
		forTrack.setBounds(100,250,150,50);
		choice.setBounds(100,50,150,50);
		
		forTaxi.addActionListener(ml);
		forTrack.addActionListener(ml);
		
		
		
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
		GetRequest mf = new GetRequest ();
		mf.setVisible(true);
		
	}
	
}