import java.util.*;

import graphic2.circle;
import graphic2.rect;
public class pack {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        double r=sc.nextDouble();
        circle c = new circle(r);
        c.area();
        System.out.println("enter length bread of rect");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
       rect rec=new rect(l,b);
        rec.area();
        

    }
    
}
