package Graphics;

public class Square implements  Figures 
{
    double side;
    
    public Square(double s){
        side = s;

    }
    public void area(){
        System.out.println("Area of square: "+String.format("%2f",(side*side)));
    }
    
}
