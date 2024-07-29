import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int ch;
        String element;

        do {
            System.out.println("1.add\n2.size\n3.search by index\n4.find\n5.index\n6.remove by element\n7.remove by index\n8.display\n9.clear\n10.Exit\nEnter your choice:  ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter element to insert:");
                    element = sc.next();
                    list.add(element);
                    break;

                case 2:
                    System.out.println("Size of ArrayList: " + list.size());
                    break;

                case 3:
                    System.out.println("Enter index of element:");
                    int index = sc.nextInt();
                    System.out.println("Element at index " + index + " is " + list.get(index));
                    break;

                case 4:
                    System.out.println("Enter element to find index:");
                    element = sc.next();
                    int idx = list.indexOf(element);
                    System.out.println("Index of element: " + idx);
                    break;

                case 5:
                    System.out.println("Enter an element:");
                    element = sc.next();
                    boolean contains = list.contains(element);
                    System.out.println("Element " + element + " is " + (contains ? "present" : "not present"));
                    break;

                case 6:
                    System.out.println("Enter element to be removed:");
                    element = sc.next();
                    boolean removed = list.remove(element);
                    System.out.println("Array after removing: " + list);
                    break;

                case 7:
                    System.out.println("Enter the index to remove element:");
                    index = sc.nextInt();
                    list.remove(index);
                    System.out.println("Array after removing: " + list);
                    break;

                case 8:
                    System.out.println("The ArrayList is: " + list);
                    break;

                case 9:
                    list.clear();
                    System.out.println("ArrayList cleared");
                    break;

                case 10:
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (ch != 10);
}
}