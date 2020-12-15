import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener
{
	JLabel Deci,Bin,Oct,Hex;
	JTextField No,B,O,H;
	JButton cal,clear;
	JPanel p;

	public Calculator()
	{
		Deci=new JLabel("Decimal No");
		Bin=new JLabel("Binary No");
		Oct=new JLabel("Octate No");
		Hex=new JLabel("Hexadecimal No");
		
		No=new JTextField();
		B=new JTextField();
		O=new JTextField();
		H=new JTextField();

		cal=new JButton("Calculate");
		clear=new JButton("Exit");

		p=new JPanel();
		p.setLayout(new GridLayout(5,2));

		p.add(Deci);
		p.add(No);
		p.add(Bin);
		p.add(B);
		p.add(Oct);
		p.add(O);
		p.add(Hex);
		p.add(H);
		p.add(cal);
		p.add(clear);	

		setLayout(new FlowLayout());
		add(p);
		setSize(400,300);
		setVisible(true);
		cal.addActionListener(this);
		clear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn=(JButton)ae.getSource();
		if(btn==cal)
		{
			int n=Integer.parseInt(No.getText());
			B.setText(Integer.toBinaryString(n));
			O.setText(Integer.toOctalString(n));
			H.setText(Integer.toHexString(n));
		}
		if(btn==clear)
		{
			No.setText("");
			B.setText("");
			O.setText("");
			H.setText("");
		}
	}	
	public static  void main(String args[])
	{
		new Calculator();
	}
}
