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
	public void setBrand(String brand) {
		System.out.println("Enter the brand name: ");
		brand = in.next();
	}
	
	public void setModel(String model) {
		System.out.println("Enter the model of the gadget: ");
		model = in.next();
	}
	
	public void setOS(String operatingSys) {
		System.out.println("Enter the type of operating system of the gadget: ");
		operatingSys = in.next();
	}
	
	public void setYear(int year) {
		System.out.println("Enter the released year of the gadget: ");
		year = in.nextInt();
	}
	
	public void setPrice(double price) {
		System.out.println("Enter the current price of the gadget: ");
		price = in.nextInt();
	}
	
	//create getter method
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getOS() {
		return operatingSys;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}
