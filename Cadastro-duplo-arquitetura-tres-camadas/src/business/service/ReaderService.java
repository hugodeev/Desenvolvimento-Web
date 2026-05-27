
package business.service;

import java.util.Scanner;

public class ReaderService {
    private Scanner scanner = new Scanner(System.in);

    public int nextInt() {
        int value = scanner.nextInt();
        scanner.nextLine(); 
        return value;
    }

    public String nextLine() {
        return scanner.nextLine();
    }
}