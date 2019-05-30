package j2ee.p4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frm =new JFrame("Traffic");
		JRadioButton red=new JRadioButton("RED");
		JRadioButton yellow=new JRadioButton("YELLOW");
		JRadioButton green=new JRadioButton("GREEN");
		
		ButtonGroup bg =new ButtonGroup();
		
		frm.setSize(600, 600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pl =new JPanel();
		pl.setSize(300, 300);
		frm.setLayout(null);
		
		pl.add(red);
		pl.add(yellow);
		pl.add(green);
		pl.setLayout(null);
		
		 red.setBounds(100,40,60,60);
   		 yellow.setBounds(150,40, 80, 60);
   		 green.setBounds(250,40,110,60);
   		 
		frm.add(pl);
		
		 JLabel tf = new JLabel("Select a colour");
		 tf.setBounds(125,10,150,50);
		 
		 pl.add(tf);
		 
		 
		 red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tf.setForeground(Color.red);
				tf.setText("STOP");
				
				
			}
			 
		 });
		
	

	  green.addActionListener(new ActionListener(){  
			 	public void actionPerformed(ActionEvent e){  
			         	tf.setText("Go");  
			         	tf.setForeground(Color.green);
			 	}  
			 	}); 
	  
		  yellow.addActionListener(new ActionListener(){  
			 	public void actionPerformed(ActionEvent e){  
			         	tf.setText("Ready");  
			         	tf.setForeground(Color.yellow);
			 	}  
			 	});  
	}}
