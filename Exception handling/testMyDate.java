import java.io.*;

class InvalidDateException extends Exception{
	
	int x;
	InvalidDateException(int a){
	    x=a;
	}
	
	public String toString(){
	    return "Invalid Date "+x;

	}
    
}

class MyDate{
	
	private int dd;
	private int mm;
	private int yyyy;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void accept(){
		
		try{
			
			System.out.println("Enter the day:");
			dd=Integer.parseInt(br.readLine());
			
			System.out.println("Enter the month:");
			mm=Integer.parseInt(br.readLine());
			
			System.out.println("Enter the year:");
			yyyy=Integer.parseInt(br.readLine());
			
			if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){
				
				if(dd>=1 && dd<=31)
				    display();
				
				else
					throw new InvalidDateException(dd);
			}
			else if(mm==4 || mm==6 || mm==9 || mm==11){
 
                if(dd>=1 && dd<=30)
				    display();
				
				else
					throw new InvalidDateException(dd);
 
				
			}
			else if(mm==2){
				
				if((yyyy%4==0 && yyyy%100 !=0) || (yyyy%400==0)){
					
					if(dd>=1 && dd<=29)
				    display();
				
				    else
					    throw new InvalidDateException(dd);

					
				}
				else
					if(dd>=1 && dd<=28)
				    display();
				
				else
					throw new InvalidDateException(dd);

				
			}
			else
				throw new InvalidDateException(mm);
			
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		catch(InvalidDateException ide){
			System.out.println(ide);
		}
		
	}
	
	public void display(){
		System.out.println(dd+":"+mm+":"+yyyy);
	}
}

class testMyDate{
	
	public static void main(String args[]){
		
		MyDate md= new MyDate();
		md.accept();
		
	}
	
}
