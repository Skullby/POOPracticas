package comparator;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("A", 12);
        Persona p2 = new Persona("B", 15   );
        Persona p3 = new Persona("C", 22);
        Persona p4 = new Persona("D", 25);
        Persona p5 = new Persona("E", 26);
        Persona p6 = new Persona("F", 1);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);

        System.out.println(personas);

        personas.sort(Persona::compareTo);

        System.out.println(personas);

        NameCompator nameCompator = new NameCompator();

        personas.sort(nameCompator);

        System.out.println(personas);

        PesoComparator pesoComparator = new PesoComparator();

        personas.sort(pesoComparator);


        personas.sort(pesoComparator);

        personas.sort(nameCompator);

    }
}