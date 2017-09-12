import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) throws Exception {
	String what = JOptionPane.showInputDialog("WHAT! Is your naaammmeee?");
	JOptionPane.showMessageDialog(null, "Hello " + what);
}
}
