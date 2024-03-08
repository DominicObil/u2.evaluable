package ev2.examen;

public class Montura {
	
	public String marca;
	enum Material{
		PASTA, METAL
		
	}
	
	public Material material;
	public String color;
	
	Montura (String marca, Material material, String color){
		
		this.marca = marca;
		this.material= material;
		this.color= color;
		
		
	}
	
	
	

}
