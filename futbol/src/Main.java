import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------INGRESA DATOS E INFORMATE DE TU JUGADOR FAVORITO--------");
        System.out.println();
        //Se usa Scanner para obtener los datos por parte del usuario
        Scanner jugador1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer jugador: ");
        String nombre1 = jugador1.nextLine();
        System.out.println("Ingrese la posicion que ocupa en la cancha: ");
        String poscion1 = jugador1.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad1 = jugador1.nextInt();
        System.out.println("Ingrese el numero: ");
        int numero1 = jugador1.nextInt();

        //Primer objeto ingresado por consola
        Jugador jugador_uno = new Jugador(nombre1, poscion1, edad1, numero1);

        System.out.println("----------------------------------------");
        System.out.println();

        //Leer los datos del segundo jugador por consola
        Scanner jugador2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del segundo jugador: ");
        String nombre2 = jugador2.nextLine();
        System.out.println("Ingrese la posicion que ocupa en la cancha: ");
        String poscion2 = jugador2.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad2 = jugador2.nextInt();
        System.out.println("Ingrese el numero: ");
        int numero2 = jugador2.nextInt();

        //Segundo objeto ingresado por consola
        Jugador jugador_dos =new Jugador(nombre2,poscion2,edad2,numero2);

        //Este objeto ha sido quemado
        Jugador jugador3 = new Jugador("Daniel Jacome","Delantero", 20, 9);

        // Llamar al método informar para los tres objetos y asi mostrar la informacion en la consola
        System.out.println();
        System.out.println("------------INFORMACION------------");
        System.out.println();
        jugador_uno.informar();
        jugador_dos.informar();
        jugador3.informar();
    }
}