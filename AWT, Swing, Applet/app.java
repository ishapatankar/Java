import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

/*
<applet code="app.class" width=600 height=300>
</applet>
*/

public class app extends Applet implements MouseListener,MouseMotionListener,KeyListener
{
	int x,y;
	public void init()
	{
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}

		
	public void mousePressed(MouseEvent me)
	{
		showStatus(" Button" +me.getButton()+" pressed");
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		showStatus(" Mouse Entered");
		repaint();
	}

	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Mouse clicked at x="+x+ "y="+y);
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		showStatus("Mouse Exited");
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		showStatus("Mouse released");
		repaint();
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("key pressed:");
		repaint();
				
	}
		
	public void keyTyped(KeyEvent ke)
	{
		char k=ke.getKeyChar();
		showStatus("typed key:"+k);
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key released:");
		repaint();
	}
			
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse Dragged");
		repaint();
	}
			
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Mouse moved at x="+x+ "y="+y);
		repaint();
	}
	
}
