// Interfaz Trabajador
public interface Trabajador {
    void checarEntrada();
    void trabajar();
    void horaDeComida();
    void cobrar();
    void checarSalida();
}

// Clase Panadero
public class Panadero implements Trabajador {
    private String nombre;

    public Panadero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void checarEntrada() {
        System.out.println(nombre + " ha checado la entrada.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está horneando pan.");
    }

    @Override
    public void horaDeComida() {
        System.out.println(nombre + " está en la hora de comida.");
    }

    @Override
    public void cobrar() {
        System.out.println(nombre + " está cobrando por el pan.");
    }

    @Override
    public void checarSalida() {
        System.out.println(nombre + " ha checado la salida.");
    }
}

// Clase Soldado
public class Soldado implements Trabajador {
    private String nombre;

    public Soldado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void checarEntrada() {
        System.out.println(nombre + " ha checado la entrada.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está defendiendo la patria.");
    }

    @Override
    public void horaDeComida() {
        System.out.println(nombre + " está en la hora de comida.");
    }

    @Override
    public void cobrar() {
        System.out.println(nombre + " está recibiendo su paga.");
    }

    @Override
    public void checarSalida() {
        System.out.println(nombre + " ha checado la salida.");
    }
}

// Clase Constructor
public class Constructor implements Trabajador {
    private String nombre;

    public Constructor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void checarEntrada() {
        System.out.println(nombre + " ha checado la entrada.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está construyendo un edificio.");
    }

    @Override
    public void horaDeComida() {
        System.out.println(nombre + " está en la hora de comida.");
    }

    @Override
    public void cobrar() {
        System.out.println(nombre + " está cobrando por su trabajo.");
    }

    @Override
    public void checarSalida() {
        System.out.println(nombre + " ha checado la salida.");
    }
}

// Clase Jardinero
public class Jardinero implements Trabajador {
    private String nombre;

    public Jardinero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void checarEntrada() {
        System.out.println(nombre + " ha checado la entrada.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está cuidando el jardín.");
    }

    @Override
    public void horaDeComida() {
        System.out.println(nombre + " está en la hora de comida.");
    }

    @Override
    public void cobrar() {
        System.out.println(nombre + " está cobrando por su trabajo.");
    }

    @Override
    public void checarSalida() {
        System.out.println(nombre + " ha checado la salida.");
    }
}

// Clase Comerciante
public class Comerciante implements Trabajador {
    private String nombre;

    public Comerciante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void checarEntrada() {
        System.out.println(nombre + " ha checado la entrada.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está vendiendo productos.");
    }

    @Override
    public void horaDeComida() {
        System.out.println(nombre + " está en la hora de comida.");
    }

    @Override
    public void cobrar() {
        System.out.println(nombre + " está cobrando a los clientes.");
    }

    @Override
    public void checarSalida() {
        System.out.println(nombre + " ha checado la salida.");
    }
}

// Clase principal para probar las clases anteriores
public class Main {
    public static void main(String[] args) {
        Trabajador panadero = new Panadero("Ana");
        Trabajador soldado = new Soldado("Carlos");
        Trabajador constructor = new Constructor("Pedro");
        Trabajador jardinero = new Jardinero("Luis");
        Trabajador comerciante = new Comerciante("Maria");

        Trabajador[] trabajadores = {panadero, soldado, constructor, jardinero, comerciante};

        for (Trabajador trabajador : trabajadores) {
            trabajador.checarEntrada();
            trabajador.trabajar();
            trabajador.horaDeComida();
            trabajador.cobrar();
            trabajador.checarSalida();
            System.out.println();
        }
    }
}
