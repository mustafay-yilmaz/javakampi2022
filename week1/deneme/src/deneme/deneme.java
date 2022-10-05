package deneme;

import java.awt.LayoutManager;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class deneme extends JFrame implements ActionListener{
	
	JButton b1;
	JPanel pnl;
	
	deneme() {
		super();
		pnl=new JPanel();
		this.add(pnl);
		b1=new JButton("1.Buton");
		pnl.add(b1);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(900,600);
		this.setVisible(true);
		
	}
		
	
	public static void  main(String[] args) throws Exception {
		
		new deneme();
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String s= e.getActionCommand();
		
	}


	
	
	
}
