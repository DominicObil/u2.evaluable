package ev2.examen;

public class GafaSol extends Gafa implements Promocion {
	
	public Proveedor proveedor;
	
	
	
	GafaSol(Montura montura, Lente lente, Double coste, Double precio){
		super(montura, lente, coste, precio);
		this.proveedor = proveedor;
		
		
		
		
		
		
	}



	public Proveedor getProveedor() {
		return proveedor;
	}



	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}




	
	public double aplicaDescuento() {
		double descuento ;
		
		descuento = coste * 0.25;
		
		return descuento;
		





	}
}
 
 
 
 
 
 
 
 


 
 
 
 
 
 