package ev2.examen;

public class Lente {
	
	
	enum TipoProblema{
		ASTIGMATISMO, MIOPIA, HIPERMETROPIA
		
	}
	public TipoProblema tipo;
	public Double grado;
	enum Color{
		
		VERDE,MARRON, GRIS
	}
	
	
	public Color color;
	public String posicion;
	
	
	
	
	
	
	
	public Lente(TipoProblema tipo, Double grado, String posicion) {
	
		this.tipo = tipo;
		this.grado = grado;
		this.posicion = posicion;
	}



	public Lente(Color color, String posicion) {
	
		this.color = color;
		this.posicion = posicion;
	}
	
	
	
	
	
	
	

}
