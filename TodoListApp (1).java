import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private ArrayList<String> todoList;

    // Constructor to initialize the ArrayList
    public TodoListApp() {
        todoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {

    }

    // Method to remove a task
    public void removeTask(String task) {

    }

    // Method to display all tasks
    public void displayTasks() {

    }


    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");

                    break;

                case 3:
                    app.displayTasks();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
