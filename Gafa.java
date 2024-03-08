package ev2.examen;

public class Gafa {
	
	public static int id = 0;

	public Montura montura; 
	public Lente lente;
	


	public Double coste;
	public Double precio;
	
	
	
	public Gafa(Montura montura, Lente lente, Double coste, Double precio) {
		
		this.montura = montura;
		this.lente = lente;
		this.coste = coste;
		this.precio = precio;
		
		
	}



	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Gafa.id = id;
	}



	public Montura getMontura() {
		return montura;
	}



	public void setMontura(Montura montura) {
		this.montura = montura;
	}



	public Lente getLente() {
		return lente;
	}



	public void setLente(Lente lente) {
		this.lente = lente;
	}



	public Double getCoste() {
		return coste;
	}



	public void setCoste(Double coste) {
		this.coste = coste;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}




	
	
	
	
	
	
	
	

	
	

}
