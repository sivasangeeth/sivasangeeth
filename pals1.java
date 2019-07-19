import java.util.*;
class pals1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
for(int i=2;i<n/2;i++)
{
    if(n%i==0)
    count+=1;
}
if(count==0)
{
     System.out.print("yes");
}
         else
            System.out.print("No");
        
    }
}
