import java.util.*;
class b10 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,count=0;
		while(n>0)
		{
		    rem=n%10;
		    count++;
		    n/=10;
		}
		System.out.print(count);
	}
}
