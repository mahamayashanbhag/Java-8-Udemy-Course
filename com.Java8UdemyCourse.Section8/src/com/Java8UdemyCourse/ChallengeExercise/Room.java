package com.Java8UdemyCourse.ChallengeExercise;

public class Room {
	
	private Lights led;
    private Chairs wooden;
	private Table fourlegged;
	private Window rect;
	/**
	 * @param led
	 * @param wooden
	 * @param fourlegged
	 * @param rect
	 */
	public Room(Lights led, Chairs wooden, Table fourlegged, Window rect) {
		
		this.led = led;
		this.wooden = wooden;
		this.fourlegged = fourlegged;
		this.rect = rect;
	}
	
	public void BlinkLights(){
		
		for(int i=0; i<6; i++){
		 led.LightsOn();
		 led.LightsOff();
		}
		
	}
	
	public Lights getLed() {
		return led;
	}

	public Chairs getWooden() {
		return wooden;
	}

	public Table getFourlegged() {
		return fourlegged;
	}

	public Window getRect() {
		return rect;
	}
	
	
	
	
	

}
