import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileToByteArray {
    public static void main(String[] args) {
        String pathname = "E:/Java Programs/techmahindra/Week 3 Assignments/Task 3/Task3.txt";
        try {
            Path path = Paths.get(pathname);
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Bytes read: " + bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}