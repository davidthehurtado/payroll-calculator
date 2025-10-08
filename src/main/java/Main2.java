import java.io.*;

public class Main2 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("src/main/resources/payroll.json");){
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String input;

            while ((input = bufferedReader.readLine()) != null) {

                String[] sections = input.split("\\|");

                int id = Integer.parseInt(sections[0]);
                String name = sections[1];
                double hoursWorked = Double.parseDouble(sections[2]);
                double payRate = Double.parseDouble(sections[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());

                writer.write("Employee ID: %d | Name: %s | Gross Pay: $%.2f%n");

            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
