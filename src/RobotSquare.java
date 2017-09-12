/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot r2 = new Robot("batman");
r2.penDown();
r2.setRandomPenColor();
r2.setSpeed(100);
for (int i = 0; i < 4; i++) {
	r2.move(200);
	r2.turn(90);
}

        // 3. Put the robot's pen down


        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
