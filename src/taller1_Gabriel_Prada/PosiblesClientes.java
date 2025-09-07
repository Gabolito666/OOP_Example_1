package taller1_Gabriel_Prada;

// Clase PosiblesClientes
// Atributos - Propiedades - Caracteristicas

public class PosiblesClientes {

    protected short cantPosiblesClientes;

    private Cliente listaCleintes [];

    private Vehiculo listaVehiculos [];

    //Metodos o Funciones


    public PosiblesClientes(short maxcantPosiblesClientes) {
        this.cantPosiblesClientes = 0;
        this.listaCleintes = new Cliente[maxcantPosiblesClientes];
        this.listaVehiculos = new Vehiculo[maxcantPosiblesClientes];
    }

    public void incluirPosibleCiente(Cliente cliente, Vehiculo vehiculo){
        if(this.cantPosiblesClientes < this.listaCleintes.length){
            this.listaCleintes[this.cantPosiblesClientes] = cliente;
            this.listaVehiculos[this.cantPosiblesClientes] = vehiculo;
            this.cantPosiblesClientes++;
        } else {
            System.out.println("No se pueden agregar más posibles clientes.");
        }
    }

    public void informacionPosiblesClientes(){
        for(int i = 0; i < this.cantPosiblesClientes; i++){
            System.out.println("Posible Cliente " + (i + 1) + ":");
            System.out.println(this.listaCleintes[i].informacionCliente());
            System.out.println(this.listaVehiculos[i].informacionVehiculo());
            System.out.println("---------------------------");
        }
    }
}
