package taller1_Gabriel_Prada;

// Clase Llanta
// Atributos - Propiedades - Caracteristicas

public class Llanta {

    protected String fabricante;

    private float alto;

    private float ancho;

    private float rin;

    // Metodos y funciones


    public Llanta() {
    }

    public Llanta(String fabricante, float alto, float ancho, float rin){
        this.fabricante = fabricante;
        this.alto = alto;
        this.ancho = ancho;
        this.rin = rin;
    }

    public String informacionLlanta(){
        String informacion = "Fabricante: " + fabricante + ", Alto: " + alto + ", Ancho: " + ancho + ", Rin: " + rin;
        return informacion;
    }
}
