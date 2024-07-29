
// exercise 6 


// class operation
// {
//     public int add(int r1, int r2)
//     {
//         return r1 + r2;
//     }

//     public int sub(int n1, int n2){
         
//         return n1 - n2;
//        }      
// }

// class Advncal extends operation
// {

//     public int div(int x1, int x2)
//     {
//         return x1 / x2;
//     }

//     public int mult( int a1, int a2)
//     {
//         return a1 * a2;
//     }
// }

// class veryadvncal extends Advncal
// {
//     public double power(int a, int b)
//     {
//         return Math.pow(a,b);
//     }
// }

// public class calculator
// {
//     public static void main(String[] args)
//     {
//         veryadvncal calc = new veryadvncal();
//         System.out.println("addition:" + calc.add(1,2));
//         System.out.println("subtraction :" +calc.sub(4,3));
//         System.out.println("division:" + calc.div(10,10));
//         System.out.println("multiplication:" + calc.mult(2,2));
//         System.out.println("power:" + calc.power(2,4));
//     }
// }



// import java.util.Scanner;

// class Array{
//     Scanner sc = new Scanner(System.in);
//     int num[];
//     int size;

//     public void ArrayInput(){
//         System.out.println("enter array size:");
//         size = sc.nextInt();
//         num = new int[size];
//     }
//     public void elements(){
//         System.out.println("enter elements: ");
//         for(int i = 0; i < size; i++){
//             num[i] = sc.nextInt();
//             System.out.print(num[i]+" ");
//         }
//     }

// }

// public class Sort{
//     public static void main(String[] args){
//         Array array = new Array();
//         array.ArrayInput();
//         array.elements();
//     }
// }

import java.util.Scanner;/**
 * calculator
 */
class Array {

    Scanner sc = new Scanner(System.in);
    int arr[];
    int size;
   
    
//to input array size and elements
    public void arrayInput(){
        System.out.println("enter array size:");
        size = sc.nextInt();
        arr = new int[size];

    System.out.println("enter array elements:");    
    for (int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }
    }
    public void displayArray(){
        System.out.println("array elements are:");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" " );
        }
    }
    public void search(int n){
        
         for(int i = 0; i < size; i++){
            if(arr[i]==n){
                System.out.println("element found:");
                break;
            
            } 
         
            
        }   
        
    }
    
}
class Calc{
    public static void main(String[] args){
        Array obj = new Array();
        obj.arrayInput();
        obj.displayArray();
        

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter element to be searched:");
        int n = sc.nextInt();
        obj.search(n);
        
        
        sc.close();
      
    }
}