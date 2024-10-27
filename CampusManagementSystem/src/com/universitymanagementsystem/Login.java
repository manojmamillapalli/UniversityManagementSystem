package com.universitymanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{
	JButton login, cancel;
	
Login(){
	getContentPane().setBackground(Color.white);
	setLayout(null);
	
	JLabel lblusername=new JLabel("Username");
	lblusername.setBounds(40, 20, 100, 20);
	add(lblusername);
	
	 JTextField tfusername = new JTextField();
      tfusername.setBounds(150, 20, 150, 20);
      add(tfusername);
      
      JLabel lblpassword = new JLabel("Password");
      lblpassword.setBounds(40, 70, 100, 20);
      add(lblpassword);
      
      JPasswordField   tfpassword = new JPasswordField();
      tfpassword.setBounds(150, 70, 150, 20);
      add(tfpassword);
      
      
      login=new JButton("Login");
      login.setBounds(40,140,120,30);
      login.setBackground(Color.BLACK);
      login.setForeground(Color.WHITE);
      login.addActionListener(this);
      login.setFont(new Font("Tahoma", Font.BOLD, 15));
      add(login);
      
      
      cancel=new JButton("cancel");
      cancel.setBounds(180,140,120,30);
      cancel.setBackground(Color.BLACK);
      cancel.setForeground(Color.WHITE);
      cancel.addActionListener(this);
      cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
      add(cancel);
      
      
      ImageIcon i1=new ImageIcon("src/icons/second.jpg");
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350, 0, 200, 200);
		add(image);
		
	
	
	setSize(600,300);//we need to set the size of the outputframe
	setLocation(500, 250);//the frame defaultly opens on the top left corner
	//we need to place it on our required location
	setVisible(true);//by default jframes are not visible
	//we need to setvisible=true
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==login)
	{
		
	}
	else if(ae.getSource()==cancel)
	{
		setVisible(false);;
	}
}

	public static void main(String[] args) {
		new Login();
	}
	
	

}
