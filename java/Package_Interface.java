import java.util.Scanner;
import Graphics.Rectangle;
import Graphics.Square;
import Graphics.Triangle;

public class Package_Interface {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter radius:");
           double r = sc.nextDouble();
           Circle c = new Circle(r);
           c.area();
           
           System.out.println("enter length and breadth: ");
           double l = sc.nextDouble();
           double b = sc.nextDouble();
           Rectangle rec = new Rectangle(l, b);
           rec.area();

           System.out.println("enter side:");
           double s = sc.nextDouble();
           Square sq = new Square(s);
           sq.area();

           System.out.println("enter base and height: ");
           double ba = sc.nextDouble();
           double h = sc.nextDouble();
           Triangle tr = new Triangle(ba,h);
           tr.area();

        sc.close();
    }
    
}
