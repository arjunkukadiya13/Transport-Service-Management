//package servicemanagement;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class LoginPage extends JFrame
{
	
	JButton submitButton;
	TextField name,mobileNo,email;
	Label forName,forMo,forEmail;
	LoginEvent ml = new LoginEvent(this);
	LoginPage()
	{
		super("LoginPage Frame");
		setLayout(null);
		setBounds(0,0,500,500);
		name = new TextField();
		mobileNo = new TextField();
		email = new TextField();
		
		forName = new Label("Enter the Name:");
		forMo = new Label("Enter the Mobile no:");
		forEmail = new Label("Enter the Email address:");
		
		submitButton = new JButton("SUBMIT");
		
		add(name);
		add(mobileNo);
		add(email);
		
		add(forName);
		add(forMo);
		add(forEmail);
		
		add(submitButton);
		
		forName.setBounds(50,50,200,50);
		forMo.setBounds(50,150,200,50);
		forEmail.setBounds(50,250,200,50);
		
		
		name.setBounds(250,50,200,50);
		mobileNo.setBounds(250,150,200,50);
		email.setBounds(250,250,200,50);
		
		submitButton.setBounds(150,350,100,50);
		submitButton.addActionListener(ml);
		
		
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
		LoginPage  mf = new LoginPage();
		mf.setVisible(true);
		
	}
	
}