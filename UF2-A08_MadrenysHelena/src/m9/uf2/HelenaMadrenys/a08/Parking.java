package m9.uf2.HelenaMadrenys.a08;

public class Parking {
	private int pd=5;
	
	public int GetPD()	//Getter (no cal setter)
	{
		return pd;
	}
	
	public synchronized void Aparcar()
	{
		//Si no hi ha places disponibes, enviem missatge
		if (pd == 0)
		{
			System.out.println(Principal.Timer() + ": El pàrquin està ple.");
		}
		//Mentre continuï sense pds, parem el thread
		while (pd == 0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//Quan hi ha alguna plaça la ocupem
		pd--;
	}
	
	public synchronized void Marxar()
	{
		//Quan algú marxa afegim una pd i deixem passar el primer cotxe de la fila
		pd++;
		notify();
	}
}
