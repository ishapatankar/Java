import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="app.class" width=600 height=300>
</applet>
*/

public class app extends Applet
{
	JTextField t;
	JPanel p;
	JButton b;
	//JLabel l=new JLabel("label");
	int x,y;

	public void init()
	{
		p=new JPanel();
		p.setLayout(new FlowLayout());
		t=new JTextField(40);
		//b=new JButton("Click");
		//add(l);
		p.add(t);
		//p.add(b);
		add(p);
	}
	
	public void start()
	{
		addMouseListener(new MouseAdapter()
		{
			
			public void mousePressed(MouseEvent me)
			{
				t.setText(" Button" +me.getButton()+" pressed");
			}

			public void mouseClicked(MouseEvent me)
			{
				x=me.getX();
				y=me.getY();
				t.setText("Mouse clicked at x="+x+ "y="+y);
			}

			public void mouseExited(MouseEvent me)
			{
				t.setText("Mouse Exited");
			}
		});

		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				t.setText("Key Pressed "+ke.getKeyChar());
			}
		});	

		addMouseMotionListener(new MouseAdapter()
		{
			public void mouseDragged(MouseEvent me)
			{
				t.setText("Mouse Dragged");
			}
			
			public void mouseMoved(MouseEvent me)
			{
				x=me.getX();
				y=me.getY();
				t.setText("Mouse moved at x="+x+ "y="+y);
			}
		});
	}
}
