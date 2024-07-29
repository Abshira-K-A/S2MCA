package Graphics;
interface Figures
{
    public void area();
}

public class Circle implements Figures
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    public void area()
    {
        System.out.println("area of circle:"+String.format("%2f",(3.14*radius*radius)));
    }
}

    

