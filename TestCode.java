import javax.swing.JOptionPane;


public class MessageDisplayExample {

public static void main(String[] args) {

    // 1. Using System.out.println() (Console Output)
    System.out.println("Hello, world!"); // Simple text output to the console
    int age = 30;
    System.out.println("Your age is: " + age); // Concatenating strings and variables


    // 2. Using System.err.println() (Error Output to Console)
    System.err.println("This is an error message!"); // Displays an error message in the console (often in red)


    // 3. Using JOptionPane (GUI Message Dialogs) - Requires Swing
    // Make sure you have a GUI environment available (e.g., you're not running in a headless server).


    // a. Simple Information Message
    JOptionPane.showMessageDialog(null, "This is an information message.", "Information", JOptionPane.INFORMATION_MESSAGE);


    // b. Warning Message
    JOptionPane.showMessageDialog(null, "This is a warning message!", "Warning", JOptionPane.WARNING_MESSAGE);


    // c. Error Message
    JOptionPane.showMessageDialog(null, "An error has occurred.", "Error", JOptionPane.ERROR_MESSAGE);


    // d. Plain Message (no icon)
    JOptionPane.showMessageDialog(null, "This is a plain message.", "Plain Message", JOptionPane.PLAIN_MESSAGE);


    // e. Question Message
    JOptionPane.showMessageDialog(null, "Is this a question?", "Question", JOptionPane.QUESTION_MESSAGE);


    // f. Input Dialog (getting input from the user)
    String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
    if (name != null) { // Check if the user clicked "Cancel" or closed the dialog
    System.out.println("Hello, " + name + "!"); // Output to console
    JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE); // Display in a dialog
    } else {
    System.out.println("No name entered.");
    }

    // g. Confirmation Dialog (yes/no/cancel)
    int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("User chose Yes");
        } else if (choice == JOptionPane.NO_OPTION) {
            System.out.println("User chose No");
        } else {
            System.out.println("User cancelled");
        }
    }
}
