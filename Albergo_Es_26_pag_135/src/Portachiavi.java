public class Portachiavi 
{
	Chiave portachiavi [];
	
	public Portachiavi (int k)
	{
		portachiavi = new Chiave[k];
	}
	
	public Chiave[] getPortachiavi() {
		return portachiavi;
	}

	public void setPortachiavi(Chiave[] portachiavi) {
		this.portachiavi = portachiavi;
	}
	
	public void setPortachiaviPos(Chiave key, int pos) {
		this.portachiavi[pos] = key;
	}

	public void lasciaChiave (Chiave c)
	{
		for (int k=0; k<portachiavi.length; k++)
			if(portachiavi[k] == null)
				portachiavi [k] = c;
	}
	
	public Chiave ritiraChiave (String nome)
	{
		for (int k=0; k<portachiavi.length; k++)
			if(nome.equals (portachiavi [k].getNome_cliente()))
				return portachiavi [k];			
		
		System.out.println("Chiave non trovata");
		return new Chiave ();
	}
	
	public Chiave ritiraChiave (int num_camera)
	{
		for (int k=0; k<portachiavi.length; k++)
			if(num_camera == portachiavi [k].getNum_camera())
				return portachiavi [k];			
		
		System.out.println("Chiave non trovata");
		return new Chiave ();
	}
	
}
