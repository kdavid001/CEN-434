import java.awt.*;
import java.awt.datatransfer.FlavorMap;

public class GUI extends Frame {

    public GUI() {
        // Set Frame properties
        setTitle("AWT Example");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Create MenuBar and add Menu
        MenuBar menuBar = new MenuBar();
//        add(menuBar);
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        MenuItem helpItem = new MenuItem("Help");
        Menu Date = new Menu("Date");

        fileMenu.add(exitItem);
//        helpItem.add(helpItem);
        menuBar.add(fileMenu);
        menuBar.add(Date);
        setMenuBar(menuBar);
        exitItem.addActionListener(e -> System.exit(0));


        // Create Label
        Label label = new Label("Welcome to AWT Example!");
        add(label);

        // Create Button
        Button button = new Button("Click Me");
        add(button);

        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100,100, 50,50);
        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(100,150, 50,50);
        add(checkbox1);
        setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }
}
