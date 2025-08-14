public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    public String leerFabricante(){
        return fabricante;
    }
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return modelo;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public String leerColor(){
        return color;
    }
    public void asignarColor(String color){
        this.color = color;
    }

    public double leerCilindrada(){
        return cilindrada;
    }
    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int leerCapacidadTanque(){
        return capacidadTanque;
    }

    public void asignarCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }
    public String verDetalle () {
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm) {
        return "el auto " + fabricante + "acelerando a " + rpm +"rpm";
    }

    public String frenar(){
        return fabricante + " " + this.modelo + "frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km,float porcentajeBencina){
        return km/(porcentajeBencina*capacidadTanque);
    }

    public int calcularConsumo(int km,int porcentajeBencina){
        return km/(porcentajeBencina*capacidadTanque/100);
    }
    public String descripcion(String modelo,String color,String fabricante){
        return modelo+color+fabricante;
    }


}
