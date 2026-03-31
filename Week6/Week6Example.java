import java.io.*;

public class Week6Example {
    public static void main(String[] args) {
        try (BufferedWriter w = new BufferedWriter(new FileWriter("out.txt"))) {
            w.write("안녕하세요");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader r = new BufferedReader(new FileReader("out.txt"))) {
            System.out.println(r.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
