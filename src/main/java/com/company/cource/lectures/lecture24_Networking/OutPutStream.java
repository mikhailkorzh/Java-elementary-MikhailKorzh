package lectures.lecture24_Networking;

import java.io.*;

public class OutPutStream {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        String str = "HotNew";
        FileWriter fileWriter = null;
        File file = new File("./src/main/java/com/company/cource/lectures/lecture24_Networking/test.txt");

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
