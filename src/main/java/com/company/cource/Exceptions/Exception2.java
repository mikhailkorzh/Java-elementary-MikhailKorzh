package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x == 0) {
                //try {
                    throw new ScannerException("0 is not allowed");
                /*} catch (IOException e) {
                    System.out.println(" 0 is not allowed");;
                }*/
            }
        }
    }

}
