package m9.uf2.HelenaMadrenys.a08;

public class Cotxe extends Thread{
	private int matricula;
	private int random;
	private Parking parking;
	
	public Cotxe(int m, Parking pk)	//Constructor
	{
		matricula = m;
		parking = pk;
	}
	
	public void run()
	{
		//Entra a la ciutat
		System.out.println(Principal.Timer() + ": El cotxe " + matricula + " entra a la ciutat.");
		//Esperem entre 0 i 10 segons
		random = (int)(Math.random()*10000+1);
		try {
			Thread.sleep(random);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Estem aparcats
		System.out.println(Principal.Timer() + ": El cotxe " + matricula + " vol aparcar.");
		parking.Aparcar();
		System.out.println(Principal.Timer() + ": El cotxe " + matricula + " ha entrat al parking.");
		
		//Esperem entre 0 i 10 segons
		random = (int)(Math.random()*20000+1);
		try {
			Thread.sleep(random);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Marxem del parking
		parking.Marxar();
		System.out.println(Principal.Timer() + ": El cotxe " + matricula + " ha marxat del parking.");
		System.out.println(Principal.Timer() + ": Ha sorgit una plaça al pàrquing. Queden " + parking.GetPD() + " places disponibles.");
	}
}
