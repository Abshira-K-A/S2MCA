public class CPU
{
    int price;

    class Processor
    {
        int cores;
        String producer;

      Processor(int noc, String manu)
      {
          cores = noc;
          producer = manu;
      }

      void display()
        { 
            System.out.println("Processor info");
            System.out.println("No of cores="+cores);
            System.out.println("Manufacturer:"+producer);

        }
    }

       static class RAM
       {
          int memory;
          String manuf;

         RAM(int mem, String producer)
         {
            memory = mem;
            manuf = producer;
         }
           void display()
            {
                  System.out.println("RAM info");
                  System.out.println("memory:" + memory + "GB");
                  System.out.println("Manufaacturer:" + manuf);
            }
       }


public static void main(String[] args)
 {
   
    CPU cpu = new CPU();
    CPU.Processor obj = cpu.new Processor(8,"samsung");
    CPU.RAM obj3 = new CPU.RAM(8,"intel");
    obj.display();
    obj3.display();
    
 }
}