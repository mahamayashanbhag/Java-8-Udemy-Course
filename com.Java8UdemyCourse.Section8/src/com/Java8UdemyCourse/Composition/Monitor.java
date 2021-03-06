package com.Java8UdemyCourse.Composition;

/*
 * Monitor HAS Resolution, Monitor is not Resolution
 */

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution NativeRsolution;
	/**
	 * @param model
	 * @param manufacturer
	 * @param size
	 * @param nativeRsolution
	 */
	public Monitor(String model, String manufacturer, int size, Resolution nativeRsolution) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		NativeRsolution = nativeRsolution;
	}
	
	public static void drawPixel(int x , int y , String Color){
		System.out.println(" Drawing Pixel at "+ x + ","+y+" in color "+ Color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeRsolution() {
		return NativeRsolution;
	}

	

}
