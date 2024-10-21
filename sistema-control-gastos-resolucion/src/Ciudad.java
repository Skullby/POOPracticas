public class Ciudad {

    public static final int HABITANTES = 100000;

    private float gastosRealizados;
    private int habitantes;
    private Impuesto[] impuestos;
    private String nombre;

    public Ciudad(float gastosRealizados, int habitantes, Impuesto[] impuestos, String nombre) {
        this.gastosRealizados = gastosRealizados;
        this.habitantes = habitantes;
        this.impuestos = impuestos;
        this.nombre = nombre;
    }

    private float totalRecaudado(){
        float sum = 0;
        for (Impuesto impuesto : impuestos) {
            sum += impuesto.getMonto();
        }
        return sum;
    }

    public boolean esDeficitaria(){
        if (habitantes > HABITANTES)    {
            return gastosRealizados > totalRecaudado();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }



}
