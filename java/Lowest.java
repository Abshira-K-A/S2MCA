
class Product 
{
    int pcode;
    String pname;
    int price;
 

     public void show()
      {
        System.out.println("pcode" + ":" + pcode);

        System.out.println("price" + ":" + price);

        System.out.println("pname" + ":" + pname);


        
        
      }

}


 public class Lowest
    {
        public static void main(String[] args)
        {
            Product pdt = new Product();
            pdt.pcode = 100;
            pdt.pname = "soap";
            pdt.price = 24;

            Product pdt1 = new Product();
            pdt1.pcode = 1001;
            pdt1.pname = "cleanser";
            pdt1.price = 378;

            Product pdt2 = new Product();
            pdt2.pcode = 1002;
            pdt2.pname = "powder";
            pdt2.price = 100;


            pdt.show();
            pdt1.show();
            pdt2.show();

         

          if(pdt.price < pdt1.price && pdt.price < pdt2.price)
        {
            System.out.println("lowest price product is" + ":" + pdt.pname);
            
        }
        else if(pdt1.price < pdt.price && pdt1.price < pdt2.price)
         {
            System.out.println("lowest price product is" + ":" + pdt1.pname);
         }
        else 
           {
            System.out.println("lowest price product is" + ":" + pdt2.pname);
           }

        }
    }