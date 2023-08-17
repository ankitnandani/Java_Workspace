package com.a168;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DynamicTable implements ActionListener
{

	JFrame frame;
	JTextField tf1,tf2;
	JButton btn1,btn2;
	String name;
	int columns;
	ArrayList<JTextField>list ;
	
	public DynamicTable()
	{
		frame = new JFrame("Dynamic Table");
		tf1=new JTextField(15);
		tf2=new JTextField(15);
		btn1=new JButton("Proceed");
		
		
		btn1.addActionListener(this);
		
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String asdf[])
	{
		new DynamicTable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1)
		{
			columns = Integer.parseInt(tf2.getText().toString());
			System.out.println(columns);
			this.list = new ArrayList<JTextField>();
			
			btn2=new JButton("Generate");
			btn2.addActionListener(this);

			this.list.ensureCapacity(columns);
			
			
			for(int i = 0; i<columns; i++)
			{
				list.add(new JTextField(15));
			}
			
			for(int i =0 ; i<columns; i++)
			{
				System.out.println("hi");
				frame.add(list.get(i));
			}
			frame.add(btn2);
			frame.revalidate();
		}
		
		if(e.getSource() == btn2)
		{
			String url = "jdbc:mysql://localhost:3306/test_jdbc";
			
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				//System.out.println(con);
				
				String query = "CREATE TABLE "+tf1.getText().toString()+" (";
				
				query = query + list.get(0).getText().toString()+ " int not null primary key auto_increment,";
				
				for(int i = 1; i<columns-1;i++)
				{
					query = query + list.get(i).getText().toString()+" varchar(255),";
				}
				
				query=query+ list.get(columns-1).getText().toString()+" varchar(255)";
				
				query=query+");";
						
				System.out.println(query);
				
				Statement stmt = con.createStatement();
				
				int result = stmt.executeUpdate(query);
				
				System.out.println("Success" + result);
			}
			catch (Exception ex) 
			{
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
	}
}
