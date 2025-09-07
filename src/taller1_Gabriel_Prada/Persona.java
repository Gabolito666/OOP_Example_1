package taller1_Gabriel_Prada;

// Base class representing a person

public class Persona {

    private int cc;
    private char genero;
    private String nombre;
    private String apellido;

    // You can add constructors and methods here as needed

    public Persona() {
    }

    public Persona(int cc, char genero, String nombre, String apellido) {
        this.cc = cc;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String informacionPersona() {
        return "Nombre: " + nombre + " " + apellido + ", CC: " + cc + ", Genero: " + genero;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}