package Series;

public class Squares{
	int n,i;
	public Squares(int x){
		n=x;
	}
	public void printSeries(){
		System.out.println("Following is the series of squares:");
		for(int i=1;i<=n;i++)
		    System.out.println(i*i);
	}

}
