import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) throws Exception {
	Robot r2 = new Robot("mini");
	r2.penDown();
	r2.setSpeed(1000);
	r2.setAngle(90);
	for (int i = 0; i < 180; i++) {
		
		r2.turn(-1);
		r2.move(-1);
	}
	r2.setAngle(90);
	for (int i = 0; i < 180; i++) {
		
		r2.turn(1);
		r2.move(1);
	}
for (int i = 0; i < 180; i++) {
		
		r2.turn(-1);
		r2.move(-1);
	}
	r2.setAngle(90);
	for (int i = 0; i < 180; i++) {
		
		r2.turn(1);
		r2.move(1);
	}

	
	

}
}
