import java.io.File;

public class CheckPathType {
    public static void main(String[] args) {
        String pathname = "E:/Java Programs/techmahindra/Week 3 Assignments/Task 3/Task3.txt";
        File path = new File(pathname);
        if (path.isDirectory()) {
            System.out.println(pathname + " is a directory");
        } else if (path.isFile()) {
            System.out.println(pathname + " is a file");
        } else {
            System.out.println(pathname + " is neither a file nor a directory");
        }
    }
}