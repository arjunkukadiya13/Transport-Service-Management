//package servicemanagement;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class LoginFrame extends Frame
{
	JButton loginButton;
	LoginEvent ml = new LoginEvent(this);
	LoginFrame()
	{
		super("Login Frame");
		setLayout(null);
		setBounds(0,0,500,500);
		loginButton=new JButton("Login"); 
		add(loginButton);
		
		loginButton.setBounds(100,300,250,50);
		
		
		loginButton.addActionListener(ml);
		
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
		LoginFrame  mf = new LoginFrame ();
		mf.setVisible(true);
		
	}
	
}