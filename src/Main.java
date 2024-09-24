import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume \n

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    toDoList.addTask(taskName);
                    break;
                case 2:
                    toDoList.viewTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex - 1);
                    break;
                case 3:
                    toDoList.viewTasks();
                    System.out.print("Enter task number to mark as completed: ");
                    int complete = scanner.nextInt();
                    toDoList.markTaskCompleted(complete - 1);
                    break;
                case 4:
                    toDoList.viewTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}