import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader((fileReader));

            bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file: " + e);
        } catch (IOException e) {
            System.out.println("IO Exception: " + e);
        }

    }
}
