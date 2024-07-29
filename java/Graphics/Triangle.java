package Graphics;

public class Triangle implements Figures 
{
  double base;
  double height;
  
  public Triangle(double ba,double h){
    base = ba;
    height = h;

  }
  public void area(){
    System.out.println("Area of triangle: "+String.format("%2f",(0.5*base*height)));
  }
}
