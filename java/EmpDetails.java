import java.util.*;

class Employee{
    
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter employee ID: ");
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter employee Name: ");
        eName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        eSalary = Integer.parseInt(sc.nextLine());


    }
    
    public void display(){
        System.out.println("Name: "+eName);
     
    }
}


public class EmpDetails{
    public static void main(String[] args){
        int n=3;
        Employee obj[] = new Employee[n];

        for(int i=0; i<n; i++){
           obj[i] = new Employee(); 
           obj[i].read();
    }

    System.out.println("search");
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("enter ID: ");
        int No = Integer.parseInt(sc.nextLine());
             for(int i=0; i<n; i++){
               if(obj[i].eNo==No){
                 obj[i].display();
            break;

        }
    }
    sc.close();
    }
    }
    

}
