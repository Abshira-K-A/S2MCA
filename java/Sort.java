import java.util.Scanner;

class Array {
    Scanner sc = new Scanner(System.in);
    String str[];
    int size;

    public void stringInput() {
        System.out.println("Enter the number of strings:");
        size = sc.nextInt();
        sc.nextLine(); 
        str = new String[size];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            str[i] = sc.nextLine();
        }
    }

    public void sorting() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }
    

    void display() {
        
        System.out.println("Sorted strings:");
        for (int i = 0; i < size; i++) {
            System.out.println(str[i]);
        }
    }
}

public class Sort {
    public static void main(String[] args) {
        Array array = new Array();
        array.stringInput();
        array.sorting();
        array.display();
    }
}
