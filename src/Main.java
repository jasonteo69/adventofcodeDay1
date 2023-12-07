import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File f = null;
        String lastOne = "";
        String nextOne = "";
        int sum = 0;
        int total = 0;
        try {
            f = new File("secondFile");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String currentLine = s.nextLine();
                Digits test = new Digits(currentLine);
                Digits test1 = new Digits(currentLine);
                test1.firstLast();
                test.reverseFirstLast();
                nextOne = test1.firstLast();
                lastOne = test.reverseFirstLast();
                int last1 = nextOne.length();
                int last = lastOne.length();
                nextOne = nextOne.charAt(0) + nextOne.substring(last1 - 1, last1);
                lastOne = lastOne.charAt(0) + lastOne.substring(last - 1, last);
                sum += Integer.parseInt(nextOne);
                total += Integer.parseInt(lastOne);
            }
                System.out.println("Part 1: " + sum);
                System.out.println("Part 2: " + total);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}