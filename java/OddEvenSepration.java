import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSepration {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter file path:");
        String inputFile = reader.readLine();
        String evenFile = "even.txt";
        String oddFile = "odd.txt";

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter evenWrite = new BufferedWriter(new FileWriter(evenFile) );
        BufferedWriter oddWrite = new BufferedWriter(new FileWriter(oddFile));

        String line;

        while((line = fileReader.readLine())!= null ){
            int num = Integer.parseInt(line);
            if(num % 2 == 0){
                evenWrite.write(line);
                evenWrite.newLine();
            } else {
                oddWrite.write(line);
                oddWrite.newLine();

            }
        }
        System.out.println("even and odd number seperated");
        reader.close();;
        fileReader.close();
        evenWrite.close();
        oddWrite.close();

        
    }
    
}
