//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Sistema de Control de Gastos Públicos
     * Un país tiene que controlar el gasto público de las ciudades con más de 100.000 habitantes. Para ello,
     * tiene información del monto recaudado por cada ciudad a través de cinco diferentes tipos de impuestos
     * (denominados, aquí, de imp1, imp2, imp3, imp4 e imp5) e información acerca de gastos realizados en
     * mantenimiento de la ciudad. Este país necesita un sistema que le informe cuáles son las ciudades que
     * gastan más de lo que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
     * de déficit.
     * Consejo: Tener en cuenta la información que contienen los distintos impuestos Extra: ¿En qué
     * afecta el tamaño de la ciudad?
     *
     *
     */

    public static void main(String[] args) {
            Impuesto i1 = new Impuesto(5,"imp1");
            Impuesto i2 = new Impuesto(5,"imp2");
            Impuesto i3 = new Impuesto(5,"imp3");
            Impuesto i4 = new Impuesto(5,"imp4");
            Impuesto i5 = new Impuesto(5,"imp5");

            Impuesto[] impuestos1 = {i1};
            Impuesto[] impuestos2 = {i2, i3, i4, i5};

            Ciudad c1 = new Ciudad(10, 1200000, impuestos1, "MDP");
            Ciudad c4 = new Ciudad(10, 1200000, impuestos1, "Bolivar");
            Ciudad c5 = new Ciudad(10, 1200000, impuestos1, "Bahia Blanca");
            Ciudad c2 = new Ciudad(10, 10000, impuestos1, "Azul");
            Ciudad c3 = new Ciudad(10, 1200000, impuestos2, "Olavarria");
            Ciudad[] ciudades = {c1, c2, c3, c4, c5};
            Provincia p1 = new Provincia("Buenos Aires", ciudades);

            Ciudad c6 = new Ciudad(10, 1200000, impuestos2, "Santa Fe");
            Ciudad c7 = new Ciudad(10, 1200000, impuestos2, "Rosario");
            Ciudad[] ciudades2 = {c6, c7};
            Provincia p2 = new Provincia("Santa Fe", ciudades2);

            Provincia[] provincias = {p1, p2};

            Pais pais = new Pais("Argentina", provincias);

            System.out.println(pais.cuidadesGastanMasQueRecaudad());

            System.out.println(pais.provinciasConDeficit());



    }
}