class Complex
{
   double real;
   double imaginary;

   //constructor to initialize comp num

    public Complex(double real, double imaginary)
    {
       this.real = real;
       this.imaginary = imaginary;
    }
   

   public Complex ComplexAdd(Complex other)
 {
    double newReal = this.real + other.real;
    double newImaginary = this.imaginary + other.imaginary;
    return new Complex(newReal, newImaginary);

 }


    void display()
    {
        System.out.println(real + "+" + imaginary + "i");
    }
   public String toString()
   {
    return this.real + "+" + this.imaginary + "i";
   }
}

 


public class ComplexNumber
{
    public static void main(String[] args)
    {
        Complex obj1 = new Complex(4.5,3.2);
        Complex obj2 = new Complex(2.3,5.8);
       

        //adding two complex numbers

        Complex sum  = obj1.ComplexAdd(obj2);

        obj1.display();
        System.out.print("+");
        obj2.display();
        
        
       
        System.out.print("sum :" + sum);       
    }
}