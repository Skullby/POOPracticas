import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private Provincia[] provincias;


    public Pais(String nombre, Provincia[] provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }

    public ArrayList<Provincia> provinciasConDeficit(){
        ArrayList<Provincia> provinciasConDefict = new ArrayList<>();
        for (int i = 0; i < provincias.length; i++) {
            if(provincias[i].condicionDeficitaria()){
                provinciasConDefict.add(provincias[i]);
            }
        }
        return provinciasConDefict;
    }

    public ArrayList<Ciudad> cuidadesGastanMasQueRecaudad(){
        ArrayList<Ciudad> cuidadesGastanMasQueRecaudad = new ArrayList<>();
        for (int i = 0; i < provincias.length; i++) {
            cuidadesGastanMasQueRecaudad.addAll(provincias[i].getCiudadesGastanMasQueRecaudan());
        }
        return cuidadesGastanMasQueRecaudad;
    }

}
