import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

class Menu extends JFrame implements ActionListener
{
	JMenuBar jmb;
	JMenu jm1,jm2,jm3,jm4;
	JMenuItem jmload,jmsave,jmexit,jmsum,jmavg,jmmax,jmmin,jmmed,jmsearch,jmsort;
	JRadioButtonMenuItem jmasc,jmdsc;
	
	JPanel jp1;
	JTextArea jta;
	JScrollPane jsp;
	int a[],size;
	
	Menu()
	{
		setLocation(50,50);
		setSize(400,400);
		setLayout(new BorderLayout());
		
		jmb=new JMenuBar();
		
		jm1=new JMenu("File");
		jmload=new JMenuItem("Load");
		jmload.addActionListener(this);
		
		jmsave=new JMenuItem("Save");
		jmsave.addActionListener(this);
		
		jmexit=new JMenuItem("Exit");
		jmexit.addActionListener(this);
		
		jm1.add(jmload);
		jm1.add(jmsave);
		jm1.addSeparator();
		jm1.add(jmexit);
		
		jm2=new JMenu("Compute");
		jmsum=new JMenuItem("Sum");
		jmsum.addActionListener(this);
		
		jmavg=new JMenuItem("Average");
		jmavg.addActionListener(this);
		
		jmmax=new JMenuItem("Maximum");
		jmmax.addActionListener(this);
		
		jmmin=new JMenuItem("Minimum");
		jmmin.addActionListener(this);	
	
		jmmed=new JMenuItem("Median");
		jmmed.addActionListener(this);
		
		jm2.add(jmsum);
		jm2.add(jmavg);
		jm2.add(jmmax);
		jm2.add(jmmin);
		jm2.add(jmmed);
		
		jm3=new JMenu("Operation");
		jmsearch=new JMenuItem("Search");
		jmsearch.addActionListener(this);
		
		jm4=new JMenu("Sort");
		jmasc=new JRadioButtonMenuItem("Ascending");
		jmasc.addActionListener(this);
		jmdsc=new JRadioButtonMenuItem("Descending");
		jmdsc.addActionListener(this);
		jm4.add(jmasc);
		jm4.add(jmdsc);
		jm3.add(jmsearch);
		jm3.add(jm4);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);

		setJMenuBar(jmb);
		
		jp1=new JPanel(new BorderLayout());
		jta=new JTextArea(20,40);
		jsp=new JScrollPane(jta);
		jp1.add(jsp,BorderLayout.CENTER);
		add(jp1,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent ae)
		{
			String avgmsg="\n\nAverage is\n\n";
			String maxmsg="\n\nMaximum is\n\n";
			String minmsg="\n\nMinimum is\n\n";
			String ascmsg="\n\nAscending order\n\n";
			String dscmsg="\n\nDescending order\n\n";
			String searchmsg="\n\nSearching result\n\n";
			String medmsg="\n\nMedian is\n\n";
			String msg="";
			String fname="";
			String save="\nSave successfully\n";
			float sum=0.0f;
			float avg=0.2f;
				
			if(ae.getSource()==jmexit)
			{
				JOptionPane.showMessageDialog(null,"Exit..");
				System.exit(0);
			}
			
			if(ae.getSource()==jmload)
			{
				String t=JOptionPane.showInputDialog(null,"Enter how many numbers","Input title",JOptionPane.PLAIN_MESSAGE);
				size=Integer.parseInt(t);
				a=new int[size];
				jta.setText(msg);
				Random r=new Random();
				for(int i=0;i<size;i++)
				{
					a[i]=r.nextInt(100);
					msg=msg+a[i]+" ";
				}
				jta.setText(msg);
			}
			
			if(ae.getSource()==jmsave)
			{
				try
				{
					PrintWriter pw=new PrintWriter("num.txt");
					for(int i=0;i<size;i++)
					{
						pw.println(a[i]);
					}
					pw.close();
					JOptionPane.showMessageDialog(null,save);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			if(ae.getSource()==jmavg)
			{
				for(int i=0;i<size;i++)
				{
					sum=sum+a[i];
				}
				avg=sum/size;
				JOptionPane.showMessageDialog(null,avgmsg+avg);
			}
			
			if(ae.getSource()==jmsum)
			{
				for(int i=0;i<size;i++)
				{
					sum=sum+a[i];
				}
				String t="Sum is";
				JOptionPane.showMessageDialog(null,t+sum);
			}
			
			if(ae.getSource()==jmmax)
			{
				int max=a[0];
				for(int i=0;i<size;i++)
				{
					if(a[i]>max)
						max=a[i];
				}
				JOptionPane.showMessageDialog(null,maxmsg+max);
			}
			
			if(ae.getSource()==jmmin)
			{
				int min=a[0];
				for(int i=0;i<size;i++)
				{
					if(a[i]<min)
						min=a[i];
				}
				JOptionPane.showMessageDialog(null,minmsg+min);
			}
			
			if(ae.getSource()==jmmed)
			{
				float x;
				if(a.length%2!=0)
					x=a[a.length/2];
					
				else
					x=(a[a.length/2]+a[(a.length/2)-1])/2;
				JOptionPane.showMessageDialog(null,medmsg+x);
			}
			
			if(ae.getSource()==jmsearch)
			{
				String t=JOptionPane.showInputDialog(null,"Enter number to be search","Input title",JOptionPane.PLAIN_MESSAGE);
				
				int no=Integer.parseInt(t);
				
				int loc=-1;
				for(int i=0;i<size;i++)
				{
					if(a[i]==no)
					{
						loc=i;
						break;
					}
				}
				JOptionPane.showMessageDialog(null,searchmsg);
				if(loc==-1)
					jta.append("\n"+no+"is not found");
				else
				{	loc++;
					jta.append("\n"+no+"is found at "+loc+" location");
				} 	
			}
			
			if(ae.getSource()==jmasc)
			{
				int t;
				for(int i=0;i<size;i++)
				{
					for(int j=i+1;j<size;j++)
					{
						if(a[i]>a[j])
						{
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
					}
					
				}
				jta.append("\nAscending order: ");
				for(int i=0;i<size;i++)	
					jta.append(" "+a[i]);
			
			}
			
			if(ae.getSource()==jmdsc)
			{
				int t;				
				for(int i=0;i<size;i++)
				{
					for(int j=i+1;j<size;j++)
					{
						if(a[i]<a[j])
						{
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
					}
					
				}
				jta.append("\nDescending order: ");
				for(int i=0;i<size;i++)					
					jta.append(" "+a[i]);
								
			}
		}
	public static void main(String arg[])
	{
		new Menu();
	}
}
