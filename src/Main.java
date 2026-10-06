import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main (String[] args)
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Scanner scanner = (new Scanner(System.in));

        while(true) {

            System.out.println("1. Add Student:");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Exit ");

            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();

            System.out.println("The one you chose:" + choice );

            if (choice == 1){
                System.out.println("Enter ID: ");
                int id = scanner.nextInt();

                System.out.println("Enter Name: ");
                String name = scanner.next();

                System.out.println("Enter Marks: ");
                double marks = scanner.nextDouble();

                Student newStudent = new Student(id, name, marks);
                arrayList.add(newStudent);

                System.out.println("Student added successfully!");
            }else if(choice == 2){
                for (Student s : arrayList) {
                    System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Marks: " + s.getMarks());
                }
            }else if(choice == 3){
                System.out.println("Enter ID to search: ");
                int searchId = scanner.nextInt();
                for (Student s : arrayList) {
                    if (s.getId() == searchId) {
                        System.out.println("Found! ID: " + s.getId() + ", Name: " + s.getName() + ", Marks: " + s.getMarks());
                    }
                }
            }else if (choice == 4){
                System.out.println("Exite");
                break;
            }
        }
    }
}

