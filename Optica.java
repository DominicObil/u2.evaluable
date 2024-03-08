package ev2.examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Optica { 
    
    private List<Gafa> gafas = new ArrayList<>();
    private Map<Proveedor, List<GafaSol>> mapa_gafas = new HashMap<>();
    
    public void addGafa(String tipo, Gafa gafa) {
        gafas.add(gafa);
     
        }
    
    
    public int cuantasGafas() {
        return gafas.size();
    }
    
    public void dimeTipoLente() {
        for (Gafa gafa : gafas) {
            if (gafa.lente instanceof Lente) {
                System.out.println("Tipo de lente: Graduada");
            } else if (gafa.lente instanceof Lente ) {
                System.out.println("Tipo de lente: No Graduada");
            }
        }
    }
    
    public void delGafa(Gafa gafa) {
        gafas.remove(gafa);
    }
    
   
    
    public void gafasByProveedor() {
        for (Proveedor proveedor : mapa_gafas.keySet()) {
            System.out.println("Proveedor: " + proveedor);
            for (GafaSol gafaSol : mapa_gafas.get(proveedor)) {
                System.out.println("Gafa de sol: " + gafaSol);
            }
        }
    }
    
    public double costeGafasByTipo(String tipo) {
        double costeTotal = 0;
        for (Gafa gafa : gafas) {
            if (gafa instanceof GafaSol && tipo.equals("SOL")) {
                costeTotal += gafa.coste;
            } else if (gafa instanceof GafaGraduada && tipo.equals("GRADUADA")) {
                costeTotal += gafa.coste;
            }
        }
        return costeTotal;
    }
    
    
}













