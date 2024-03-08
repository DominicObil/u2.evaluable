package ev2.examen;

public class GafaGraduada extends Gafa implements Promocion {
	
	

	
	GafaGraduada(Montura montura, Lente lente, Double coste, Double precio){
		super(montura, lente, coste, precio);
		
	
	}
		
		public double aplicaDescuento() {
			double descuento ;
			
			descuento = coste * 0.20;
			
			return descuento;
			
			
			
			
		}
			
		
		
   

		
		
		
		
		
		
		
	}

