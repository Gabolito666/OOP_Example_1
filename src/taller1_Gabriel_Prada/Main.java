package taller1_Gabriel_Prada;
public class Main {
    public static void main(String[] args) {
        //Crear persona
        Persona persona1 = new Persona(12345678, 'M', "Gabriel", "Prada");
        //System.out.println("Informacion de la persona: " + persona1.informacionPersona());

        //Crear cliente
        Cliente cliente1 = new Cliente(87654321, 'F', "Maria", "Lopez", "prueba@test.com", 3001234567L);
        //System.out.println("Informacion del cliente: " + cliente1.informacionCliente());

        Cliente cliente2 = new Cliente(11223344, 'M', "Juan", "Perez", "pepito@perez.com", 3007654321L);
        //System.out.println("Informacion del cliente: " + cliente2.informacionCliente());

        //crear llanta
        Llanta llanta1 = new Llanta("Goodyear", 250, 60, 195);
        //System.out.println("Informacion de la llanta: " + llanta1.informacionLlanta());

        //Crear vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", "FWD", (byte)4);
        vehiculo1.agregarLlanta(new Llanta("Michelin", 205, 60 ,16));
        vehiculo1.agregarLlanta(new Llanta("Michelin", 205, 60 ,16));
        vehiculo1.agregarLlanta(new Llanta("Michelin", 205, 60 ,16));
        vehiculo1.agregarLlanta(new Llanta("Michelin", 205, 60 ,16));
        //System.out.println("Informacion del vehiculo: " + vehiculo1.informacionVehiculo());

        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", "FWD", (byte)4);
        vehiculo2.agregarLlanta(new Llanta("Pirelli", 215, 55 ,17));
        vehiculo2.agregarLlanta(new Llanta("Pirelli", 215, 55 ,17));
        vehiculo2.agregarLlanta(new Llanta("Pirelli", 215, 55 ,17));
        vehiculo2.agregarLlanta(new Llanta("Pirelli", 215, 55 ,17));
        //System.out.println("Informacion del vehiculo: " + vehiculo2.informacionVehiculo());

        Vehiculo vehiculo3 = new Vehiculo("Ford", "Mustang", "RWD", (byte)4);
        vehiculo3.agregarLlanta(new Llanta("Bridgestone", 255, 40 ,18));
        vehiculo3.agregarLlanta(new Llanta("Bridgestone", 255, 40 ,18));
        vehiculo3.agregarLlanta(new Llanta("Bridgestone", 255, 40 ,18));
        vehiculo3.agregarLlanta(new Llanta("Bridgestone", 255, 40 ,18));
        //System.out.println("Informacion del vehiculo: " + vehiculo3.informacionVehiculo());

        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Camaro", "RWD", (byte)4);
        vehiculo4.agregarLlanta(new Llanta("Continental", 265, 35 ,19));
        vehiculo4.agregarLlanta(new Llanta("Continental", 265, 35 ,19));
        vehiculo4.agregarLlanta(new Llanta("Continental", 265, 35 ,19));
        vehiculo4.agregarLlanta(new Llanta("Continental", 265, 35 ,19));
        //System.out.println("Informacion del vehiculo: " + vehiculo4.informacionVehiculo());

        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Altima", "FWD", (byte)4);
        vehiculo5.agregarLlanta(new Llanta("Hankook", 225, 50 ,17));
        vehiculo5.agregarLlanta(new Llanta("Hankook", 225, 50 ,17));
        vehiculo5.agregarLlanta(new Llanta("Hankook", 225, 50 ,17));
        vehiculo5.agregarLlanta(new Llanta("Hankook", 225, 50 ,17));
        //System.out.println("Informacion del vehiculo: " + vehiculo5.informacionVehiculo());

        Vehiculo vehiculo6 = new Vehiculo("Volkswagen", "Jetta", "FWD", (byte)4);
        vehiculo6.agregarLlanta(new Llanta("Dunlop", 215, 55 ,16));
        vehiculo6.agregarLlanta(new Llanta("Dunlop", 215, 55 ,16));
        vehiculo6.agregarLlanta(new Llanta("Dunlop", 215, 55 ,16));
        vehiculo6.agregarLlanta(new Llanta("Dunlop", 215, 55 ,16));

        //Crear posibles clientes
        PosiblesClientes posiblesClientes = new PosiblesClientes((short)10);
        posiblesClientes.incluirPosibleCiente(cliente1, vehiculo1);
        posiblesClientes.incluirPosibleCiente(cliente2, vehiculo2);
        posiblesClientes.incluirPosibleCiente(new Cliente(55667788, 'F', "Ana", "Gomez", "trust@trust.com", 3001122334L), vehiculo3);
        posiblesClientes.incluirPosibleCiente(new Cliente(99887766, 'M', "Luis", "Martinez", "paquito@paco.com", 3004433221L), vehiculo4);
        posiblesClientes.incluirPosibleCiente(new Cliente(33445566, 'F', "Carla", "Ramirez", "high@expirience.com", 3005566778L), vehiculo5);
        posiblesClientes.incluirPosibleCiente(new Cliente(66778899, 'M', "Diego", "Sanchez", "Joker@batman.com", 3009988776L), vehiculo6);
        System.out.println("\nInformacion de los posibles clientes:");
        posiblesClientes.informacionPosiblesClientes();

        //como en el enunciado pide que se haga el llamado y se muestre la informacion como en la figura
        //Y, teniendo en cuenta que en el diagrama no se menciona a ninguna otra clase como Scanner o JOptionPane
        //se entiende que el llamado y la impresion de la informacion debe hacerse en la clase Main
        //por lo tanto lo dejo en la consola y no en una interfaz grafica.
    }
}