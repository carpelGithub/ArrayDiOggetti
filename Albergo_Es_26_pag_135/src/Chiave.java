public class Chiave 
{
	private int num_camera;
	private String nome_cliente;
	
	public Chiave (int num_camera, String nome_cliente)
	{
		this.num_camera = num_camera;
		this.nome_cliente = nome_cliente;
	}
	
	public Chiave () {}
	
	public Chiave (Chiave c)
	{
		num_camera = c.getNum_camera();
		nome_cliente = c.getNome_cliente();
	}

	public int getNum_camera() {
		return num_camera;
	}

	public void setNum_camera(int num_camera) {
		this.num_camera = num_camera;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	
}

