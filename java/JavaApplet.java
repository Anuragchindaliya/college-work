import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/**
 *  First Java Applet to say "Hello, world" on your web browser
 */
public class JavaApplet extends Applet {  // save as "HelloApplet.java"
   public void paint(Graphics g) {
      setBackground(Color.CYAN);   // set background color
      g.setColor(Color.BLACK);     // set foreground text color
      g.setFont(new Font("Times New Roman", Font.BOLD, 30)); // set font face, bold and size
      g.drawString("Hello, world", 20, 80);  // draw string with baseline at (20, 80)
   }
}

