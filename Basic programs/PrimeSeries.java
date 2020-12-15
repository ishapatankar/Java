package Series;
public class PrimeSeries
{
	int n;
	public PrimeSeries(int x)
	{
		n=x;
	}
	
	public void PrimeSeries(){
		int i,no,d,flag;
		System.out.println("Following are prime numbers between 1 and :"+n);
		for(i=2;i<=n;i++)
		{
			no=i;
			flag=1;
			d=2;
			while(d<no){
				if(no%d==0){
					flag=0;
					    break;
				}
				d++;
			}
			if(flag==1)
				System.out.println(no+" ");
		}
	}
	public void printSeries(){
		int i=0,no=2,d,flag;
		System.out.println("\nFollowing are the first "+n+" prime numbers:");
		while(i!=n){
			flag=1;
			d=2;
			while(d<no){
					if(no%d==0){
					flag=0;
					    break;
					}
					d++;
				}
				if(flag==1){
				System.out.println(no+" ");
				i++;
				}
			no++;
		}
	}
}
