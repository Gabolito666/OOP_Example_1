package taller1_Gabriel_Prada;

// Clase Vehiculo
// Atributos - Propiedades - Caracteristicas

public class Vehiculo {

    private String marca;

    private String modelo;

    String traccionDelTra;

    protected byte cantLlantas;

    protected Llanta llantas[];

    //Metodos y Funciones


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String traccionDelTra, byte maxCantLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.traccionDelTra = traccionDelTra;
        this.llantas = new Llanta[maxCantLlantas];
    }

    public void agregarLlanta(Llanta llanta){
        if(this.cantLlantas < this.llantas.length){
            this.llantas[this.cantLlantas] = llanta;
            this.cantLlantas++;
        } else {
            System.out.println("No se pueden agregar más llantas.");
        }
    }

    public String informacionVehiculo(){
        String informacion = "Marca: " + marca + ", Modelo: " + modelo + ", Traccion: " + traccionDelTra + ", Cantidad de Llantas: " + cantLlantas + "\n";
        for(int i = 0; i < cantLlantas; i++){
            informacion += "  Llanta " + (i + 1) + ": " + llantas[i].informacionLlanta() + "\n";
        }
        return informacion;
    }
}
