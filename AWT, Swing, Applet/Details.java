import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Details extends JFrame implements ActionListener,ItemListener,KeyListener{
	JLabel jl1,jl2,jl3;
	JTextField jtf1,jtf2;
	JRadioButton jrb1,jrb2,jrb3;
	ButtonGroup bg;
	JCheckBox jcb1,jcb2,jcb3;
	JPanel jp1,jp2,jp3;
	String msg1="Name:",msg2="Class:",msg3="Hobbies:";
	String t1=" ",t2=" ",t3=" ";
	
	Details(){
		setLocation(100,100);
		setLayout(new BorderLayout());
		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1,2));
		jl1=new JLabel("Name");
		jp1.add(jl1);
		jtf1= new JTextField(20);
		jp1.add(jtf1);
		add(jp1,BorderLayout.NORTH);
		
		jp2=new JPanel();
		jp2.setLayout(new GridLayout(4,2));
		jl2=new JLabel("class");
		jp2.add(jl2);
		jl3=new JLabel("Name");
		jp2.add(jl3);
		jrb1=new JRadioButton("FY");
		jp2.add(jrb1);
		jcb1=new JCheckBox("Music");
		jp2.add(jcb1);
		
		jrb2=new JRadioButton("SY");
		jp2.add(jrb2);
		jcb2=new JCheckBox("Dance");
		jp2.add(jcb2);
		
		jrb3=new JRadioButton("TY");
		jp2.add(jrb3);
		jcb3=new JCheckBox("Sport");
		jp2.add(jcb3);
		
		bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		
		add(jp2,BorderLayout.CENTER); 
		
		jp3=new JPanel();
		jp3.setLayout(new GridLayout(1,1));
		jtf2=new JTextField(20);
		jtf2.setText(msg1+"---"+msg2+"----"+msg3+"---");
		jp3.add(jtf2);
		add(jp3,BorderLayout.SOUTH);
		
		jtf1.addKeyListener(this);
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent ae)
		{
			t2=" ";
			if(jrb1.isSelected())
				t2=t2+jrb1.getText()+" ";
			
			if(jrb2.isSelected())
				t2=t2+jrb2.getText()+" ";
			
			if(jrb3.isSelected())
				t2=t2+jrb3.getText()+" ";
			jtf2.setText(msg1+t1+msg2+t2+msg3+t3);
		}	
			public void itemStateChanged(ItemEvent ie){
				t3=" ";
			if(jcb1.isSelected())
				t3=t3+jcb1.getText()+" ";
			
			if(jcb2.isSelected())
				t3=t3+jcb2.getText()+" ";
			
			if(jcb3.isSelected())
				t3=t3+jcb3.getText()+" ";
			jtf2.setText(msg1+t1+msg2+t2+msg3+t3);
			
			}
			public void keyPressed(KeyEvent ke){}
			public void keyTyped(KeyEvent ke){}
			public void keyReleased(KeyEvent ke){
				t1=" "+jtf1.getText()+" ";
				jtf2.setText(msg1+t1+msg2+t2+msg3+t3);
			}
			public static void main(String args[]){
				new Details();
			}
		}
	
