public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.asignarFabricante("subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada( 2.5);
        subaru.asignarColor("Blanco");


        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");
        System.out.println("mazda.fabricante = " + mazda.leerFabricante());

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(300));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,75));

        System.out.println("Descripcion del auto nuevo " + subaru.descripcion("lion","Rojo","Nissan "));




    }
}
