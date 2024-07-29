import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.InputStream;

public class CopyFiles {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter source file path:");
        String sourceFile = reader.readLine();

        System.out.println("enter destination path:");
        String destinationFile = reader.readLine();

        
        
        try(InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new  FileOutputStream(destinationFile)){
                byte[] buffer = new byte[1024];
                int bytesRead;

                while((bytesRead = in.read(buffer))!=-1){
                    out.write(buffer,0,bytesRead);
                }
                System.out.println("file copied");
            } catch (IOException e){
                System.out.println("an error occured "+e.getMessage());
            } finally {
                reader.close();
            }
            

    }
}
