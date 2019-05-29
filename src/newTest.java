import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class newTest {

    public static void main(String[] args) {

        String directory = "data";
        String filename = "info2.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (! Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("data", "info2.txt");
        try {
            Files.write(filepath, groceryList);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("data", "info2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        try {
            Files.write(Paths.get("data", "info2.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        for (int i = 0; i < newList.size(); i += 1) {
            System.out.println((i + 1) + ": " + newList.get(i));
        }


    }

}
