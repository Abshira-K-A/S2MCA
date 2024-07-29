import java.util.*;
class fib implements Runnable
{
    int n;
    fib(int limit)
    {
        n=limit;
        
    }
    // public void run()
    // {
    //     int a=0,b=1,c;
    //     for(int i=1;i<=n;i++)
    //     {
    //         c=a+b;
    //         System.out.println("fib"+a);
    //         a=b;
    //         b=c;
    //     }
    // }
    int isPrime(int n)
    {
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
              return 0;
            }
        }
            return 1;  

        
    }
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i)==1)
              System.out.println(i)
        }
    }


}
class even implements Runnable
{
    int start,end;
    even(int a,int b)
    {
        start =a;
        end=b;
    }
    public void run()
    {
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                System.out.println("even"+i);
            }

        }
    }
}

public class threadmain {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit for fibonacci");
        int n=sc.nextInt();
        System.out.println("enter start,end for even");
        int s=sc.nextInt();
        int e=sc.nextInt();
        Thread f=new Thread(new fib(n));

        Thread ev=new Thread(new even(s,e));
        f.start();
        ev.start();

    }
    
}
