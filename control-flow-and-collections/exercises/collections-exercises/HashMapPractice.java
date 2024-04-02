import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String student;
        Integer id;

        System.out.println("Enter your student names and IDs (or press Enter to finish)");

        do {
            System.out.print("Student: ");
            student = input.nextLine();

            if (!student.equals("")) {
                System.out.print("ID: ");
                id = input.nextInt();
                students.put(id, student);

                input.nextLine();
            }
        } while (!student.equals(""));

        input.close();

        System.out.println("Class roster:");

        for (Map.Entry<Integer, String> studentItem : students.entrySet()) {
            System.out.println(studentItem.getValue() + "'s ID: " + studentItem.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
