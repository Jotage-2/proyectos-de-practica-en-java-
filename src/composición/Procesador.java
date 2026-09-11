package composición;

public class Procesador {
    private String marca;
    private String modelo;
    private int nuleos;
    private boolean encendido;
    private double frecuencia;

    public Procesador(String marca, String modelo, int nuleos, double frecuencia) {
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.modelo = modelo;
        this.nuleos = nuleos;
        this.encendido = false;
    }

    public boolean encender (){
        if (encendido) {
            System.out.println("El procesador ya está encendido");
            return false;
        }
        encendido = true;
        return encendido;
    }

    public boolean apagar (){
        if (encendido) {
            encendido = false;
            System.out.println("El procesador ahora está apagado");
            return true;
        }else{
            System.out.println("el procesador ya estaba apagado");
            return false;
        }
        
    }

    public void isEncendido(){
        if (encendido) {
            System.out.println("El procesador está encendido");
        }else{
            System.out.println("el procesador no está encendido");
        }
    }

    public void mostrarInfo(){
        System.out.println("La marca del procesador es: " + marca);
        System.out.println("La frecuencia del procesador es: " + frecuencia);
        System.out.println("el numero de nucleos del procesador es: " + nuleos);
        System.out.println("El modelo del procesador es: " + modelo);

    }

    
}
