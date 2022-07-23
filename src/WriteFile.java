import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Привет фуу!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
