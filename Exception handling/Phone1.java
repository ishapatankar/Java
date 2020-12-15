import java.io.*;
class Phone1
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		String s=null;
		int ch;
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("phone.txt"));
		
		
		System.out.println("1.Search Name and Display no \n2.Add new phone-no pair\n 3.Exit");
		ch=Integer.parseInt(br1.readLine());
		switch(ch)
		{
			case 1:System.out.println("Enter name you want to search");
				String s2=br1.readLine();
		
				while((s=br.readLine())!= null)
				{
					boolean p=s.contains(s2);
					if(p== true)
					System.out.println("\n "+s);
				}
				br.close();
				break;
			case 2:
				FileWriter fw=new FileWriter("phone.txt",true);
				System.out.println("enter name and phone no");
				String nm=br1.readLine();
				String no=br1.readLine();
				String s3="\n"+nm+" "+no+"\n";
				fw.write(s3);
				fw.close();
				break;
			case 3: System.exit(1);
			
		}
		

	}

}

