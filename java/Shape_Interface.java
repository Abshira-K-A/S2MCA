import java.util.Scanner;

interface Shape{
    public void area();
    public void perimeter();
}

class Circle implements Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    
   
     
        public void area(){
            System.out.println("Area of circle:"+String.format("%2f", (3.14*radius*radius)));

        }
        public void perimeter(){
            System.out.println("perimeter of circle: "+String.format("%2f", (2*3.14*radius)));
        }

    
}

class Rectangle implements Shape{
    double length,breadth;
    Rectangle(double l,double b){
           length = 1;
           breadth = b;
    }

    public void area(){
        System.out.println("Area of rectangle:"+String.format("%2f", (length*breadth)));
    }
    public void perimeter(){
        System.out.println("perimeter of rectangle: "+String.format("%2f", (2*(length+breadth))));
    }
}

public class Shape_Interface{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Circle \n2.Rectangle \n3.Exit \nEnter your choice:" );
             ch = sc.nextInt();
             
             switch(ch){
                case 1:
                    System.out.println("enter radius:");
                    double r = sc.nextDouble();
                    Circle cir = new Circle(r);
                    cir.area();
                    cir.perimeter();
                    break;
                
                case 2:
                    System.out.println("enter length and breadth :");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    Rectangle rec = new Rectangle(l,b);
                    rec.area();
                    rec.perimeter();
                    break;
                
                default:
                   System.out.println("Invalid choice");
             }

        }
        while(ch!=3);
        sc.close();
    }
   

}