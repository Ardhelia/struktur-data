import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private ArrayList<String> todoList;
    //membuat variabel todoList tipe datanya ArrayList<String>

    // Constructor to initialize the ArrayList
    public TodoListApp() {
        todoList = new ArrayList<>();
        //membuat object array list
    }

    // Method to add a task
    public void addTask(String task) {
        //kalo mau menambahkan item ke sebuah list codingan yang digunakan adalah
        todoList.add(task);
    }

    // Method to remove a task by task name
    public void removeTask(String task) {
        if (todoList.contains(task)) {
            todoList.remove(task);
            System.out.println("Task '" + task + "' has been removed.");
        } else {
            System.out.println("Task '" + task + "' not found.");
        }
    }

    // Method to remove a task by index
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task '" + removedTask + "' at index " + index + " has been removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Method to search for a task by task name
    public void searchTask(String task) {
        if (todoList.contains(task)) {
            System.out.println("Task '" + task + "' is in your to-do list.");
        } else {
            System.out.println("Task '" + task + "' not found in your to-do list.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        //show all task
        System.out.println("Your to-do list:");
        // create looping
        for (int i = 0; i < todoList.size() ; i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By Task Name");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to remove by name: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTask(taskToRemove);
                    break;

                case 3:
                    app.displayTasks();
                    System.out.print("Enter the index of the task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    app.removeTaskByIndex(indexToRemove);
                    break;

                case 4:
                    System.out.print("Enter task to search by name: ");
                    String taskToSearch = scanner.nextLine();
                    app.searchTask(taskToSearch);
                    break;

                case 5:
                    app.displayTasks();
                    break;

                case 6:
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
