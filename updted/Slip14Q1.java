import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Slip14Q1 implements Runnable {
    private String searchString;
    private File file;

    public Slip14Q1(String searchString, File file) {
        this.searchString = searchString;
        this.file = file;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println(file.getName() + ": " + lineNumber + " - " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String searchString = "example";
        File folder = new File(".");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        for (File file : files) {
            Thread thread = new Thread(new Slip14Q1(searchString, file));
            thread.start();
        }
    }
}
