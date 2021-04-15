package Quiz1;

import java.util.Scanner;

public class SmartGadget {
	String brand;
	String model;
	String operatingSys;
	int year;
	double price;
	
	Scanner in = new Scanner(System.in);
	
	//create setter method
	public void setBrand() {
		System.out.println("Enter the brand name: ");
		this.brand = in.next();
	}
	
	public void setModel() {
		System.out.println("Enter the model of the gadget: ");
		this.model = in.next();
	}
	
	public void setOS() {
		System.out.println("Enter the type of operating system of the gadget: ");
		this.operatingSys = in.next();
	}
	
	public void setYear() {
		System.out.println("Enter the released year of the gadget: ");
		this.year = in.nextInt();
	}
	
	public void setPrice() {
		System.out.println("Enter the current price of the gadget: ");
		this.price = in.nextInt();
	}
	
	//create getter method
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getOS() {
		return this.operatingSys;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
}
