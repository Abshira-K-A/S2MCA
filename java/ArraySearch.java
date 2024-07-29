
import java.util.Scanner;

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

    // to display array elements
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
class ArraySearch{
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