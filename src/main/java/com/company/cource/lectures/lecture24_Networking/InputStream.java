package lectures.lecture24_Networking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        int b = 0;
        try {
            fileInputStream = new FileInputStream("./src/main/java/com/company/cource/lectures/lecture24_Networking/test.txt");
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            while ((b = inputStreamReader.read()) != -1) ;
            {
                System.out.println((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
