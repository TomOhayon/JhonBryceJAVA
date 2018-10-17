package class17102018;

public class App {

	public static void main(String[] args) {
		Recive R[] = new Recive[8];
		for (int i = 0; i < R.length; i++) {
			R[i] = new Recive(Math.random() * 700 + 100);
		}
		for (int i = 0; i < R.length; i++) {
			System.out.println("Recive number "+(i+1)+":");
			System.out.println(R[i].getPrice());
			System.out.println(R[i].getSerial());
		}
	}
	

}
