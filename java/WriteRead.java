import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file name:");
        String fileName = sc.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            System.out.println("Enter the text:");
            String text = sc.nextLine();
            fos.write(text.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream(fileName);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            String fileContent = new String(b);
            System.out.println("Contents of file:");
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
