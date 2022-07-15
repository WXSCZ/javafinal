import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class project extends JFrame {
public static void main(String[] args) {
project gld = new project();
}
public project() {
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE); 
GridLayout gl = new GridLayout(3, 2);
setLayout(gl);
setTitle("Choose Bank for service");
setSize(300, 400);
add(new Button("Bank of America"));
add(new Button("Chase"));
add(new Button("Wells Fargo"));
add(new Button("Capital One"));
add(new Button("TD Bank"));
add(new Button("PNC"));
}
}
