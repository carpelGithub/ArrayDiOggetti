import java.util.Scanner;

public class Albergo {
	
	public static void main (String[] args) {
		int numStanze = 4;
		Scanner s = new Scanner(System.in);
		Portachiavi p = new Portachiavi(numStanze);
		
		Chiave c;
		int scelta = 0;
		
		// inizializzazione del portachiavi
		for(int i = 0; i<numStanze; i++) {
			c= new Chiave();
			System.out.println("nome cliente");
			c.setNome_cliente(s.next());
			System.out.println("numero camera");
			c.setNum_camera(s.nextInt());
			p.setPortachiaviPos(c, i);
			
			}
		System.out.println("PORTIERE:");
		System.out.println("Buongiorno cosa desidera fare?");
		System.out.println("Ritirare la chiave (0)");
		System.out.println("Restituire la chiave (1)");
		scelta = s.nextInt();
		
		if(scelta == 0) {
			System.out.println("Inserisci numero camera");
			System.out.println(p.ritiraChiave(s.nextInt()).toString());
			
		}else {
			c= new Chiave();
			System.out.println("Inserisci il tuo nome");
			
			c.setNome_cliente(s.next());
			System.out.println("Inserisci numero camera");
			
			c.setNum_camera(s.nextInt());
			p.lasciaChiave(c);
			System.out.println("chiave restituita");
			
		}
	 s.close();
	}
	
		
	
	}


