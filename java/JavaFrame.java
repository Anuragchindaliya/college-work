import java.awt.*;
import java.awt.event.*;

class JavaFrame extends Frame {
    JavaFrame() {
        Frame f = new Frame("Menu and MenuItem Example");
        MenuBar mb = new MenuBar();

        Menu menu = new Menu("Menu");
        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("Open");
        MenuItem i3 = new MenuItem("Save");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        Menu submenu = new Menu("Save as");
        MenuItem i4 = new MenuItem("JavaScript (.js)");
        MenuItem i5 = new MenuItem("Java (.java)");
        MenuItem i6 = new MenuItem("C++ (.cpp)");
        submenu.add(i4);
        submenu.add(i5);
        submenu.add(i6);

        menu.add(submenu);

        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new JavaFrame();
    }
}