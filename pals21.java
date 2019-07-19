import java.util.*;
class pals21{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int n1=sc.nextInt();
        int count=0,i,j;
for( i=n+1;i<n1;i++)
{
    count=0;
    for( j=i;j>=1;j--)
    {
    if(i%j==0)
    count++;
    }
if(count==2)
{
     System.out.print(i+" ");
}
    }
}
}
