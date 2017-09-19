import javax.swing.JOptionPane;

public class WorldDomination {
public static void main(String[] args) throws Exception {
	String code = JOptionPane.showInputDialog("Can you write code? Yes or No");
	if (code.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "You will rule the world!!!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
	}
	int life = JOptionPane.showConfirmDialog(null, "Is this real life?");
	System.out.println(life);
	if (life == 1) {
		JOptionPane.showMessageDialog(null, "WHAAAAAATTTTTTTT");
	}
	if (life == 0) {
		JOptionPane.showMessageDialog(null, "Okay phew, ya scared me there.");
	}
}
}
