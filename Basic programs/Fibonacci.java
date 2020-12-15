package Series;
public class Fibonacci{
	int n;
	
	public Fibonacci(int x){
		n=x;
	
	}

	public void printSeries(){
		int f0=1,f1=1,f2;
		System.out.println("Following are number of Fibonacci series:");
		if(n==1)
			System.out.println(f0);
		else if(n>=2){
			System.out.println(f0);
			System.out.println(f1);
		}
		n=n-2;
		while(n>0){
			f2=f0+f1;
			System.out.println(f2);
			f0=f1;
			f1=f2;
			n--;
		}
	}
}
