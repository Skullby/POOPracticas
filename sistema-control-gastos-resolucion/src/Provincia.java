import java.util.ArrayList;
import java.util.Arrays;

public class Provincia {
    private String nombre;
    private Ciudad[] ciudades;

    public Provincia(String nombre, Ciudad[] ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }

   public boolean condicionDeficitaria(){
        int acc = 0;
        for(int i = 0; i < ciudades.length; i++){
            if(ciudades[i].esDeficitaria()){
                acc++;
            }
        }
        return acc > ciudades.length/2;
   }

   public ArrayList<Ciudad> getCiudadesGastanMasQueRecaudan(){
        ArrayList<Ciudad> ciudadesGastan = new ArrayList();
        for(int i = 0; i < ciudades.length; i++){
            if(ciudades[i].esDeficitaria()){
                ciudadesGastan.add(ciudades[i]);
            }
        }
        return ciudadesGastan;
   }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
               // ", ciudades=" + Arrays.toString(ciudades) +
                '}';
    }
}
