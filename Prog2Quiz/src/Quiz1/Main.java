package Quiz1;

public class Main {

	public static void main(String[] args) {
		SmartGadget iphone = new SmartGadget();
		
		iphone.setBrand();
		iphone.setModel();
		iphone.setOS();
		iphone.setYear();
		iphone.setPrice();
		
		System.out.println(" ******* IPHONE ******* ");
		System.out.println("The brand is: " +iphone.getBrand());
		System.out.println("The model is: " +iphone.getModel());
		System.out.println("The operating system is: " +iphone.getOS());
		System.out.println("The released year is: " +iphone.getYear());
		System.out.println("The price is: " +iphone.getPrice());
	
		
		
		
		
	}

}
