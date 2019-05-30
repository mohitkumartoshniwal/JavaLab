package j2ee;

import java.awt.GraphicsConfiguration;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class p5 extends JFrame implements Runnable,ActionListener {
	
	JLabel from, to;
	JTextField fromtf,totf;
	JProgressBar pb;
	JButton copy,stop;
	BufferedInputStream in;
	BufferedOutputStream out;
	
	p5(String title){
		super(title);
		from= new JLabel("Source");
		to=new JLabel("Destination");
		fromtf=new JTextField();
		totf=new JTextField();
		copy=new JButton("Copy");
		stop=new JButton("Stop");
		setLayout(new GridLayout(0,1));
		
		JPanel jp=new JPanel();
		
		
		pb=new JProgressBar(0,100);
		pb.setStringPainted(true);
		add(jp);
		jp.add(pb);
		add(from);
		add(fromtf);
		add(to);
		add(totf);
		add(copy);
		add(stop);
		copy.addActionListener(this);
		stop.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==copy) {
			run();
		}
		
		else if(e.getSource()==stop) {
			try {
				File input=new File(fromtf.getText());
				File output=new File(totf.getText());
				
				if(in!=null)in.close();
				
				if(out!=null) out.close();
				
				in= new BufferedInputStream(new FileInputStream(output));
				Scanner content=new Scanner(in);
				while(content.hasNext()) {
					System.out.println(content.nextLine());
				}
				in.close();
				
				
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File input=new File(fromtf.getText());
		File output=new File(totf.getText());
		
		byte text[]=new byte[100];
		
		
		int total=0,rcount=0,tcount=0;
		try{
			output.createNewFile();
			in= new BufferedInputStream(new FileInputStream(input));
			out= new BufferedOutputStream(new FileOutputStream(output));
			total=in.available();
			while((rcount=in.read(text))!=-1) {
				out.write(text);
				tcount+=rcount;
				
				pb.setValue(tcount*100/total);
			}
			
			in.close();
			out.close();
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p5 frm=new p5("copy");
		frm.setSize(600, 600);
		frm.setVisible(true);

	}
}