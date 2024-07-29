import java.util.Scanner;

class AreasOfShapes{

    void area(double r){
        System.out.println("Area of Circle: "+ String.format("%2f",3.14 *r*r ));
    }

    void area(float s){
        System.out.println("Area of square: "+(s*s));
    }

    void area(float l,float b){
        System.out.println("Area of rectangle: "+ (l*b));
    }

    void area(double b, double h){
        System.out.println("Area of triangle:"+(0.5*b*h));
    }

}

public class Shapes_area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AreasOfShapes shape = new AreasOfShapes();

         System.out.println("enter radius of circle:");
         shape.area(sc.nextDouble());

         System.out.println("enter length of square:");
         shape.area(sc.nextFloat());

         System.out.println("enter length and breadth of rectangle: ");
         float c = sc.nextFloat();
         float d = sc.nextFloat();
         shape.area(c,d);
         
         System.out.println("enter base and height of triangle: ");
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         shape.area(a,b);

         

         sc.close();
    }
   

    
}
