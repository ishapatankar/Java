import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class UserDemo implements ItemListener
{
	JLabel lname,lclass,lhobby;
	JTextField tfname,tfdata;
	JCheckBox chkmusic,chkdance,chksport;
	JRadioButton r[] = new JRadioButton[3];
	ButtonGroup g1;
	JFrame f;
	JPanel p;
	public UserDemo()
	{
		lname = new JLabel("Your Name:");
		lclass = new JLabel("Your Class");
		lhobby = new JLabel("Your Hobbies");
		chkmusic = new JCheckBox("Music");
		chkdance = new JCheckBox("Dance");
		chksport = new JCheckBox("Sports");
		tfname = new JTextField();
		tfdata = new JTextField();
		r[0] = new JRadioButton("FY");
		r[1] = new JRadioButton("SY");
		r[2] = new JRadioButton("TY");
		g1 = new ButtonGroup();
		for(int i = 0;i < 3;i++)
		{
			g1.add(r[i]);
			r[i].addItemListener(this);
		}
		f = new JFrame("INFORMATION");
		f.setLayout(new BorderLayout());
		p = new JPanel();
		p.setLayout(new GridLayout(5,2));
		p.add(lname);
		p.add(tfname);
		p.add(lclass);
		p.add(lhobby);
		p.add(r[0]);
		p.add(chkmusic);
		p.add(r[1]);
		p.add(chkdance);
		p.add(r[2]);
		p.add(chksport);
		chkmusic.addItemListener(this);
		chkdance.addItemListener(this);
		chksport.addItemListener(this);
		f.add(p,BorderLayout.CENTER);
		f.add(tfdata,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setSize(400,400);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String msg = "Name:"+tfname.getText()+" Class:";
		for(int i=0;i<3;i++)
			if(r[i].isSelected())
				msg=msg+r[i].getText();
		msg+=" Hobbies:";
		if(chkmusic.isSelected() == true)
			msg+=chkmusic.getText();
		if(chkdance.isSelected() == true)
			msg+=","+chkdance.getText();
		if(chksport.isSelected() == true)
			msg+=","+chksport.getText();
		tfdata.setText(msg);
	}
	public static void main(String args[])
	{
		new UserDemo();
	}
}
