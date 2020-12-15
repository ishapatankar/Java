import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextFont extends JFrame implements ItemListener{
	JLabel jl1,jl2,jl3;
	JTextField jtf;
	JComboBox jcmb1,jcmb2;
	JCheckBox jcb1,jcb2;
	JPanel jp1,jp2,jp3,jp4;
	String fontnames[];
	Font f;
	
	TextFont(){
		fontnames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		setLayout(new BorderLayout());
		setTitle("Text Font");
		jp1=new JPanel();
		jp1.setLayout(new GridLayout(1,2));
			jp3=new JPanel();
			jp3.setLayout(new GridLayout(4,1));
			jl1=new JLabel("Font");
			jp3.add(jl1);
			jcmb1=new JComboBox();
			for(int i=0;i<fontnames.length;i++)
				jcmb1.addItem(fontnames[i]);
			jp3.add(jcmb1);
			jl2=new JLabel("Size");
			jp3.add(jl2);
			jcmb2=new JComboBox();
			jcmb2.addItem("10");
			jcmb2.addItem("12");
			jcmb2.addItem("14");
			jcmb2.addItem("16");
			jcmb2.addItem("18");
			jp3.add(jcmb2);
			
			jp4=new JPanel();
			jp4.setLayout(new GridLayout(3,1));
			jl3=new JLabel("Style");
			jp4.add(jl3);
			jcb1=new JCheckBox("Bold");
			jp4.add(jcb1);
			jcb2=new JCheckBox("Italic");
			jp4.add(jcb2);
			jp1.add(jp3);
			jp1.add(jp4);
			
			add(jp1,BorderLayout.CENTER);
			
			jp2=new JPanel();
			jtf=new JTextField(20);
			jp2.add(jtf);
			add(jp2,BorderLayout.SOUTH);
			
			jcmb1.addItemListener(this);
			jcmb2.addItemListener(this);
			jcb1.addItemListener(this);
			jcb2.addItemListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
			setVisible(true);
	}
		
		public void itemStateChanged(ItemEvent ie){
			String fname=(String)jcmb1.getSelectedItem();
			int fsize=Integer.parseInt((String)jcmb2.getSelectedItem());
			f=new Font(fname,Font.PLAIN,fsize);
			
			if(jcb1.isSelected())
				f=new Font(fname,Font.BOLD,fsize);
				
			if(jcb2.isSelected())
				f=new Font(fname,Font.ITALIC,fsize);
				
			if(jcb1.isSelected() && jcb2.isSelected())
				f=new Font(fname,Font.BOLD|Font.ITALIC,fsize);
				
			jtf.setFont(f);
		}
		
		public static void main(String args[]){
			new TextFont();
		}
}
