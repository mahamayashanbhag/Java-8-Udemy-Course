package com.Java8UdemyCourse.ChallengeExercise;

public class Main {
	
	Chairs chair = new Chairs(4, "wood");
	Lights bulb = new Lights(60, "white");
	Table tables = new Table("Rectangle", 1);
	Window windows = new Window("Square", 20);
	
	Room newRoom = new Room(bulb, chair, tables, windows);
	
	//newRoom.BlinkLights();
	/* Above line is giving error
	 * and I'm not able to get what was my mistake
	 */
	
	

}