package taller1_Gabriel_Prada;

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

    }

    public String informacionVehiculo(){
        String informacion = null;
        return informacion;
    }
}
