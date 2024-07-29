import java.util.Scanner;

  class Person{
    Scanner  sc = new Scanner(System.in);

     String name;
     char gender;
     String address; 
     int age;

     Person(int x){
      System.out.println("\tEnter details of teacher"+x);
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Gender: ");
        gender = sc.next().charAt(0);
        System.out.println("Enter Address: ");
        address = sc.next();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        

     }
}

class Employee extends Person{
   Scanner  sc = new Scanner(System.in);
     int EmpId;
     String CompanyName;
     String qualification;
     int salary;

     Employee(int x){
        super(x);

        System.out.println("Enter Id: ");
        EmpId = sc.nextInt();
        
        System.out.println("Enter  company Name: ");
        CompanyName = sc.next();
        System.out.println("Enter Qualification: ");
        qualification = sc.next();
        System.out.println("Enter salary: ");
        salary = sc.nextInt();
        

     }

}

class Teacher extends Employee{
   Scanner  sc = new Scanner(System.in);
    String subject;
    String dept;
    int teacherId;

    Teacher(int x){
        super(x);

        System.out.println("Enter subject: ");
        subject = sc.next();
        System.out.println("Enter dept: ");
        dept = sc.next();
        System.out.println("Enter Teacher Id: ");
        teacherId = sc.nextInt();
        


    }

    void display(int n){
      System.out.println("\t Teacher"+n+"Details");
      
      System.out.println("Name: "+name);
      System.out.println("Gender:"+gender);
      System.out.println("Address: "+address);
      System.out.println("Age: "+age);
      System.out.println("Employee Id: "+EmpId);
      System.out.println("Company Name: "+CompanyName);
      System.out.println("Qualification: "+qualification);
      System.out.println("Salary: "+salary);
      System.out.println("Subject: "+subject);
      System.out.println("Department: "+dept);
      System.out.println("Teacher Id: "+teacherId);
      
  
   }
}
 
public class Teacher_main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("enter no of teachers: ");
      int n = sc.nextInt();

      Teacher teach[] = new Teacher[n];
      for (int i = 0; i < n; i++){
         teach[i] = new Teacher(i+1);
       
      }
       for (int i =0; i < n; i++){
         teach[i].display(i+1);
       }

     sc.close();
   } 
}