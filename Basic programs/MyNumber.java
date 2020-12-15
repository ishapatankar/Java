/** this class checks for the properties of number*/
public class MyNumber
{
	private int num;
	/**default constructor*/
	public MyNumber()
	{
		num=0;
	}
	/** Parameter constructor @param n represents the number*/
	public MyNumber(int num)
	{
		this.num=num;
	}
	/** methods check whether the no. is negative @return boolean true if positive and false if negative*/
	public boolean isNegative()
	{
		return num<0?true:false;
	}
	public boolean isPositive()
	{
		return num>0?true:false;
	}
	public boolean isZero()
	{
		return num==0?true:false;
	}
	public boolean isOdd()
	{
		return num%2==1?true:false;
	}
	public boolean isEven()
	{
		return num%2==0?true:false;
	}
}
class Test
{
	public static void main(String args[])
	{
		if(args.length>0)
		{
			int n=Integer.parseInt(args[0]);
			MyNumber m= new MyNumber(n);
			System.out.println("the no "+n+" negative?" +m.isNegative());
			System.out.println("the no "+n+" positive?" +m.isPositive());
			System.out.println("the no "+n+" zero?" +m.isZero());
			System.out.println("the no "+n+" odd?:" +m.isOdd());
		 	System.out.println("the no "+n+" even?" +m.isEven());

		}
		else 
			System.out.println("insufficients arguments");
	}
}
