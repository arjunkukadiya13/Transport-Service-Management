//package servicemanagement;

import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class LoginEvent implements ActionListener
{
	
	LoginPage lp;
	LoginFrame lf;
	GetRequest gr;
	TaxiFrame tf;
	TruckFrame tf2;
	
	
	LoginEvent(LoginPage f)
	{
		this.lp=f;
		
	}
	
	LoginEvent(LoginFrame f)
	{
		this.lf=f;
		
	}
	LoginEvent(GetRequest f)
	{
		this.gr=f;
		
	}
	LoginEvent(TaxiFrame f)
	{
		this.tf=f;
		
	}
	LoginEvent(TruckFrame f)
	{
		this.tf2=f;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Login"))
		{
			lp = new LoginPage();
			lf = new LoginFrame();
			this.lp.setVisible(true);
			this.lf.setVisible(false);
			
		}
		
		if(e.getActionCommand().equals("SUBMIT"))
		{
			lp = new LoginPage();
			gr = new GetRequest();
			this.gr.setVisible(true);
			this.lp.setVisible(false);
			
		}
		if(e.getActionCommand().equals("Taxi"))
		{
			tf = new TaxiFrame();
			gr = new GetRequest();
			this.tf.setVisible(true);
			this.gr.setVisible(false);
			
		}
		if(e.getActionCommand().equals("Truck"))
		{
			tf2 = new TruckFrame();
			gr = new GetRequest();
			this.tf2.setVisible(true);
			this.gr.setVisible(false);
			
		}
		
		
	}
}