import java.io.*;
import java.util.*;
public class PhoneSearch
{	
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		
		Scanner s1 = new Scanner(System.in);
		FileInputStream fnm = new FileInputStream("phone.txt");

		while(true)
		{
			System.out.println("1. Search Phone No.");
			System.out.println("2. Add New Phone no. To Database");
			System.out.println("3. Exit");
			System.out.print("Enter Your Choice:");
			int ch = s1.nextInt();
		
			switch(ch)
			{
				case 1: System.out.println("Enter the name to search:");
					String nm = s1.next();
					String line;
					BufferedReader br = new BufferedReader(new InputStreamReader(fnm));
						
					while((line = br.readLine()) != null)
					{
						if(line.contains(nm))
						{
							System.out.println("Name \tPhone No.");
							System.out.println(line);
							System.out.println("\n\n");
						}
					}			
					break;
				
				case 2: FileOutputStream f1 = new FileOutputStream("phone.txt",true);
						
					System.out.println("Enter name:");
					String name = s1.next();
					byte b[]=name.getBytes();	//Convert string to byte
                                                
                                                
					System.out.println("Enter Phone no.");
					String no = s1.next();
					byte num[] = no.getBytes();
						
					f1.write(b);
					f1.write(num);						
					break;
			
				case 3: System.exit(0);
		
				default: System.out.println("Wrong Choice..");
			}
			
		}
		
	}
}
