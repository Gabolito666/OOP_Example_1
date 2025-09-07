package taller1_Gabriel_Prada;

public class Cliente extends Persona {

    //Atributos - Propiedades - Caracteristicas

    protected String email;
    private long numCelular;

    //Metodos y Funciones


    public Cliente() {
    }

    public Cliente(int cc, char genero, String nombre, String apellido, String email, long numCelular) {
        super(cc, genero, nombre, apellido);
        this.email = email;
        this.numCelular = numCelular;
    }

    public String informacionCliente(){
        String informacion = super.informacionPersona() + ", Email: " + email + ", Celular: " + numCelular;
        return informacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(long numCelular) {
        this.numCelular = numCelular;
    }
}