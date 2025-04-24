public class Jugador {
    //Atributos de la clase jugador
    public String nombre, posicion;
    public int edad, numero;

    //Constructor para inicializar los atributos
    public Jugador(String nombre, String posicion, int edad, int numero){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad=edad;
        this.numero=numero;
    }

    //Metodo
    public void informar(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Posicion: "+ posicion);
        System.out.println("Edad: "+ edad);
        System.out.println("Numero: "+ numero+"\n");
        System.out.println("----------------------------");
    }
}
