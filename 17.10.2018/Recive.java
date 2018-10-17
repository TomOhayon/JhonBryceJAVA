package class17102018;

public class Recive {
	public static int counter=0;
	public final int serial;
	public final double price;
	
	public Recive(double price) {
		super();
		this.price = price;
		Recive.counter++;
		this.serial = Recive.counter+1000;

	}
	
	public int getSerial() {
		return serial;
	}
	public double getPrice() {
		return price;
	}

}
