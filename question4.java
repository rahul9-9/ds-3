import java.util.*;
class power1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base and power");
		int b=s.nextInt();
		int r=s.nextInt();
		int result=power(b,r);
		System.out.println(result);
	}
	public static int power(int b,int r)
	{
		if(r!=0)
		{
			return(b*power(b,r-1));
		}
		else
		{
			return 1;
		}
	}
}
