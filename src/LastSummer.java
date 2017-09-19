import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) throws Exception {
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "I know that stole a candy bar from that store last summer " + name +  ". Muahahaha!!!");
}
}
