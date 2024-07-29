package Graphics;

public class Rectangle implements Figures
 {
    double length;
    double breadth;
    public Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }
        public void area()
        {
            System.out.println("Araea of rectangle: "+String.format("%2f",(length*breadth)));

        }

   
    
}
