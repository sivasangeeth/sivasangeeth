import java.util.*;
class pals{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,rev=0,num=n;
     //   String m="",d="";
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(num==rev)
        {
          System.out.print("yes");
        }
         else
            System.out.print("No");
        
        
        
    }
}
