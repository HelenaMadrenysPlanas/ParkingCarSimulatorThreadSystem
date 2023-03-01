package m9.uf2.HelenaMadrenys.a08;

public class Principal {
	
	public static long startTime = System.currentTimeMillis();
	
	public static void main(String arg[]) throws InterruptedException {
		//Comencem el temps d'execució
		
		//Creem les classes nescessaries
		Parking parking = new Parking();
		Cotxe cotxe0 = new Cotxe(0, parking);
		Cotxe cotxe1 = new Cotxe(1, parking);
		Cotxe cotxe2 = new Cotxe(2, parking);
		Cotxe cotxe3 = new Cotxe(3, parking);
		Cotxe cotxe4 = new Cotxe(4, parking);
		Cotxe cotxe5 = new Cotxe(5, parking);
		Cotxe cotxe6 = new Cotxe(6, parking);
		Cotxe cotxe7 = new Cotxe(7, parking);
		Cotxe cotxe8 = new Cotxe(8, parking);
		Cotxe cotxe9 = new Cotxe(9, parking);
				
		//Iniciem els threads
		cotxe0.start();
		cotxe1.start();
		cotxe2.start();
		cotxe3.start();
		cotxe4.start();
		cotxe5.start();
		cotxe6.start();
		cotxe7.start();
		cotxe8.start();
		cotxe9.start();
	}
	
	static public long Timer()
	{
		long timer = (System.currentTimeMillis() - startTime);
		return timer;
	}
	
}
