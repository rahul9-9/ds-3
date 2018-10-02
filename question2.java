import java.util.*;
class reverse
{
 static void ree(int[] a,int c,int v)
 {
	 
	 
	 
	 
 	if(c>=v)
 	{
		
		
 		return ;
 	}
	
	
 	else
		
	
 	{
		
		
 		int t;
 		t=a[c];
 		a[c]=a[v];
 		a[v]=t;
 		ree(a,c+1,v-1);
		
		
		
 	
	}
	
	
 }
 
 
 
 public static void main(String[] args)
 
 
 
 {
	 
	 
	 
 	Scanner o=new Scanner(System.in);
 	
 	int n=o.nextInt();
 	int[] a=new int[n];
 	for(int c=0;c<n;c++)
		
	
 	{
		
		
 		a[c]=o.nextInt();
 	
	
	
	}
	
	
	
 	ree(a,0,n-1);
 	System.out.print("Reverse of Array : ");
 	for(int c=0;c<n;c++)
		
	
 	{
		
		
 		System.out.print(a[c]+" ");
 	
	
	}
 }
}