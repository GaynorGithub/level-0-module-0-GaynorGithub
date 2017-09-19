import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Checkpoint0 {
public static void main(String[] args) throws Exception {
	String color = JOptionPane.showInputDialog("What is your favourite color?");
	JOptionPane.showMessageDialog(null, "Omigosh! " + color + " is my favourite colour too!");
	Robot r2 = new Robot("mini");
	if (color.equalsIgnoreCase("red")) {
		r2.setPenColor(Color.red);
	}
	if (color.equalsIgnoreCase("orange")) {
		r2.setPenColor(Color.orange);
	}
	if (color.equalsIgnoreCase("yellow")) {
		r2.setPenColor(Color.yellow);
	}
	if (color.equalsIgnoreCase("green")) {
		r2.setPenColor(Color.green);
	}
	if (color.equalsIgnoreCase("blue")) {
		r2.setPenColor(Color.blue);
	}
	if (color.equalsIgnoreCase("purple")) {
		r2.setPenColor(Color.magenta);
	}
	r2.penDown();
	r2.setPenWidth(10);
	r2.setSpeed(100);
	r2.moveTo(30, 600);
	r2.move(200);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(200);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
	r2.move(400);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(400);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
	r2.move(300);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(300);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
	r2.move(500);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(500);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
	r2.move(100);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(100);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
	r2.move(200);
	r2.turn(90);
	r2.move(100);
	r2.turn(90);
	r2.move(200);
	r2.turn(-90);
	r2.move(50);
	r2.turn(-90);
}
}
