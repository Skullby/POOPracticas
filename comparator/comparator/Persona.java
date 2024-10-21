package comparator;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private int age;

    Persona(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "comparator.Persona{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                '}';
    }
}
