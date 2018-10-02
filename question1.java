import java.util.*;
class av
{
	int ss(int ar[],int l,int r,int p)
	{
		if(r<1)
		{
			return -1;
		}
		if(ar[l] == p)
		{
			return l;
		}
		return ss(ar,l+1,r,p);
	}
}
class num
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,p,f,l;
		l=s.nextInt();
		int[] a=new int[l];
		for(i=0;i<l;i++)
		{
			a[i]=s.nextInt();
		}
        System.out.println("Enter number to search");
        p=s.nextInt();
        av sc=new av();
        f=sc.ss(a,0,a.length-1,p);
        if(f!=-1)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
	}
}