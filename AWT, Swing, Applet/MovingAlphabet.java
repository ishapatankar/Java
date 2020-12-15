import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class panel extends JFrame implements ActionListener
{
	JButton b1,b2;
	JPanel p2;
	AlphaPanel p1;
	JFrame f;
	public panel()
	{
		f = new JFrame("Moving Alphabet");    
		p1=new AlphaPanel();  
		p2=new JPanel(); 
		b1=new JButton("START");
		b2=new JButton("EXIT");
		
		b1.setBounds(100,300,80,30);       
		b2.setBounds(100,250,80,30);
 
		p1.setBounds(250,250,200,200); 
		p2.setBounds(500,500,200,200);   

		p2.add(b1);
		p2.add(b2);
		
		f.add(p1,BorderLayout.CENTER);  
		f.add(p2,BorderLayout.SOUTH);
		f.setSize(500,500);    
		f.setVisible(true);  
		b1.addActionListener(this);
		b2.addActionListener(this);
			  
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			System.out.println("Starting Alphabet moving");
			addAlpha();
			System.out.println("Started and finished");
		}
		if(ae.getSource()==b2)
		{
			System.exit(1);
		}
				
	}
	void addAlpha()
	{
		Alphabet a = new Alphabet();
		p1.add(a);
		System.out.println("Panel Added");
		Runnable run = new AlphaRunnable(a,p1);
		Thread t = new Thread(run);
		t.start();
	}
} 
 
class Alphabet
{
	Color c;
	String alpha;
	int x,y;
	int dy,dx;
	int R,G,B;
	public Alphabet()
	{
		char ch = (char)((int)(Math.random()*25)+65);
		alpha = String.valueOf(ch);

		x = (int)(Math.random()*400);
		y = (int)(Math.random()*400);

		R = (int)(Math.random()*255);
		G = (int)(Math.random()*255);
		B = (int)(Math.random()*255);	
		dy=2;
		c = new Color(R,G,B);	
	}

	void moveComponent(Component b)
	{
		y += dy;
		
		if(y>=b.getHeight())
		{
			y = b.getHeight();
			dy=-dy;
			System.out.println("move y");
		}													

		if(y<0)
		{
			y=0;
			dy=-dy;
			System.out.println("move x");
		}
		System.out.println("in moveComponent()");
	}
	
	public Color getColor()
	{
		return c;
	}
	public String getAlpha()
	{
		return alpha;
	}
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
}

class AlphaPanel extends JPanel
{
	private ArrayList<Alphabet> alphabets = new ArrayList<Alphabet>();
	
	public void add(Alphabet a)
	{
		alphabets.add(a);
	}
		
	public void paint(Graphics g)
	{
		super.paint(g);
		//super.paint(g);
		System.out.println("in PaintComponent");
		for(Alphabet a:alphabets)
		{
			System.out.println(a.getAlpha()+" "+a.getX()+" "+a.getY());
			g.setColor(a.getColor());
			g.drawString(a.getAlpha(),a.getX(),a.getY());
		}
	}
}

class AlphaRunnable implements Runnable
{
	Alphabet a;
	Component c;
	
	public AlphaRunnable(Alphabet a,Component c)
	{
		this.a = a;
		this.c = c;
	}
	public void run()
	{
		while(true)
		{
			a.moveComponent(c);
			c.repaint();
			//System.out.println("thread runnning");
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}


public class MovingAlphabet
{
	public static void main(String args[])
	{
		panel p = new panel();

	}
}
