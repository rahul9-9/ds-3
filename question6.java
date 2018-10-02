import java.util.*;
class dup
{
	public static String duplicate(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		if(s.substring(1,2).equals(s.substring(0,1)))
		{
			return duplicate(s.substring(1));
		}
		else
		{
			return s.substring(0,1)+duplicate(s.substring(1));
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str2=in.next();
		String m=duplicate(str2);
		System.out.println(m);
	}
}