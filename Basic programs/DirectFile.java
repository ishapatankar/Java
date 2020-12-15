import java.io.*;
class DirectFile
{
	public static void main(String arg[])
	{
		int cnt=0;
				
		String name = arg[0];
		String ext = ".txt";
		File f = new File(name);
		
		if(f.isDirectory())
		{
			System.out.println("Contents of "+name);
			String[] s=f.list();
			for(String str: s)
			{
				File f1 = new File(name,str);
				if(f1.isFile())
					cnt++;
				
				
			}
			System.out.println("Total no of files in directory:"+cnt);
			
			for(String str: s)
			{
				File f1 = new File(name,str);
				
				if(f1.isFile() && str.endsWith(ext))
				{
					
					System.out.println(str+"-> deleted");
					f1.delete();
				}
				
			}
			
		}
		else 
		{
			//	System.out.println("Not a directory");
			File f1=new File(arg[0]);
			System.out.println("File name:"+f1.getName());
			System.out.println("File size:"+f1.length()+"Bytes");
			System.out.println("File path:"+f1.getPath());
			System.out.println("File last modified:"+f1.lastModified());
			System.out.println("Absolute path:"+f1.getAbsolutePath());
			System.out.println("File parent:"+f1.getParent());
			System.out.println(f1.exists()?"file exists":"File does not exist");
			System.out.println(f1.canWrite()?"file is writable":"File is not writable");
			System.out.println(f1.canRead()?"file is readable":"File is not readable");
			System.out.println(f1.isHidden()?"file is hidden":"File is not hidden");
			System.out.println(f1.isFile()?"It is normal file":"It is not a file");
			System.out.println(f1.isAbsolute()?"File is absolute":"File is not absolute");
		}
		
	}
}

