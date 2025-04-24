import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos un objeto Scanner para el inicio
        Scanner requisitos=new Scanner(System.in);

        System.out.println("---------------------!VEAMOS SI ERES APTO¡--------------------");
        System.out.println("Ingresa tus datos");
        //lee una linea de texto con nextline()
        System.out.println("Nombre: ");
        String nombre=requisitos.nextLine();
        //Se lee un dato tipo entero
        System.out.println("Edad: ");
        int edad=requisitos.nextInt();
        //Se lee un dato tipo double
        System.out.println("Altura: ");
        double altura=requisitos.nextDouble();

        //Se usa la sentencia if para condicionar dos tipos de datos
        if (edad>18 & altura>1.60){
            System.out.println("¡FELICIDADES! "+nombre+" HAZ SIDO ACEPTAD@ PARA EL EQUIPO");
        }
        //Si no se cumplen las condiciones se muestra un mensaje diferente
        else {
            System.out.println("No cumple los requisitos");
        }
        //Se cierra el objeto Scanner
        requisitos.close();
    }
}