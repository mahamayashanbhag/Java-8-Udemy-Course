package com.Java8UdemyCourse.Section8.PolymorphismChallenge;

 public class Cars {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	/**
	 * @param cylinders
	 * @param name
	 */
	public Cars(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels=4;
		this.engine=true;
	}
	public int getCylinders() {
		return cylinders;
	}
	public String getName() {
		return name;
	}
	
	public String startEngine(){
		return "Car -> startEngine()";
	}
	
	public  String accelerate(){
		return "Car -> accelerate()";
	}
	
	public  String brake(){
		return "Car -> brake()";
	}
	
 
	
	
	}
	
	
	
