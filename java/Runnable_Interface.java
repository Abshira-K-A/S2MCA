import java.util.Scanner;

class Fibonacci implements Runnable{
    int n;

    Fibonacci(int limit){
        n = limit;
    }

    public void run(){
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++){
            try 
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
            

        }

    }
}

class Even implements Runnable{
    int start;
    int end;
    Even(int s, int e){
        start = s;
        end = e;
    }

    public void run(){
        for(int i = start; i <= end; i++){
            if(i % 2 ==0){
                System.out.println("even numbers"+i);
                try 
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the limit of fibonacci:");
        int n = sc.nextInt();

        System.out.println("enter the start and end range of even numbers:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        Thread fib = new Thread(new Fibonacci(n));
        Thread eve = new Thread(new Even(start, end));
        
        fib.start();
        eve.start();

        sc.close();
    }
    
}
