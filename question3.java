import java.util.*;
class fi
{
	int fib(int z)
	{
		if(z==0)
		{
			return 0;
		}
		else if(z==1)
		{
			return 1;
		}
		else
		{
			return fib(z-1)+fib(z-2);
		}
	}
}
class zth
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int p;
		
		System.out.println("Enter the position");
		
		p=s.nextInt();
		
		fi f=new fi();
		
		int i=f.fib(p);
		
	
		
		System.out.println(i);
		
	}
}