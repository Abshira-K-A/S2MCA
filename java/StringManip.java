import java.util.*;

class Word{

    Scanner sc = new Scanner(System.in);

    String s;

    public void stringInput(){
        System.out.println("enter a string:");
         s = sc.nextLine();

    }

    public void str_functions(){
        System.out.println("Lower case : "+s.toLowerCase());
        System.out.println("Upper case : "+s.toUpperCase());
        System.out.println("Length of string : "+s.length());
        System.out.println("substring(2) : "+s.substring(2));
        System.out.println("substring : "+s.substring(2,5));
        System.out.println("trimming: "+s.trim());
        System.out.println("index of O: "+s.indexOf('o'));
        System.out.println("index of : "+s.indexOf('a',3));
        System.out.println("concatenated: "+s.concat( " How are you"));
    }
}

public class StringManip{
    public static void main(String[] args){
        Word obj = new Word();
        obj.stringInput();
        obj.str_functions();

    }
    
}