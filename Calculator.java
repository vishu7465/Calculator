package calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

 abstract class Calculator implements ActionListener{

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bmul,bdiv,bsum,bmin,beq,bcl,bdel,bdec;
	JTextField t;
	
	double a=0,b=0,result=0;
	int op=0;
	public Calculator() {
	
	JFrame f=new JFrame("Calculator");
	f.setLocation(500, 200);
	t=new JTextField();		
	 b1=new Button("1");
	 b2=new Button("2");
	 b3=new Button("3");
	 b4=new Button("4");
	 b5=new Button("5");
	 b6=new Button("6");
	 b7=new Button("7");
	 b8=new Button("8");
	 b9=new Button("9");
	 b10=new Button("0");
	 bmul=new Button("*");
	 bdiv=new Button("/");
	 bsum=new Button("+");
	 bmin=new Button("-");
	 beq=new Button("=");
	 bcl=new Button("C");
	 bdec=new Button(".");
	 bdel=new Button("del");
	 
	 t.setBounds(30,40,280,30);
		b1.setBounds(40,100,50,40);
		b2.setBounds(110,100,50,40);
		b3.setBounds(180,100,50,40);
		bdiv.setBounds(250,100,50,40);
		
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		bmul.setBounds(250,170,50,40);
		
		b7.setBounds(40,240,50,40);
		b8.setBounds(110,240,50,40);
		b9.setBounds(180,240,50,40);
		bmin.setBounds(250,240,50,40);
		
		bsum.setBounds(40,310,50,40);
		b10.setBounds(110,310,50,40);
		beq.setBounds(180,310,50,40);
		bdec.setBounds(40,310,50,40);
		
		bdel.setBounds(60,380,100,40);
		bcl.setBounds(180,380,100,40);
	f.add(t);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(b10);
	f.add(bmul);
	f.add(bdiv);
	f.add(bsum);
	f.add(bmin);
	f.add(beq);
	f.add(bdel);
	f.add(bdec);
		
	
	
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
	f.setBackground(Color.white);
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bsum.addActionListener(this);
		bmin.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bcl.addActionListener(this);
	bdec.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
				t.setText(t.getText().concat("1"));
			
			if(e.getSource()==b2)
				t.setText(t.getText().concat("2"));
			
			if(e.getSource()==b3)
				t.setText(t.getText().concat("3"));
			
			if(e.getSource()==b4)
				t.setText(t.getText().concat("4"));
			
			if(e.getSource()==b5)
				t.setText(t.getText().concat("5"));
			
			if(e.getSource()==b6)
				t.setText(t.getText().concat("6"));
			
			if(e.getSource()==b7)
				t.setText(t.getText().concat("7"));
			
			if(e.getSource()==b8)
				t.setText(t.getText().concat("8"));
			
			if(e.getSource()==b9)
				t.setText(t.getText().concat("9"));
			
			if(e.getSource()==b10)
				t.setText(t.getText().concat("0"));
			
			if(e.getSource()==bdec)
				t.setText(t.getText().concat("."));
			
			if(e.getSource()==bmul)
			{
				a=Double.parseDouble(t.getText());
				op=1;
				t.setText("");
			} 
			
			if(e.getSource()==bdiv)
			{
				a=Double.parseDouble(t.getText());
				op=4;
				t.setText("");
			}
			
			if(e.getSource()==bsum)
			{
				a=Double.parseDouble(t.getText());
				op=3;
				t.setText("");
			}
			
			if(e.getSource()==bmin)
			{
				a=Double.parseDouble(t.getText());
				op=2;
				t.setText("");
			}
			
			if(e.getSource()==beq)
			{
				b=Double.parseDouble(t.getText());
			
		

				switch(op)
				{
					case 1: result=a+b;
						break;
			
					case 2: result=a-b;
						break;
			
					case 3: result=a*b;
						break;
			
					case 4: result=a/b;
						break;
			
					default: result=0;
				}
			
				t.setText(""+result);
			}
			
			if(e.getSource()==bcl)
				t.setText("");
			
			if(e.getSource()==bdel)
			{
				String s=t.getText();
				t.setText("");
				for(int i=0;i<s.length()-1;i++)
				t.setText(t.getText()+s.charAt(i));
			}		
		}
	 
		public static void main(String[] args) {
			
		Calculator c=new Calculator() {
		};
		{
		
		}
		
		
	}
	
	
	
	
}