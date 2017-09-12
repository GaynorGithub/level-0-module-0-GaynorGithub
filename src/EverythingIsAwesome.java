import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) throws Exception {
	String thing = JOptionPane.showInputDialog("What is something you like?");
	JOptionPane.showMessageDialog(null, thing + " is awesome.");
}
}
