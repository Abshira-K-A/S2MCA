import java.util.Scanner;

class Employees{
     
    Scanner sc = new Scanner(System.in);

     int Empid;
     String Name;
     int Salary;
     String Address;

     Employees(int x){
        System.out.println("Enter ID: ");
        Empid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name: ");
        Name = sc.nextLine();

        System.out.println("Enter Salary: ");
        Salary = sc.nextInt();
        sc.nextLine();

        System .out.println("Enter Address: ");
        Address = sc.nextLine();
     }

}
class Teachers extends Employees{
    String dept;
    int No;
    String subject[];

    Teachers(int x){
        super(x);
        System.out.println("Enter department: ");
        dept = sc.nextLine();

        System.out.println("Enter no of subjects taught: ");
        No = sc.nextInt();
        subject = new String[No];

        System.out.println("enter list of subjects: ");
        for(int i =0; i < No; i++){
            subject[i] = sc.nextLine();
        }
    }
    
    public void display(){
        System.out.println("\t Teachers Details:");
        System.out.println("Employee Id :"+Empid);
        System.out.println("Employee Name:"+Name);
        System.out.println("salary: "+Salary);
        System.out.println("Address:"+Address);
        System.out.println("Department:"+dept);
        System.out.println("subjects:"+subject);
        for (int i =0; i < No; i++){
            System.out.print(subject[i]+" ");
        }


    }

}

public class Teach_Empl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter no of teachers:");
         int n = sc.nextInt();
           Teachers teach[] = new Teachers[n];

               for (int i = 0; i < n; i++){
                  teach[i] =new Teachers(i+1);
        }
                 for (int i = 0; i < n; i++){
                 teach[i].display();
        }
        sc.close();
    }
}

