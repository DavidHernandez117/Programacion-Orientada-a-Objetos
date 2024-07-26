// Clase Persona
public class Persona {
    private String nombre;
    private double altura;
    private int edad;
    private double sueldo;
    private boolean trabajando;

    public Persona(String nombre, double altura, int edad, double sueldo, boolean trabajando) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.sueldo = sueldo;
        this.trabajando = trabajando;
    }

    public String trabajo() {
        return "Método trabajo debe ser sobrecargado en las subclases";
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Altura: %.2fm, Edad: %d, Sueldo: %.2f, Trabajando: %s",
                nombre, altura, edad, sueldo, trabajando ? "Sí" : "No");
    }
}

// Clase Soldado
public class Soldado extends Persona {
    private String rango;

    public Soldado(String nombre, double altura, int edad, double sueldo, String rango, boolean trabajando) {
        super(nombre, altura, edad, sueldo, trabajando);
        this.rango = rango;
    }

    @Override
    public String trabajo() {
        return String.format("%s es un soldado de rango %s y está defendiendo la patria.", super.toString(), rango);
    }
}

// Clase Panadero
public class Panadero extends Persona {
    private String especialidad;

    public Panadero(String nombre, double altura, int edad, double sueldo, String especialidad, boolean trabajando) {
        super(nombre, altura, edad, sueldo, trabajando);
        this.especialidad = especialidad;
    }

    @Override
    public String trabajo() {
        return String.format("%s es un panadero y está horneando %s.", super.toString(), especialidad);
    }
}

// Clase principal para probar las clases anteriores
public class Main {
    public static void main(String[] args) {
        Soldado soldado = new Soldado("Carlos", 1.80, 30, 3000, "Capitán", true);
        Panadero panadero = new Panadero("Ana", 1.65, 28, 2000, "pan integral", true);

        System.out.println(soldado.trabajo());
        System.out.println(soldado);

        System.out.println(panadero.trabajo());
        System.out.println(panadero);
    }
}
