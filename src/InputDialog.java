import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is yaour name");
        System.out.println("My name is"+name);
        System.exit(0);
    }
}
